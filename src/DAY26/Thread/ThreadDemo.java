package DAY26.Thread;

/**
 * @author 泰民
 * @title: ThreadDemo
 * @projectName day26
 * @description: TODO
 * @date 2019/7/814:23
 */

    /*创建和启动一个线程
    * 创建Thread子类对象
    * 子类对象调用方法start
    * 让线程程序执行，JVM调用线程中的run
    * */
public class ThreadDemo extends  Thread{
    public static void main(String[] args) {
        SubThread subThread=new SubThread();
        subThread.start();
        for (int i=0;i< 500;i++){
            System.out.println("main..."+i);
        }

    }
}
