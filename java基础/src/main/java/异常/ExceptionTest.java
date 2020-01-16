package 异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class ExceptionTest {

    public static void main(String[] args) /*throws ParseException*/ {
//        Date date = null;
//        if(date==null){
//            throw new NullPointerException("空指针异常");
//
//        }
        //        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            date = sdf.parse("1999-0912");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

        try {

        }catch (Exception e){
            e.printStackTrace();
        }

        Objects.requireNonNull(null,"hehhe");

        System.out.println(111111111);

    }
}
