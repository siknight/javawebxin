package set集合和可变参数练习;

public class ArgsTest {
    public static void main(String[] args) {
        args01(1);
        args01(1,2,3);
        argsObject("a","b");

        System.out.println("---------");
        argsE("aa","bb");
    }

    public static void args01(int... ints){
        System.out.println(ints);
        System.out.println(ints.length);

    }

    public static void argsObject(Object... o){
        System.out.println(o);
        System.out.println(o.length);

    }

    public static <E> void argsE(E... o){
        System.out.println(o);
        System.out.println(o.length);

    }
}
