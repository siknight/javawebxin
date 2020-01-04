package xdl.day20;

import java.net.InetAddress;

public class TestInetAddress {

	public static void main(String[] args) {
		
		try{
			//1.��ȡ������������ַ��IP��ַ��Ϣ
			InetAddress ia = InetAddress.getLocalHost();
			//�Զ�����toString()���ַ�����ʽΪ��������/IP��ַ
			System.out.println("ia = " + ia); //QH-20160803VHJE/192.168.254.13
			//��ֵ�ַ��Ϣ�е������� �� IP��ַ���ֱ��ӡ����
			System.out.println(ia.getHostName()); //QH-20160803VHJE
			System.out.println(ia.getHostAddress()); //192.168.254.13
			
			System.out.println("--------------------------------");
			//2.��ȡָ���������еĵ�ַ��Ϣ
			//InetAddress ia2 = InetAddress.getByName("QH-20160803VHJE");
			InetAddress ia2 = InetAddress.getByName("������");
			//InetAddress ia2 = InetAddress.getByName("192.168.101.166");//����ʹ
			//�Զ�����toString()���ַ�����ʽΪ��������/IP��ַ
			System.out.println("ia2 = " + ia2); //QH-20160803VHJE/192.168.254.13
			//��ֵ�ַ��Ϣ�е������� �� IP��ַ���ֱ��ӡ����
			System.out.println(ia2.getHostName()); //QH-20160803VHJE
			System.out.println(ia2.getHostAddress()); //192.168.254.13
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
