package 集合练习;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("aa");
        linkedList.add("bb");
        linkedList.add("cc");
        System.out.println(linkedList);
        linkedList.pop();  //删除第一个
        System.out.println(linkedList);
        linkedList.removeLast(); //删除最后一个
        System.out.println(linkedList);
        linkedList.addFirst("aa");
        linkedList.addLast("cc");
        System.out.println(linkedList);
        linkedList.add(1,"dd");
        System.out.println(linkedList);
        linkedList.push("hehe");  //添加第一个
        System.out.println(linkedList);
        System.out.println("----------------------");
        System.out.println("aa".hashCode());
        System.out.println("bb".hashCode());
    }
}
