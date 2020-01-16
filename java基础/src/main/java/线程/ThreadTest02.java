package 线程;

public class ThreadTest02 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<20;i++){
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            }
        };

        new Thread(runnable).start();


    }
}
