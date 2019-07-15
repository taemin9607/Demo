package DAY26.ThreadPool;

import java.util.concurrent.Callable;

/**
 * @author 泰民
 * @title: ThreadPoolCallable
 * @projectName day26
 * @description: TODO
 * @date 2019/7/108:28
 */
/*Callable 接口的实现类，作为线程提交任务出现
* 使用方法返回值
* */
public class ThreadPoolCallable implements Callable<String> {
        public String call() {
            return "Callable接口的实现类";
        }
}
