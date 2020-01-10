package 接口;

import org.junit.Test;

public class Jinshidun implements Usb {


    @Override
    public void eat() {
        System.out.println("eat ");
    }

    @Test
    public void test01(){
        Jinshidun jinshidun = new Jinshidun();
        jinshidun.eat();
        jinshidun.haha();
        Usb.staHeHe();
    }
}
