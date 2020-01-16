package lambda;

public class lambdaTest {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("nihao");
        }).start();
    }
}
