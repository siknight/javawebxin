package io流.字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        //FileOutputStream没有该文件的话，文件会自动创建
        FileOutputStream fileOutputStream = new FileOutputStream("F:\\cc",true);
//        fileOutputStream.write(77);
//        fileOutputStream.write("hehe".getBytes());

        fileOutputStream.write("abcde".getBytes(),2,2);
        String [] str={"aa","bb","cc"};
        for(String str1:str){
            fileOutputStream.write(str1.getBytes());
            fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();

    }
}
