package lambda.test01;

public class PersonChi {
    public static void main(String[] args) {
        pEat(()-> System.out.println("吃鱼"));
    }
    public static void pEat(chi c){
        c.eate();
    }
}
