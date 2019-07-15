package DAY26.ThreadPool;

import java.util.concurrent.Callable;

/**
 * @author 泰民
 * @title: GetSumCallable
 * @projectName day26
 * @description: TODO
 * @date 2019/7/118:37
 */
public class GetSumCallable implements Callable<Integer> {
    private int a;
    public GetSumCallable(int a){
        this.a=a;
    }
    public Integer call(){
        int sum=0;
        for(int i=1;i<=a;i++){
            sum=sum+i;
        }
        return sum;
    }
}
