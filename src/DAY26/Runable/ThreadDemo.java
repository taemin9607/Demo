package DAY26.Runable;

/**
 * @author 泰民
 * @title: ThreadDemo
 * @projectName day26
 * @description: 创建Thread类对象，构造方法中，传递Runnable接口实现类
 * 调用Thread类方法start()
 * @date 2019/7/816:03
 */
public class ThreadDemo {
    public static void main(String[] args) {
        SubRunnable subRunnable=new SubRunnable();
        Thread thread=new Thread(subRunnable);
        thread.start();

        for (int i=0;i<500;i++){
            System.out.println("main...."+i);
        }

    }
}
