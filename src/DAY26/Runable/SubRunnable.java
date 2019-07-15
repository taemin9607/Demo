package DAY26.Runable;

/**
 * @author 泰民
 * @title: SubRunnable
 * @projectName day26
 * @description: 实现线程成功的另一个方式，接口实现
 * 实现接口Runnable,重写run方法
 * @date 2019/7/816:04
 */
public class SubRunnable implements Runnable{
    public void run(){
        for (int i=0;i<500;i++){
            System.out.println("run...."+i);
        }
    }
}
