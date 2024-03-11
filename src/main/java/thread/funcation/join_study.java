package thread.funcation;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/09
 */

//sleep和join的用法
public class join_study {
    //join让当前线程先执行完
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
        Thread a=new ThreadClass("线程1");
        Thread b=new ThreadClass("线程2");
        Thread c=new ThreadClass("线程3");
        a.start();
        a.join();
        b.start();
        b.join();
        c.start();
        c.join();
    }
}
