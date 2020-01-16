package 线程.线程安全问题.方法;

import 线程.线程安全问题.TicketThread;

public class TicketTest2 {
    public static void main(String[] args) {
        TicketThread2 r2 = new TicketThread2();
        new Thread(r2).start();
        new Thread(r2).start();
        new Thread(r2).start();
    }
}
