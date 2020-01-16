package 网络编程.文件上传;

import java.io.*;
import java.net.Socket;

public class FileClient2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8896);
        System.out.println("开始发送文件");
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        //读取文件
        BufferedInputStream bisfile = new BufferedInputStream(new FileInputStream("F:\\要交的文档\\daima.jpg"));
        byte[] bytes = new byte[1024 * 2];
        int len;
        while ((len=bisfile.read(bytes))!=-1){
            bos.write(bytes,0,len);
            bos.flush();
        }

        System.out.println("文件发送完毕");
        bos.close();
        bisfile.close();
    }
}
