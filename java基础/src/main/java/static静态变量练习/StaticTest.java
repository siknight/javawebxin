package static静态变量练习;

import org.junit.Test;

public class StaticTest {

    @Test
    public void Test(){
        User.useranme="hhe";
        System.out.println(User.useranme);
        User.useranme="bb";
        System.out.println(User.useranme);
    }
}
