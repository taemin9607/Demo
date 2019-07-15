package DAY26.Class;

/**
 * @author 泰民
 * @title: ThreadDemo
 * @projectName day26
 * @description: TODO
 * @date 2019/7/817:27
 */
/*使用匿名内部类，实现多线程程序
* 前提：继承或者接口实现
* new 父类或者接口（）{
*   重写抽象方法
* }
* */
public class ThreadDemo {
    public static void main(String[] args) {
        //继承方法 XXX extends DAY26.Thread{public void run(){}}
        new Thread(){
            public void run(){
                System.out.println("匿名内部类1");
            }
        }.start();

        //实现接口方式 XXX implements Runnable{ public void run(){}}
        Runnable runnable =new Runnable(){
            public void run(){
                System.out.println("匿名内部类2");
            }
        };
        new Thread(runnable).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类3");
            }
        }).start();
    }
}
