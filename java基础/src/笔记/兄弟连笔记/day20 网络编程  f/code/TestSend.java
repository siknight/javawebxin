package xdl.day20;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TestSend {

	public static void main(String[] args) {
		
		try{
			//1.����DatagramSocket���͵Ķ���
			DatagramSocket ds = new DatagramSocket();
			//2.����DatagramPacket���͵Ķ����ṩ���շ���IP��ַ�Ͷ˿ں�
			byte[] data = "hello".getBytes();
			InetAddress ia = InetAddress.getByName("QH-20160803VHJE");
			System.out.println("ia = " + ia);
			DatagramPacket dp = new DatagramPacket(data, 
					data.length, ia, 8888);
			//3.�����������ݣ�ʹ��send()����
			ds.send(dp);
			System.out.println("�ɹ������������ݣ�");
			//4.�ر��׽���
			ds.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
