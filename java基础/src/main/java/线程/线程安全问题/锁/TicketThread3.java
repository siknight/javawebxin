package 线程.线程安全问题.锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketThread3 implements Runnable{
    private  int ticket = 100;
    Lock lock=new ReentrantLock();

    @Override
    public void run() {

       saleticket();
    }


    public  void saleticket(){

        while (true){
            lock.lock();
                if(ticket>0) {

                    System.out.println(Thread.currentThread().getName() + "--" + ticket);
                    ticket--;
                }
                lock.unlock();
            }

        }

}
