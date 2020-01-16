package 日期类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str = sdf.format(date);
        System.out.println("---将日期转为自定义格式的字符串----");
        System.out.println(str);
        System.out.println("-----将字符串转为日期----");
        String  dataStr="2020年01月11日 00:29:33";
        Date parse = sdf.parse(dataStr);
        System.out.println(parse);
        System.out.println(parse.getTime());
        System.out.println("---calendar----");
        Calendar cal = Calendar.getInstance();
        Date dat = cal.getTime();
        System.out.println(dat);
        int  year= cal.get(Calendar.YEAR);
        int m = cal.get(Calendar.MONTH)+1;
        int d = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("year="+year+",m="+m+",d="+d);

    }
}
