package static静态代码块执行先后顺序练习;

public class StaticblockTest {
    public static void main(String[] args) {
        System.out.println("nihao");
        new User2();
        new User2();
    }
}
