package 线程.线程安全问题;

public class TicketTest {
    public static void main(String[] args) {
        TicketThread r = new TicketThread();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
    }
}
