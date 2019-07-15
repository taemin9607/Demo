package DAY26.datashare;

/**
 * @author 泰民
 * @title: Ticket
 * @projectName day26
 * @description: TODO
 * @date 2019/7/119:07
 */
public class Ticket implements Runnable {
    //定义出售的票源
    private int ticket=100;

    public void run(){
        while (true){
            //对票数判断，大于0，可以出售，变量--操作
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"出售第"+ticket--);
            }
        }
    }
}
