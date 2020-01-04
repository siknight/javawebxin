/*
   编程实现变量的声明和使用
*/
public class TestVar{

    public static void main(String[] args){

        //1.声明一个变量用于记录年龄的信息
        int age = 18;

        //2.打印该变量的数值
        System.out.println("age = " + age); //age = 18

        System.out.println("-----------------------------");
        //System.out.println("id = " + id); // error
        //int id;
        //System.out.println("id = " + id); // error
        int id = 1001;
        System.out.println("id = " + id); //id = 1001;
        //int id = 1002; error 
        id = 1002; //将1002这个数值放入id所在的内存空间，覆盖之前的1001

        System.out.println("-----------------------------");
        int 学号 = 1003; //ok  不推荐使用
        int fjdaljfafjvcejkrjwjcskjfljsljt43jfkjskfjslkj6454 = 10;
   }
}



