package io流.字符流;

import org.junit.Test;

import java.io.*;

public class ReaderWriterTest {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("F:\\cc");
        char[] chars = new char[10];
        int len;
        while ((len=fileReader.read(chars))!=-1){
            System.out.println(chars);
        }
        System.out.println("---------");
        FileInputStream fis = new FileInputStream("F:\\cc");
        byte[] bytes = new byte[10];

        while ((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes));
        }
    }

    @Test
    public void test01() throws IOException {
        FileReader fileReader = new FileReader("F:\\cc");
        int len;
       while ((len=fileReader.read())!=-1){
           System.out.println((char) len);
        }
        System.out.println("---------");
        FileInputStream fis = new FileInputStream("F:\\cc");
        while ((len=fis.read())!=-1){
            System.out.println((char)len);
        }
    }

    @Test
    public void test02() throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\cc2");
        fos.write("黑马".getBytes());
        fos.close();
        System.out.println("----------");
        FileWriter fw = new FileWriter("F:\\cc3");
        fw.write("姜帝红你是大坏蛋");
        fw.close();
        FileWriter fw2 = new FileWriter("F:\\cc4");
        fw2.write("姜帝红".toCharArray());
        fw2.close();

    }
}
