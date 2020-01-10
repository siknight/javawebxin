package set集合和可变参数练习;





import java.util.HashSet;
import java.util.LinkedHashSet;

@SuppressWarnings(value = "all")
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> StrSet = new HashSet<>();
        String bb = new String("bb");
        String b2 = new String("bb");
        String cc = new String("cc");
        System.out.println(bb==b2);
        System.out.println(bb.equals(b2));
        StrSet.add(cc);
        StrSet.add("aa");
        StrSet.add("bb");
        StrSet.add("bb");
        StrSet.add(bb);
        System.out.println(StrSet);

       //HashSet发现HashCode没有就会直接存，发现HashCode有，然后就会比较equals方法
        System.out.println("----------------------");
        User user = new User("lisi","23");
        User user2 = new User("lisi","23");
        User user3 = new User("lisi","24");
        HashSet<User> users = new HashSet<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        System.out.println(users);
        System.out.println("________LinkedHashSet______________");
        LinkedHashSet<User> lhs = new LinkedHashSet<>();
        lhs.add(user);
        lhs.add(user3);
        System.out.println(lhs);
    }
}
