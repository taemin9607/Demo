package DAY22.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 泰民
 * @title: OioServer
 * @projectName day22
 * @description: TODO
 * @date 2019/7/810:17
 */
public class OioServer {
    @SuppressWarnings("resource") //压制资源泄露警告的。比如使用io类，最后没有关闭。
    public static void main(String[] args) throws Exception {
        //创建socket服务，监听10101端口
        ServerSocket serverSocket=new ServerSocket(10101);
        System.out.println("服务器启动！");
        while (true){
            //获取一个套接字（阻塞）
            final Socket socket= serverSocket.accept();
            System.out.println("来一个新客户端");
            //业务处理
            handler(socket);
        }
    }
    /*读取数据*/

    private static void handler(Socket socket) {
        try{
            byte[] bytes=new byte[1024];
            InputStream inputStream =socket.getInputStream();

            while (true){
                //读取数据（阻塞)
                int read=inputStream.read(bytes);
                if (read !=-1){
                    System.out.println(new String(bytes,0,read));
                }else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                System.out.println("socket关闭");
                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
