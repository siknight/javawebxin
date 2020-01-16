package io流.字节流;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("F:\\cc");
//        int read = fileInputStream.read();
//        System.out.println(read);
//        int read1 = fileInputStream.read();
//        System.out.println((char) read1);
        int str;
        while ((str=fileInputStream.read())!=-1){
            System.out.println((char) str);
        }

    }

    @Test
    public void test01() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("F:\\cc");
        byte[] bytes = new byte[2];
//        fileInputStream.read(bytes);
        int len;
        while ((len=fileInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
    }

    @Test
    public void copyTest() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("H:\\毕业答辩（127套）\\毕业答辩 (1).pptx");
        FileOutputStream fileOutputStream = new FileOutputStream("f:\\hehe2.pptx",true);

        byte[] bytes = new byte[1024];
        int len;
        while ((len=fileInputStream.read(bytes))!=-1){
            System.out.println(len);
            fileOutputStream.write(bytes,0,len);
//            fileOutputStream.write(len);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }

}
