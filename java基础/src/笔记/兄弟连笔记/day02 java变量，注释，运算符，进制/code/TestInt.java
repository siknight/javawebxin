/*
   编程实现整数类型的使用，byte、short、int、long类型
*/
public class TestInt{

   public static void main(String[] args){
    
       byte b1 = 100;
       //byte b1 = 1000; error 可能损失精度
       System.out.println("b1 = " + b1); //b1 = 100

       System.out.println("---------------------------");
       short s1 = 10000;
       //short s1 = 100000; error 可能损失精度
       System.out.println("s1 = " + s1); //s1 = 10000

       System.out.println("---------------------------");
       int i1 = 100000;
       //int i1 = 10000000000; //error 过大的整数 直接量超过了int类型的范围
       //int i1 = 10000000000L;  // error 可能损失精度
       System.out.println("i1 = " + i1); //i1 = 100000;

       System.out.println("---------------------------");
       long l1 = 10000000000L;  
       System.out.println("l1 = " + l1); //l1 = 10000000000;
   }
}