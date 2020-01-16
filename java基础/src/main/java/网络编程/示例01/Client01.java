package 网络编程.示例01;

import java.io.*;
import java.net.Socket;

public class Client01 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8897);
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        bos.write("hello server".getBytes());
        bos.flush();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[8 * 1024];
        int read = inputStream.read(bytes);
        System.out.println("client收到消息："+new java.lang.String(bytes));
        System.out.println("结束");
    }
}
