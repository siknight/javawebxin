package io流.对象流;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

public class 对象流Test {

    @Test
    public void test01() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\workspace\\javawebxin\\out\\prop.txt"));
        ArrayList<String> al=( ArrayList<String>)ois.readObject();
        for (String str:al){
            System.out.println(str);
        }
    }

    @Test
    public void test02() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\workspace\\javawebxin\\out\\prop.txt"));
        ArrayList<String> list = new ArrayList<>();
        list.add("hehe");
        list.add("haha");
        oos.writeObject(list);
        oos.close();
    }
}
