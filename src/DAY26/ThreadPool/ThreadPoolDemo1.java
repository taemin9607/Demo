package DAY26.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author 泰民
 * @title: ThreadPoolDemo1
 * @projectName day26
 * @description: TODO
 * @date 2019/7/108:22
 */
/*
* 实现线程程序的第三个方式，实现Callable接口方式
* 实现步骤：
* 工厂类ExecutorService接口实现类，调用方法submit提交线程任务
* submit（Callable c）
* */
public class ThreadPoolDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        //提交线程任务的方法submit方法返回Future接口的实现类
        Future<String> s=executorService.submit(new ThreadPoolCallable());
        String f=s.get();
        System.out.println(f);
    }
}
