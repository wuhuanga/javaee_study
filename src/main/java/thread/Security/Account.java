package thread.Security;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/09
 */
public class Account {
    int Money;
    private final Lock lk=new ReentrantLock();//创建账户时创建一个锁 ,建议用final,不能进行二次赋值
    public Account(int money) {
        Money = money;
    }
    public static void other(){
        synchronized (Account.class) {
            System.out.println(11);
        }


    }
    //=============================同步代码块
//    public void UseMoney(int money) {
//
//        String name = Thread.currentThread().getName();
//
//        synchronized (this) { //常量池只有一份
//            if(money>Money){
//
//                System.out.println(name + "取的时候没钱了");
//            }else {
//
//                System.out.println(name + "取走了" + money );
//                Money-=money;
//            }
//            System.out.println("\n余额为" + Money );
//        }
//    }
//        public synchronized void UseMoney(int money) {
//
//        String name = Thread.currentThread().getName();
//
//
//            if(money>Money){
//
//                System.out.println(name + "取的时候没钱了");
//            }else {
//
//                System.out.println(name + "取走了" + money );
//                Money-=money;
//            }
//            System.out.println("\n余额为" + Money );
//
//    }
    public void UseMoney(int money) {

        String name = Thread.currentThread().getName();
        lk.lock();//加锁

        try {
            if(money>Money){

                System.out.println(name + "取的时候没钱了");
            }else {

                System.out.println(name + "取走了" + money );
                Money-=money;
            }
            System.out.println("\n余额为" + Money );
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lk.unlock();//解锁
        }

    }
    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }
}
