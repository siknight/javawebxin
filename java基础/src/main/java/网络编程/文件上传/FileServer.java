package 网络编程.文件上传;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8896);

        while(true){
            Socket socket = serverSocket.accept();
            new Thread(()->{
                System.out.println("开始上传文件");
                try {
                    InputStream inputStream = socket.getInputStream();
                    //设置输出文件名
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\out\\"+System.currentTimeMillis() + ".jpg"));
                    //将文件输出
                    byte[] bytes = new byte[8 * 1024];
                    int len;
                    while((len=inputStream.read(bytes))!=-1){
                        bos.write(bytes,0,len);
                    }
                    bos.flush();
                    //给客户端回复消息
                    OutputStream outputStream = socket.getOutputStream();
                    BufferedOutputStream bos2 = new BufferedOutputStream(outputStream);

                    bos.write("hello 我是服务器 我已经接收到你的文件".getBytes());
                    bos2.flush();
                    System.out.println("文件上传成功");
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {

                }

            }).start();

        }
    }
}
