package 数组jvm测试;

import org.junit.Test;

public class test01 {
    @Test
    public void test01(){
        int [] a= new int[3];
        System.out.println(a);
        int [] b=a; //b的地址和a一样
        System.out.println(b);
        b[1]=2;
        System.out.println(a[1]);

        b=null;  //只切断它本身，不会影响a
        System.out.println(b);
        System.out.println(a);

    }
}
