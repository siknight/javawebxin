package xdl.day20;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TestSend {

	public static void main(String[] args) {
		
		try{
			//1.创建DatagramSocket类型的对象
			DatagramSocket ds = new DatagramSocket();
			//2.创建DatagramPacket类型的对象，提供接收方的IP地址和端口号
			byte[] data = "hello".getBytes();
			InetAddress ia = InetAddress.getByName("QH-20160803VHJE");
			System.out.println("ia = " + ia);
			DatagramPacket dp = new DatagramPacket(data, 
					data.length, ia, 8888);
			//3.发送数据内容，使用send()方法
			ds.send(dp);
			System.out.println("成功发送数据内容！");
			//4.关闭套接字
			ds.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
