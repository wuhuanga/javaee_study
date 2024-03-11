package thread.ThreadPool;

import java.util.concurrent.*;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/09
 */
public class ThreadPool2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

            //通过ThreadPoolExecutor创建了线程池
        ExecutorService pool = new ThreadPoolExecutor(3,5,5, TimeUnit.MINUTES,
              new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
               new ThreadPoolExecutor.AbortPolicy());            //new LinkedBlockingDeque<>()不限大小的队列 new ArrayBlockingQueue<>(3)基于数组实现的 限制队列大小的队列

        Future<String> f1=pool.submit(new MyCallable(100));
        Future<String> f2=pool.submit(new MyCallable(200));
        Future<String> f3=pool.submit(new MyCallable(300));
        Future<String> f4=pool.submit(new MyCallable(400));
        Future<String> f5=pool.submit(new MyCallable(500));
        Future<String> f6=pool.submit(new MyCallable(600));
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
        System.out.println(f5.get());
        System.out.println(f6.get());
    }
}
