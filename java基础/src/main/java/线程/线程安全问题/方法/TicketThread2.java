package 线程.线程安全问题.方法;

public class TicketThread2 implements Runnable{
    private  int ticket = 100;


    @Override
    public void run() {
       saleticket();
    }


    public synchronized  void saleticket(){
        while (true){
                if(ticket>0) {

                    System.out.println(Thread.currentThread().getName() + "--" + ticket);
                    ticket--;
                }
            }

        }

}
