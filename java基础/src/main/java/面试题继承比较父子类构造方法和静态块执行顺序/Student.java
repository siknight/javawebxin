package 面试题继承比较父子类构造方法和静态块执行顺序;

public class Student extends Person {
    public Student() {
        System.out.println("子类构造器执行了");

    }
static {
    System.out.println("子类静态块执行了");
}
    @Override
    public void say() {
        super.say();
    }
}
