/*
   编程实现浮点类型的使用，也就是float类型和double类型的使用
*/
public class TestDouble{

    public static void main(String[] args){

        //float f1 = 3.14;  error:可能损失精度
        float f1 = 3.14f;
        System.out.println("f1 = " + f1); // f1 = 3.14 

        System.out.println("-----------------------------");
        double d1 = 3.14;
        System.out.println("d1 = " + d1); // d1 = 3.14

        System.out.println("------------------------------");
        System.out.println(0.1 + 0.2); //0.3.....4
        System.out.println(0.1 + 0.2 + 0.3); //0.6.....4
    } 
}