package 抽象类;

import org.junit.Test;

public class Teacher  extends Person{
    void eat() {
        System.out.println("eat ");
    }


    @Test
    public void test01(){
        Teacher teacher = new Teacher();
        teacher.eat();
        teacher.he();
    }
}
