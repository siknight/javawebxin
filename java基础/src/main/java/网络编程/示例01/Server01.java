package 网络编程.示例01;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) throws IOException {
//        ServerSocket serverSocket = new ServerSocket(8899);
//        Socket socket = serverSocket.accept();
//        InputStream inputStream = socket.getInputStream();
//        byte[] bytes = new byte[8 * 1024];
//        int read = inputStream.read(bytes);
//        System.out.println(new java.lang.String(bytes));
    }

    @Test
    public void test01() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8897);

        while(true){
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[8 * 1024];
            int read = inputStream.read(bytes);
            System.out.println("收到消息："+new java.lang.String(bytes));
            //---服务器给client回复消息
            OutputStream outputStream = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(outputStream);
            bos.write("hello 我是服务器 我给你发消息了".getBytes());
            bos.flush();
        }

    }




}
