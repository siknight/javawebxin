package io流.转换流;

import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class 转换流Test {
    @Test
    public  void test01() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\workspace\\javawebxin\\out\\prop.txt"), "gbk");

        osw.write("你好");
        osw.close();

    }

    @Test
    public  void test02() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("F:\\workspace\\javawebxin\\out\\prop.txt"), "gbk");
        BufferedReader br = new BufferedReader(inputStreamReader);
        String s = br.readLine();
        System.out.println(s);

    }
}
