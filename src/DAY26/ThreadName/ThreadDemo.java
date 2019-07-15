package DAY26.ThreadName;

/**
 * @author 泰民
 * @title: ThreadDemo
 * @projectName day26
 * @description: TODO
 * @date 2019/7/814:54
 */
/*JVM开启主线程，运行方法main，主线程也是线程，是线程必然就是Thread类对象
* Thread类中，静态方法static DAY26.Thread currentThread()返回正在执行的线程对象
* */
public class ThreadDemo {
    public static void main(String[] args) {
        NameThread nameThread=new NameThread();
       // nameThread.setName("旺财");
        nameThread.start();

        /*DAY26.Thread thread=DAY26.Thread.currentThread();
        System.out.println(thread.getName());*/

        System.out.println(Thread.currentThread().getName());

    }
}
