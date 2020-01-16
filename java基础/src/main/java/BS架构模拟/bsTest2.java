package BS架构模拟;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class bsTest2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true){
            Socket socket = serverSocket.accept();


            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        InputStream inputStream = socket.getInputStream();

                        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

                        String s = br.readLine();
                        System.out.println("s="+s);
                        String[] split = s.split(" ");
                        String path = split[1].substring(1);
                        System.out.println("s1="+path);
                        FileInputStream fis = new FileInputStream(path);
//        fis.read(path.getBytes());


                        byte[] bytes= new byte[1024];
                        int len = 0 ; // 字节输出流,将文件写会客户端
                        OutputStream out = socket.getOutputStream();

                        // 写入HTTP协议响应头,固定写法
                        out.write("HTTP/1.1 200 OK\r\n".getBytes());
                        out.write("Content‐Type:text/html\r\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        out.write("\r\n".getBytes());


                        while ((len=fis.read(bytes))!=-1){
                            out.write(bytes,0,len);
                        }

                        out.close();

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }


    }
}
