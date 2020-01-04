package xdl.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	public static void main(String[] args) {
		
		try{
			//1.创建ServerSocket类型的对象，并绑定指定的端口
			ServerSocket ss = new ServerSocket(8888);
			
			//2.等待客户端的连接请求，调用accept()方法
			while(true){
				System.out.println("等待客户端的连接请求...");
				Socket s = ss.accept();
				//s.getInetAddress() 用于获取连接上来的客户端通信地址
				System.out.println("客户端" + s.getInetAddress() + "连接成功！");
			    //只要有客户端连接成功，则应该启动一个新线程为之服务，主线程始终接待
				new ServerThread(s).start();
			}
			//ss.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
