package xdl.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread extends Thread {
	private Socket s;
	public ServerThread(Socket s){
		this.s = s;
	}
	
	@Override
	public void run(){
		try{
			//3.�õ�Socket���͵Ķ���ʹ���������������ͨ��	
			//ʹ��BufferedReader�������տͻ��˷���������
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			//ʹ��PrintStream����ͻ��˷����ַ�������"I Recived!"
			PrintStream ps = new PrintStream(s.getOutputStream());
			
			while(true){	
				String str = br.readLine();
				//�жϿͻ��˷�������Ϣ�Ƿ�Ϊ"bye"�����������ѭ��
				if("bye".equalsIgnoreCase(str)){
					System.out.println("�ͻ���" + s.getInetAddress() + "�����ߣ�");
					break;
				}
				System.out.println("�ͻ���" + s.getInetAddress()+ "��������Ϣ�ǣ�" + str);	
				ps.println("I Recived!");
				//System.out.println("�ɹ��������ݵ��ͻ��ˣ�");
			}
			
			//4.�ر���ص���Դ
			ps.close();
			br.close();
			s.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
