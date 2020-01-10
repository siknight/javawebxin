package static静态代码块执行先后顺序练习;

public class User2 {

    public User2() {
        System.out.println("构造方法");
    }

    static {  //静态代码块会比构造方法先执行，而且只会执行一次
        System.out.println("static ");
    }
}
