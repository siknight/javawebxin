package 线程.线程安全问题.线程池;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("线程名="+Thread.currentThread().getName()+",创建了一个新的线程");
    }
}
