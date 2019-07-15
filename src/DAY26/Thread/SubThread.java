package DAY26.Thread;

/**
 * @author 泰民
 * @title: SubThread
 * @projectName day26
 * @description: TODO
 * @date 2019/7/814:30
 */
/*定义子类，继承Thread
* 重写方法run*/
public class SubThread extends Thread {
    public void run(){
        for (int i=0;i< 500;i++){
            System.out.println("run..."+i);
        }

    }
}
