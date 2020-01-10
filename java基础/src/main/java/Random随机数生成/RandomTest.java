package Random随机数生成;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest {

    @Test
    public void test01(){
        Random random = new Random();

       for (int i=0;i<10;i++){
           int r = random.nextInt(10);  //生成0-9的数
           System.out.println(r);
       }
    }

    @Test
    public void test02(){
        //ArrayList其实就是一个可变长数组
        ArrayList<Integer> integers = new ArrayList<Integer>();
        System.out.println(integers);



    }

}
