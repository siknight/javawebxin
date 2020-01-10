package 自定义泛型;

public class ETest {
    public static void main(String[] args) {
        Eclass<String> e01 = new Eclass<>();

        e01.setE("hehe");
        System.out.println(e01.getE());
    }
}
