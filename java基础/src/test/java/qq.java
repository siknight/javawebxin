import java.util.Arrays;

public class qq {

    public static void main(String[] args) {
        Long a=10L;
        System.out.println(a);
        byte b=10;
        System.out.println(b);
        char c='b';
        System.out.println(c);
        int [] aa={1,6,3,4};
        System.out.println(aa.hashCode());
        System.out.println(Arrays.hashCode(aa));
        System.out.println(Arrays.toString(aa));
        Arrays.sort(aa);
        System.out.println(Arrays.toString(aa));
    }

}
