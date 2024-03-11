package thread.ThreadPool;

import java.util.concurrent.*;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/09
 */
public class ThreadPool {
    public static void main(String[] args) {

        //通过ThreadPoolExecutor创建了线程池
        ExecutorService pool = new ThreadPoolExecutor(3,5,5, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());            //new LinkedBlockingDeque<>()不限大小的队列 new ArrayBlockingQueue<>(3)基于数组实现的 限制队列大小的队列
        Runnable my =new MyRunnables();
        pool.execute(my); //线程池会自动创建一个新线程,自动处理这个任务，自动执行的
        pool.execute(my); //线程池会自动创建一个新线程,自动处理这个任务，自动执行的
        pool.execute(my); //线程池会自动创建一个新线程,自动处理这个任务，自动执行的
        pool.execute(my); //复用前面的核心线程
        pool.execute(my); //复用前面的核心线程
        pool.execute(my); //放入任务队列
        pool.execute(my); //放入任务队列
        pool.execute(my); //创建临时线程
        pool.execute(my);  //创建临时线程
        pool.execute(my);   //新任务拒绝。线程池满了，


//        pool.shutdownNow(); //立即关闭线程池
        pool.shutdown(); //等线程池的任务完了关闭线程



    }
}
