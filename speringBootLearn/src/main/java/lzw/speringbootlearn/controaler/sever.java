package lzw.speringbootlearn.controaler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class sever {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        System.out.println("服务器启动成功");

        while(true){
            Socket sock = ss.accept();
            System.out.println("有客户端连接"+sock.getRemoteSocketAddress());

            Thread t = new Handler(sock);
            t.start();
        };
    }
}
