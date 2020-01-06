package 测试类jvm;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        Person person1 =person;
        System.out.println(person1);
        person1.soutthis();

    }
}
