package 线程.线程安全问题;

public class TicketThread  implements Runnable{
    private  int ticket = 100;

    Object o=new Object();
    @Override
    public void run() {
        while (true){
//            synchronized (o){
            synchronized (this){
                if(ticket>0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName() + "--" + ticket);
                    ticket--;
                }
            }

        }
    }
}
