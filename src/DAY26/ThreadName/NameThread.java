package DAY26.ThreadName;

/**
 * @author 泰民
 * @title: NameThread
 * @projectName day26
 * @description: 获取线程名称，父类Thread方法
 * String getName()
 * @date 2019/7/814:52
 */
public class NameThread extends  Thread{
    public NameThread(){
        super("小强");
    }
    public void run(){
        System.out.println(super.getName());
    }
}
