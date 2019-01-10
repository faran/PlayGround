package concurrency;


public class App {

    public static void main(String[] args){
        Runner runner = new Runner();
        runner.start();

        Runner runner1 = new Runner();
        runner1.start();

    }
}

//implementation of concur by subclass of thread and implementing run method
class Runner extends Thread{

    public void run(){
        for (int i = 0; i<10; i++){
            System.out.println("Hello "+ getName());

            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}