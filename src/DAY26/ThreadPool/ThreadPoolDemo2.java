package DAY26.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author 泰民
 * @title: ThreadPoolDemo2
 * @projectName day26
 * @description: TODO
 * @date 2019/7/118:17
 */
/*使用多线程技术，求和
* 两个线程，1个线程计算1+100，另一个线程计算1+200的和
* 多线程的异步计算
* */
public class ThreadPoolDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService =Executors.newFixedThreadPool(2);
        Future<Integer> f1=executorService.submit(new GetSumCallable(100));
        Future<Integer> f2=executorService.submit(new GetSumCallable(200));
        System.out.println(f1.get());
        System.out.println(f2.get());

    }
}
