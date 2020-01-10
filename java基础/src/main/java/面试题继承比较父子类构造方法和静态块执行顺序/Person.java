package 面试题继承比较父子类构造方法和静态块执行顺序;

public class Person {
    public int username;
    static {
        System.out.println("父类静态代码块");
    }

    public Person() {
        System.out.println("person构造方法执行了");
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public void say(){
        System.out.println("你好");
    }
}
