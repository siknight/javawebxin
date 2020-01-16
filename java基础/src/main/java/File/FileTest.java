package File;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("H:\\java文件练习");
        System.out.println(file);
        File file01 = new File("H:", "java文件练习");
        System.out.println(file01);
        File parent = new File("H:");
        File file02 = new File(parent, "java文件练习");
        System.out.println(file02);
        System.out.println("----常用方法------");
        File file_new = new File("H:\\java文件练习\\people.json");
        System.out.println(file_new.getName());
        System.out.println(file_new.getAbsoluteFile());
        System.out.println(file_new.getPath());
        System.out.println(file_new.length());
        System.out.println("绝对路径");
        File file_new2 = new File("in/people.json");
        System.out.println(file_new2.getName());
        System.out.println(file_new2.getAbsoluteFile());
        System.out.println(file_new2.getPath());
        System.out.println(file_new2.length());
        System.out.println();






    }

    @Test
    public void test02(){
        File file_new2 = new File("H:\\java文件练习\\people.json");
        File file = new File("H:\\java文件练习\\22.txt");
        System.out.println(file_new2.exists());
        System.out.println(file_new2.length());
//        System.out.println(file.exists());
        System.out.println(file_new2.isFile());
        System.out.println(file_new2.isDirectory());
    }


    @Test
    public void test03() throws IOException {
        File file_new2 = new File("H:\\java文件练习\\people.json");
        File file = new File("H:\\java文件练习\\22.txt");
        System.out.println(file.createNewFile());  //没有才会创建
        File direc = new File("H:\\java文件练习\\hehe");
        System.out.println(direc.mkdir());
        File direc2 = new File("H:\\java文件练习\\haha\\haha2");
        System.out.println("-----");
        System.out.println(direc2.mkdir());
        System.out.println(direc2.mkdirs());
        System.out.println("----delete---");
        System.out.println(direc2.delete());
        System.out.println(file.delete());
        System.out.println("文件遍历");
        File bianli = new File("H:\\java文件练习");
        File[] files = bianli.listFiles();
        for (File f:files){
            System.out.println(f.getName());
        }

    }


    @Test
    public void test04() throws IOException {
//        File file = new File("H:\\java文件练习\\haha\\haha3.txt");
//        System.out.println(file.createNewFile());
        File bianli = new File("H:\\java文件练习");
        File[] files = bianli.listFiles();
        for (File f:files){

            System.out.println(f.getName());
        }
    }

    public void listFileall(File file){
        File[] files = file.listFiles();
        for (File f:files){
            if (f.isFile()){
                System.out.println(f.getName());
            }else {
                System.out.println(f.getName());
                listFileall(f);
            }
        }
    }

    @Test
    public void test05() throws IOException {
        File bianli = new File("H:\\java文件练习");
        listFileall(bianli);
    }

    public void listFileall2(File file){
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory()||pathname.getName().endsWith(".json");
            }
        });
        for (File f:files){
            if (f.isFile()){
                System.out.println(f.getName());
            }else {
                System.out.println(f.getName());
                listFileall(f);
            }
        }
    }

    @Test
    public void test07() throws IOException {
        File file = new File("H:\\java文件练习");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                System.out.println("过滤器执行了");
                return pathname.isDirectory()||pathname.getName().contains("people");
//                return false;
            }
        });
        for (File f:files){
            if (f.isFile()){
                System.out.println(f.getName());
            }else {

                listFileall(f);
            }
        }
    }

}
