package 测试类jvm;

import org.junit.Test;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        Person person1 =person;
        System.out.println(person1);
        person1.soutthis();
        System.out.println("-------------");
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
        System.out.println(person);
        System.out.println(Integer.toHexString(person.hashCode()));
        System.out.println("----------------");
        //-
        Person person2 = person;
        person2.setAge(20);
        System.out.println(person.getAge());
    }

    @Test
    public void test01(){
        Person person = new Person();
        System.out.println(person);
        System.out.println(person.hashCode());
    }
}
