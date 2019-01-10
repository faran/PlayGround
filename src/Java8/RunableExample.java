package Java8;

public class RunableExample {

    public static void main (String[] args){

    Thread mythread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Print inside runnable");
        }
    });

    mythread.run();


    Thread myLambdaThread = new Thread(() -> System.out.println("Print inside lambda runnable"));
    myLambdaThread.run();

    }
}




