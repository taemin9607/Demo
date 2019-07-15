package DAY26.datashare;

/**
 * @author 泰民
 * @title: ThreadDemo
 * @projectName day26
 * @description: TODO
 * @date 2019/7/119:06
 */
/*
* */
public class ThreadDemo {
    public static void main(String[] args) {
        //创建Runnable接口实现类对象
        Ticket ticket=new Ticket();
        //创建3个Thread类对象，传递Runnable接口实现类
        Thread t0=new Thread(ticket);
        Thread t1=new Thread(ticket);
        Thread t2=new Thread(ticket);

        t0.start();
        t1.start();
        t2.start();
    }
}
