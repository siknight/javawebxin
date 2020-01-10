package Deug调试学习;

public class DebugTest {
    public static void main(String[] args) {
        int a=10;
        a=a+10;
        System.out.println(a);
        test(a);
    }

    public  static void test(int a){
        a=a+10;
        System.out.println(a);
    }
}
