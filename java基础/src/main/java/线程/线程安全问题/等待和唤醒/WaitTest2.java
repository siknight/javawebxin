package 线程.线程安全问题.等待和唤醒;

public class WaitTest2 {
    public static void main(String[] args) {
        Object o=new Object();
        new Thread(){
            @Override
            public void run() {
                synchronized (o){
                    System.out.println("告诉老板我要的包子种类和数量");
                    try {
                        o.wait(5000); //5秒后就会被唤醒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //唤醒之后执行的代码
                System.out.println("包子已经做好了,开吃!");
                System.out.println("------------");
            }
        }.start();

    }
}
