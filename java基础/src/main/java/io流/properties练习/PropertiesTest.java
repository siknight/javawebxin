package io流.properties练习;

import org.junit.Test;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("li","思");
        properties.setProperty("jiang","帝红");
        Set<String> keys = properties.stringPropertyNames();
        for (String key :keys){
            System.out.println(properties.getProperty(key));
        }
        //字符流不会创建文件
        File file = new File("out/prop.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        properties.store(fw,"hehe");
        fw.close();
    }

   @Test
   public  void testRead() throws IOException {
       Properties properties = new Properties();
       File file = new File("F:\\workspace\\javawebxin\\out\\prop.txt");
       FileReader fileReader = new FileReader(file);
       properties.load(fileReader);
       Set<String> strset = properties.stringPropertyNames();
       for (String str:strset){
           System.out.println(str+"-->"+properties.getProperty(str));
       }
   }
}
