package 线程.线程安全问题.等待和唤醒;

import javafx.beans.property.adapter.ReadOnlyJavaBeanBooleanProperty;

public class WaitTest {
    public static void main(String[] args) {
        Object o=new Object();
        new Thread(){
            @Override
            public void run() {
                synchronized (o){
                    System.out.println("告诉老板我要的包子种类和数量");
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //唤醒之后执行的代码
                System.out.println("包子已经做好了,开吃!");
                System.out.println("------------");
            }
        }.start();


        new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println("花费5秒做包子");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o){
                    System.out.println("包子做好了 ，可以吃包子了。。。。");
                  // o.notify();//如果有多个等待线程,随机唤醒一个
                    o.notifyAll(); ////唤醒所有等待的线程
                }
            }
        }.start();
    }
}
