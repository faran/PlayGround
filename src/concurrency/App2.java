package concurrency;
//implement via runnable interface and implementing run method
public class App2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            System.out.println(getClass());
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AppApp{

    public static void main(String[] args){
        Thread t1 = new Thread(new Runner());

        t1.start();

        Thread t2 = new Thread(new Runner());

        t2.start();
    }

}
