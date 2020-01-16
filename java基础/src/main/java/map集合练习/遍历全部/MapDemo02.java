package map集合练习.遍历全部;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
@SuppressWarnings(value = "all")
public class MapDemo02 {
    public static void main(String[] args) {
        //创建Map集合对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String next = scanner.next();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0;i<next.length();i++){
            char c = next.charAt(i);
            System.out.println(c);
            if (map.containsKey(c)){

               map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        System.out.println(map);

    }
}
