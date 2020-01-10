package 接口;

public interface Usb  {
    public abstract void eat();
    public default void haha(){
        System.out.println("hahhah defalult");
    }
    public static void staHeHe(){
        System.out.println("static ");
    }
}
