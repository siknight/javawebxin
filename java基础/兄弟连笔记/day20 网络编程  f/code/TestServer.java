package xdl.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	public static void main(String[] args) {
		
		try{
			//1.����ServerSocket���͵Ķ��󣬲���ָ���Ķ˿�
			ServerSocket ss = new ServerSocket(8888);
			
			//2.�ȴ��ͻ��˵��������󣬵���accept()����
			while(true){
				System.out.println("�ȴ��ͻ��˵���������...");
				Socket s = ss.accept();
				//s.getInetAddress() ���ڻ�ȡ���������Ŀͻ���ͨ�ŵ�ַ
				System.out.println("�ͻ���" + s.getInetAddress() + "���ӳɹ���");
			    //ֻҪ�пͻ������ӳɹ�����Ӧ������һ�����߳�Ϊ֮�������߳�ʼ�սӴ�
				new ServerThread(s).start();
			}
			//ss.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
