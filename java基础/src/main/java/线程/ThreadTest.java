package 线程;

public class ThreadTest {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01("demo");
        demo01.start();

        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable,"runab");
        thread.start();

        for(int i=0;i<100;i++){
            System.out.println("main"+i);
        }



    }
}
