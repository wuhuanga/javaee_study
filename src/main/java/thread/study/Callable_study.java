package thread.study;

import java.util.concurrent.Callable;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/08
 */
//1、让这个类实现Callable接口

public class Callable_study implements Callable<String> {
   private int n;

    public Callable_study(int n) {
        this.n = n;
    }

    //2、重写call（）
    @Override
    public String call() throws Exception {
        //描述线程的任务,返回线程执行返回后的结栗。
        //需求。求1-n的和返同。
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=i;
        }
        return "sum="+sum;
    }
}
