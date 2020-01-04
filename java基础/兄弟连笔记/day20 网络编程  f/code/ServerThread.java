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
			//3.得到Socket类型的对象，使用输入输出流进行通信	
			//使用BufferedReader类来接收客户端发来的内容
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			//使用PrintStream类向客户端发送字符串内容"I Recived!"
			PrintStream ps = new PrintStream(s.getOutputStream());
			
			while(true){	
				String str = br.readLine();
				//判断客户端发来的消息是否为"bye"，若是则结束循环
				if("bye".equalsIgnoreCase(str)){
					System.out.println("客户端" + s.getInetAddress() + "已下线！");
					break;
				}
				System.out.println("客户端" + s.getInetAddress()+ "发来的消息是：" + str);	
				ps.println("I Recived!");
				//System.out.println("成功发送数据到客户端！");
			}
			
			//4.关闭相关的资源
			ps.close();
			br.close();
			s.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
