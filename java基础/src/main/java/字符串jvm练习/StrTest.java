package 字符串jvm练习;

import org.junit.Test;

import java.util.ArrayList;

public class StrTest {
    @Test
    public void test01(){
       String  str ="aa";
       String str02="aa";
        String str3 = new String("aa".getBytes());
        System.out.println(str==str02);
        System.out.println(str==str3);
        System.out.println(str.hashCode());
        str="bb";

        System.out.println(str.hashCode());
        System.out.println(str02.hashCode());

    }

    @Test
    public  void test02(){
        String str="abcde";
        System.out.println(str.substring(0));
        System.out.println(str.substring(1));

    }

}
