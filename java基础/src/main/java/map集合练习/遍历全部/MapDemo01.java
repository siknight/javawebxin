package map集合练习.遍历全部;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建Map集合对象
         HashMap<String, String> map = new HashMap<String,String>();
         //添加元素到集合
         map.put("胡歌", "霍建华");
         map.put("郭德纲", "于谦");
         map.put("薛之谦", "大张伟");
        Set<String> keys = map.keySet();
        for (String key:keys){
            System.out.println(key+"---"+map.get(key));
        }

        System.out.println("------2----------");
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String,String> entry:entries){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }

    }
}
