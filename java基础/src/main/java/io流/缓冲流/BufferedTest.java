package io流.缓冲流;

import org.junit.Test;

import java.io.*;

public class BufferedTest {

    @Test
    public void test01(){
        try ( BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\workspace\\javawebxin\\out\\prop.txt"));){
            bos.write("aa".getBytes());
            bos.write("\r\n".getBytes());
            bos.write("bb".getBytes());
            bos.write("\r\n".getBytes());
            bos.write("cc".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test02() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\workspace\\javawebxin\\out\\prop.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes));
        }

        bis.close();
    }

    @Test
    public void test03() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\workspace\\javawebxin\\out\\prop.txt"));

        String str =null;
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }

        br.close();
    }

    @Test
    public void test04() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\workspace\\javawebxin\\out\\prop.txt"));

        bw.write("hahahhaha");
        bw.newLine();
        bw.write("bbbbbbbbbbb");
        bw.close();
    }

}
