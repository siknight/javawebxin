package xdl.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class TestClient {

	public static void main(String[] args) {

		try{
			//1.创建Socket类型的对象，并提供服务器的IP地址和端口号
			Socket s = new Socket("192.168.101.234", 8888);	
			
			//2.使用输入输出流进行通信
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader br2 = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			
			while(true){
				//提示用户输入要发送的内容，并使用变量记录
				System.out.println("请输入要发送的内容：");	
				String str = br.readLine();
				//使用PrintStream类向服务器发送字符串内容"hello"
				//ps.println("hello");
				ps.println(str);
				System.out.println("成功发送数据到服务器");
				//判断客户端发送的内容是否为“bye”，若是则结束通信
				if("bye".equalsIgnoreCase(str)) break;
				//使用BufferedReader类来接收服务器回发的内容		
				String str2 = br2.readLine();
				System.out.println("服务器发来的消息是：" + str2);
			}
			
			//3.关闭相关的资源
			br2.close();
			br.close();
			ps.close();
			s.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
