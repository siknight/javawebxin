package 自定义泛型.方法参数使用泛型;

public class EMTest {
    public static void main(String[] args) {
        EMethodTest eMethodTest = new EMethodTest();
        eMethodTest.set("aa");
        System.out.println(eMethodTest.get(2222));
    }
}
