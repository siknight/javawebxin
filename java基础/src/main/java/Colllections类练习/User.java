package Colllections类练习;

import com.sun.deploy.util.StringUtils;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Collections;

public class User implements Comparable<User> {

    private  String name ;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        if (this.age<o.age){
            return  -1;  //从小到大

        }else {

            return 1;
        }
//        return this.age-o.age;  //我减别人就是升序  别人减我就是降序
    }
}
