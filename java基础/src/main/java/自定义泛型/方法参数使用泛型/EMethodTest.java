package 自定义泛型.方法参数使用泛型;

public class EMethodTest {
    public <E> void set(E e){
        System.out.println(e.getClass());
    }
    public <E> E get(E e){
        return e;
    }
}
