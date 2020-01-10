package Colllections类练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("cba");
        list.add("aba");
        list.add("sba");
        list.add("nba");

        Collections.sort(list);
        System.out.println(list);
        System.out.println("-------打乱顺序--------");
        ArrayList<String> listshuffle = new ArrayList<>();
        Collections.addAll(listshuffle,"a","b","c");
        System.out.println(listshuffle);
        Collections.shuffle(listshuffle);   //打乱重组
        System.out.println(listshuffle);
        //排序
        Collections.sort(listshuffle);
        System.out.println(listshuffle);

        //对象排序

        ArrayList<User> userList = new ArrayList<>();
        User lisi = new User("lisi", 22);


        userList.add(lisi); //add添加的是对象是地址
        lisi.setAge(23);
        lisi.setName("xiaosi");
        userList.add(lisi);
        System.out.println(userList);
        User jiang = new User("jiang", 21);
        System.out.println(userList);
        userList.add(jiang);
        User huabei = new User("huabei", 23);
        userList.add(huabei);
        Collections.sort(userList);
        System.out.println(userList);

        System.out.println("--------------");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(1);
        integers.add(10);
        System.out.println("正常排序="+integers);
        Collections.sort(integers, new Comparator<Integer>() {

            //重写
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1-o2; //升序

                return o2-o1; //降序

            }
        });
        System.out.println(integers);


        ArrayList<User> people = new ArrayList<>();
        people.add(new User("lisi",22));
        people.add(new User("jiang",21));
        people.add(new User("bxiang",23));
        people.add(new User("axiang",23));
        System.out.println("默认="+people);
        Collections.sort(people, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int result= o1.getAge()-o2.getAge(); //按照年龄从小到大排序
                if (o1.getAge()==o2.getAge())
                    //如果age相同按照name首字母排序
                    result=o1.getName().charAt(0)-o2.getName().charAt(0);
                return result;
            }
        });

        System.out.println(people);


    }
}
