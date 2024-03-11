package thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/09
 */
public class ThreadPool_Executors {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
    }
}
