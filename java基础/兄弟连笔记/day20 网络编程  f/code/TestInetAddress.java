package xdl.day20;

import java.net.InetAddress;

public class TestInetAddress {

	public static void main(String[] args) {
		
		try{
			//1.获取本机的主机地址和IP地址信息
			InetAddress ia = InetAddress.getLocalHost();
			//自动调用toString()，字符串格式为：主机名/IP地址
			System.out.println("ia = " + ia); //QH-20160803VHJE/192.168.254.13
			//拆分地址信息中的主机名 和 IP地址并分别打印出来
			System.out.println(ia.getHostName()); //QH-20160803VHJE
			System.out.println(ia.getHostAddress()); //192.168.254.13
			
			System.out.println("--------------------------------");
			//2.获取指定主机名中的地址信息
			//InetAddress ia2 = InetAddress.getByName("QH-20160803VHJE");
			InetAddress ia2 = InetAddress.getByName("徐天龙");
			//InetAddress ia2 = InetAddress.getByName("192.168.101.166");//不好使
			//自动调用toString()，字符串格式为：主机名/IP地址
			System.out.println("ia2 = " + ia2); //QH-20160803VHJE/192.168.254.13
			//拆分地址信息中的主机名 和 IP地址并分别打印出来
			System.out.println(ia2.getHostName()); //QH-20160803VHJE
			System.out.println(ia2.getHostAddress()); //192.168.254.13
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
