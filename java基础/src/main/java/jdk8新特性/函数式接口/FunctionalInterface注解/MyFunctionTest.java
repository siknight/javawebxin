package jdk8新特性.函数式接口.FunctionalInterface注解;

public class MyFunctionTest {
    public static void main(String[] args) {
        show(()->{
            System.out.println("nihao");
        });

        //省略版
        show(()-> System.out.println("nihao2"));
    }

    public static void show(MyFunctionalInterface function){
        function.method();
    }
}
