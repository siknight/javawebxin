/*
   编程实现变量的输入和输出
*/

//导入java目录中的util目录中的Scanner类
import java.util.Scanner;

public class TestVarInput{

   public static void main(String[] args){

       //1.声明两个变量，分别记录姓名和年龄  
       //String/*字符串类型*/ name;
       //int age;	

       //2.提示用户输入姓名和年龄，并保存到变量中
       System.out.println("请输入姓名和年龄：");
       //创建一个扫描器对象负责扫描键盘的输入
       Scanner sc = new Scanner(System.in);
       //从键盘输入中读取一个字符串内容放入name变量对应的内存空间中
       String name = sc.next();
       //从键盘输入中读取一个整数放入age变量对应的内存空间中
       int age = sc.nextInt();  

       //3.打印用户输入的姓名和年龄
       System.out.println("name = " + name); 
       System.out.println("age = " + age); 
   }
}