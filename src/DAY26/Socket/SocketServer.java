package DAY26.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 泰民
 * @title: SocketServer
 * @projectName day26
 * @description: TODO
 * @date 2019/7/1011:23
 */
public class SocketServer {
    public static void main(String[] args) {
        BufferedReader bufferedReader=null;
        PrintWriter printWriter=null;
        try {
            ServerSocket serverSocket=new ServerSocket(2000);
            Socket socket=serverSocket.accept();
            //获取输入流
            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //获取输出流
            printWriter=new PrintWriter(socket.getOutputStream(),true);
            String s=bufferedReader.readLine();//获取接受的数据
            printWriter.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                bufferedReader.close();
                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
