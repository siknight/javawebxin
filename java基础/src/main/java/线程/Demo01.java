package 线程;

public class Demo01  extends Thread{

    public Demo01(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(getName()+"nihao");
        }

    }
}
