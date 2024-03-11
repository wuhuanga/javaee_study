package thread.study;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/08
 */
//继承Thread
public class ThreadClass extends Thread{
    public ThreadClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("线程输出" + i);
        }
    }
}
