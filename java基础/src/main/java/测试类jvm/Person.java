package 测试类jvm;

public class Person {
    public Person() {

    }
    public void soutthis(){
        System.out.println(this);
    }

//    @Override  //放开后打印的是这内容，不放开打印的是地址
//    public String toString() {
//        return "Person{}";
//    }
}
