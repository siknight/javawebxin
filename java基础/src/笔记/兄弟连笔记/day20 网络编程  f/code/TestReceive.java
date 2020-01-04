package xdl.day20;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestReceive {

	public static void main(String[] args) {
		
		try{
			//1.����DatagramSocket���͵Ķ��󣬲��ṩ�˿ں�
			DatagramSocket ds = new DatagramSocket(8888);
			//2.����DatagramPacket���͵Ķ������ڽ�����������
			byte[] data = new byte[1024];
			DatagramPacket dp = new DatagramPacket(data, data.length);
			//3.�������ݲ���ŵ����ݱ��У�ʹ��receive()����
			System.out.println("�ȴ����ݵĵ���...");
			ds.receive(dp);
			//System.out.println("���յ������������ǣ�" + new String(data) + "!");
			System.out.println("���յ������������ǣ�" 
					+ new String(data, 0, dp.getLength()) + "!");
			//4.�ر��׽���
			ds.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
