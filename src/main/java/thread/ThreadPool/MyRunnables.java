package thread.ThreadPool;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/09
 */
public class MyRunnables implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行这个任务");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
