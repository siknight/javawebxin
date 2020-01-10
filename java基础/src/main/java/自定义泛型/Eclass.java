package 自定义泛型;

public class Eclass<E> {
    public  E e;
    public void out(E e){
        System.out.println(e.toString());
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
