package 自定义泛型.泛型通配符;

import java.util.ArrayList;
import java.util.Iterator;

public class 通配符练习 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        test01(list);
    }

    public static void test01(ArrayList<?> arrayList){
        Iterator<?> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
