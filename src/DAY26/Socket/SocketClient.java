package DAY26.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 泰民
 * @title: SocketClient
 * @projectName day26
 * @description: TODO
 * @date 2019/7/1011:30
 */
public class SocketClient {
    public static void main(String[] args) {
        BufferedReader bufferedReader=null;
        PrintWriter printWriter=null;
        try{
            Socket socket=new Socket("localhost",2000);
            //获取输入流与输出流
            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter=new PrintWriter(socket.getOutputStream(),true);
            //向服务器发送数据
            printWriter.println("hello");
            String s=null;
            while (true){
                s=bufferedReader.readLine();
                if (s!=null)
                    break;
            }
            System.out.println(s);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
