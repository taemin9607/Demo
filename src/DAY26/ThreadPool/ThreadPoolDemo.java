package DAY26.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 泰民
 * @title: DAY26.ThreadPool
 * @projectName day26
 * @description:
 *
 * @date 2019/7/99:31
 */

/*
* JDK1.5新特性，实现线程池程序
* 使用工厂类Executors中的静态方法创建线程对象，指定线程的个数
*static ExecutorService newFixedThreadPool(int 个数） 返回线程池对象
* 返回的是ExecutorService接口的实现类（线程池对象）
*
* 接口实现类对象，调用方法submit（Runnable r）提交线程执行任务
* */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //调用工厂类的静态方法，创建线程池对象
        //返回线程池对象，是返回的接口
        ExecutorService executorService =Executors.newFixedThreadPool(2);//设置线程池中的线程数为2
        //调用接口实现类对象executorService中的方法submit提交线程任务
        //将Runnable接口实现类对象，传递
        executorService.submit(new ThreadPoolRunnable());
        executorService.submit(new ThreadPoolRunnable());
        executorService.submit(new ThreadPoolRunnable());
    }
}
