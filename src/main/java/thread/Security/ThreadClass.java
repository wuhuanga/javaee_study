package thread.Security;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/09
 */
public class ThreadClass extends Thread{
    Account mm;
    public ThreadClass(Account mmm,String name) {
        super(name);
        mm=mmm;
    }


    public void run() {
       mm.UseMoney(10000);

    }
}
