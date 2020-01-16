package 线程.线程安全问题.线程池;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyTest {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.submit(new MyRunnable());
        es.submit(new MyRunnable());
        es.submit(new MyRunnable());
        es.submit(new MyRunnable());
        es.submit(new MyRunnable());

        //一般不用
        es.shutdown();
    }
}
