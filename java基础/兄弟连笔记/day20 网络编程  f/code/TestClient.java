package xdl.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class TestClient {

	public static void main(String[] args) {

		try{
			//1.����Socket���͵Ķ��󣬲��ṩ��������IP��ַ�Ͷ˿ں�
			Socket s = new Socket("192.168.101.234", 8888);	
			
			//2.ʹ���������������ͨ��
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader br2 = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			
			while(true){
				//��ʾ�û�����Ҫ���͵����ݣ���ʹ�ñ�����¼
				System.out.println("������Ҫ���͵����ݣ�");	
				String str = br.readLine();
				//ʹ��PrintStream��������������ַ�������"hello"
				//ps.println("hello");
				ps.println(str);
				System.out.println("�ɹ��������ݵ�������");
				//�жϿͻ��˷��͵������Ƿ�Ϊ��bye�������������ͨ��
				if("bye".equalsIgnoreCase(str)) break;
				//ʹ��BufferedReader�������շ������ط�������		
				String str2 = br2.readLine();
				System.out.println("��������������Ϣ�ǣ�" + str2);
			}
			
			//3.�ر���ص���Դ
			br2.close();
			br.close();
			ps.close();
			s.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
