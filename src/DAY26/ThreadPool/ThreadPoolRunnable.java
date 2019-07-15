package DAY26.ThreadPool;

/**
 * @author 泰民
 * @title: ThreadPoolRunnable
 * @projectName day26
 * @description: TODO
 * @date 2019/7/916:13
 */
public class ThreadPoolRunnable implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName()+"线程提交任务");
    }
}
