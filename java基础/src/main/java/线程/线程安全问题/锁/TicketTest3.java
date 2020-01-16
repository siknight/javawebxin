package 线程.线程安全问题.锁;

import 线程.线程安全问题.方法.TicketThread2;

public class TicketTest3 {
    public static void main(String[] args) {
        TicketThread3 r3 = new TicketThread3();
        new Thread(r3).start();
        new Thread(r3).start();
        new Thread(r3).start();
    }
}
