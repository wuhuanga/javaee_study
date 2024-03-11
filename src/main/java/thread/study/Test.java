package thread.study;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/08
 */
public class Test {
    //main 其实是一个主线程
    public static void main(String[] args) throws Exception {
        //1111111111111=============================
        // 必须继承thread成为一个线程类，才能使用thread
        //
        Thread t =new ThreadClass("线程0");
//        t.setName("线程0");
        t.start();
        System.out.println(t.getName());
        Thread m = Thread.currentThread();
        m.setName("zhuzhzuzhuz");
        System.out.println(m.getName());
        Runnable r=new Runnable_study();
        new Thread(r).start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程"+i);
        }
        //222222==================
        //多线程的创建方式二:实现Runnable接口
        Runnable R = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("匿名内部类" + i);
                }
            }
        };  //匿名内部类 线程创建
        new Thread(R).start();
        //标准1
        Thread a =new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("主线程"+i);
                }
            }
        });
        a.start();
        //简化1
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("主线程"+i);
                }
            }
        }).start();
        //lambda简化  线程创建2
        new Thread(() ->{
                for (int i = 0; i < 5; i++) {
                    System.out.println("lambda线程"+i);
                }
        }).start();
        //3333333333========================================

        Callable<String> call=new Callable_study(100);
        //4、把Callable的对象封装成一个FutureTask对象(任务对象)
        //未来任务对象的作用?
        //1、是一个任务对象,实现了 Runnable对象
        //2、可以在线程执行完毕之后，用未来任务对象调用get方法获取线程执行完毕后的结果。
        FutureTask<String> future= new FutureTask<String>(call);
        //5、把任务对象交给Thread
        new Thread(future).start();
        //6、获取结果

        //注意:如果执行到这儿,假如上面的线程还没有执行完毕
        // 这里的代码会暂停,等待上面线程执行完毕后才会获取结栗。
        String rs=future.get();
        System.out.println(rs);
    }
}
