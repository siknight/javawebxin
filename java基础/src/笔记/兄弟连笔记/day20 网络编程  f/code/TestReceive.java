package xdl.day20;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestReceive {

	public static void main(String[] args) {
		
		try{
			//1.创建DatagramSocket类型的对象，并提供端口号
			DatagramSocket ds = new DatagramSocket(8888);
			//2.创建DatagramPacket类型的对象，用于接收数据内容
			byte[] data = new byte[1024];
			DatagramPacket dp = new DatagramPacket(data, data.length);
			//3.接收数据并存放到数据报中，使用receive()方法
			System.out.println("等待数据的到来...");
			ds.receive(dp);
			//System.out.println("接收到的数据内容是：" + new String(data) + "!");
			System.out.println("接收到的数据内容是：" 
					+ new String(data, 0, dp.getLength()) + "!");
			//4.关闭套接字
			ds.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
