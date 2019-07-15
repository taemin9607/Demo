package DAY26.Nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;

/**
 * @author 泰民
 * @title: NioTcpServer
 * @projectName day26
 * @description: TODO
 * @date 2019/7/1014:26
 */
public class NioTcpServer {
    private static int TIMEOUT=3000;
    public static void nioTcpserver(int listenPort) throws IOException{
        //创建一个选择器
        Selector selector=Selector.open();

        //实例化一个信道
        ServerSocketChannel listnChannel=ServerSocketChannel.open();
        //将该信道绑定到指定端口
        listnChannel.socket().bind(new InetSocketAddress(listenPort));
        //配置信道为非阻塞模式
        listnChannel.configureBlocking(false);
        //将选择器注册到各个信道
        listnChannel.register(selector, SelectionKey.OP_ACCEPT);

        //不断轮询select方法，获取准备好的信道所关联的Key集
        while(true){
            //一直等待，直至有信道准备好了I/O操作
            if(selector.select(TIMEOUT)==0){
                //在等待信道准备的同时，也可以异步地执行其他任务，
                continue;
            }
            //获取准备好的信息所关联的Key集合的iterator实例
            Iterator<SelectionKey> keyIterator=selector.selectedKeys().iterator();
            //循环取得集合中的每个键值
            while (keyIterator.hasNext()){
                SelectionKey key=keyIterator.next();
                //如果服务端信道感兴趣的I/O操作为accept
                if (key.isAcceptable()){
                  //  handleAccept(key);
                }
                //如果客户端信道感兴趣的I/O操作为read
                if(key.isReadable()){
                   // handleAccept(key);
                }
                //如果该键值有效，并且其对应的客户端信道感兴趣的I/O操作为write
                if(key.isValid()&&key.isWritable()){
                 //   handleWrite(key);
                }
                //这里需要手动从键值中移除当前的key
                keyIterator.remove();
            }
        }
    }
}
