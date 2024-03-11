线程池

工作线程Work Thread

任务队列Work queue
Runnable Callable 这两个

-----------------------------------------
谁代表线程池?
JDK 5.O起提供了代表线程池的接口:ExecutorService。

如何得到线程池对象?
·方式一:使用ExecutorService的实现类ThreadPoolExecutor自创建一个线程池对象。
ExecutorService
     ||
     ||
    \/\/
     \/
ThreadPoolExecutor

方式二︰使用Executors（线程池的工具类）调用方法返回不同特点的线程池对象。


ThreadPoolExecutor构造器
`public ThreadPoolExecutor(int corePoolSize，int maximumPoolSize，long keepAliveTime，TimeUnit unit,
BlockingQueue<Runnable> workQueue,ThreadFactory threadFactory,
RejectedExecutionHandler handler)`
参数一:corePoolSize 是线程池核心线程数量
参数二:maximumPoolSize 是线程池线程最大线程数量 //假如最大线程是5，核心线程数量是3，就会创建3个临时线程去处理
参数三:keepAliveTime :指定临时线程的存活时间。
参数四:unit:指定临时线程存活的时间单位(秒、分、时、天)
参数五:workQueue:指定线程池的任务队列。   
参数六: threadFactory:指定线程池的线程工厂。 //负责创建核心线程和临时线程
参数七: handler:指定线程池的任务拒绝策略（线程都在忙，任务队列也满了的时候，新任务来了该怎么处理)//怎么拒绝它


1、临时线程什么时候创建?
**新任务提交时**发现*核心线程都在忙*，_任务队列也满了_，并且*还可以创建临时线程*，此时才会创建临时线程。

2、什么时候会开始拒绝新任务?
_核心线程和临时线程都在忙，任务队列也满了_，**新的任务过来的时候**才会开始拒绝任务。


策略                                                              详解
ThreadPoolExecutor.AbortPolicy                      丢弃任务并抛出RejectedExecutionException异常。是默认的策略
ThreadPoolExecutor.DiscardPolicy:                   丢弃任务,但是不抛出异常这是不推荐的做法
ThreadPoolExecutor.DiscardOldestPolicy              抛弃队列中等待最久的任务然后把当前任务加入队列中
ThreadPoolExecutor.callerRunsPolicy                 由主线程负责调用任务的run()方法从而绕过线程池直接执行


------------------------------------------------------------------------------------------
Executors
是一个线程池的工具类，提供了很多静态方法用于返回不同特点的线程池对象。
方法名称                                                                                        说明
public static ExecutorService newFixedThreadPool(int nThreads)                       创建固定线程数量的线程池，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程替代它。
public static ExecutorService newSingleThreadExecutor()                                 创建只有一个线程的线程池对象，如果该线程出现异常而结束，那么线程池会补充一个新线程。
public static ExecutorService newCachedThreadPoo1()                                 线程数量随着任务增加而增加，如果线程任务执行完毕且空闲了60s则会被回收掉。
public static ScheduledExecutorService newScheduledThreadPool(int corePoolsize)     创建一个线程池，可以实现在给定的延迟后运行任务，或者定期执行任务。


----------------------------------------------------------------------------------------
核心线程数量

计算密集型的任:核心线程数量=CPU的核数+1
IO密集型的任务:核心线程数量= CPU核数*2

-----------------------------------------------------------------------------------------
Executors使用可能存在的陷阱
大型并发系统环境中使用Executors如果不注意可能会出现系统风险。

----------------------------------------------------------------------------------------
4．【强制】线程池不允许使用Executors去创建，而是通过ThreadPoolExecutor的方式，这
样的处理方式让写的同学更加明确线程池的运行规则，规避资源耗尽的风险。
说明:Executors返回的线程池对象的弊端如下:
1 ) FixedThreadPool和SingleThreadPool :
允许的请求队列长度为Integer.MAX_VALUE，可能会堆积大量的请求，从而导致OOM。
2 ) CachedThreadPool :
允许的创建线程数量为Integer.MAX_VALUE，可能会创建大量的线程，从而导致OOM。

--------------------------------------------------------------------------
`Thread.state` 6种状态
new runnable terminated 
blocked 阻塞
waiting 无限等待(有人唤醒才醒)
Timed waiting 计时等待


线程状态                                                                            说明
NEw(新建)                                                          线程刚被创建，但是并未启动。
Runnable(可运行)                                                   线程已经调用了start()，等待CPU调度
Blocked(锁阻塞)                                                    线程在执行的时候未竞争到锁对象，则该线程进入Blocked状态;
waiting(无限等待)                                                   一个线程进入waiting状态，另一个线程调用notify或者notifyAll方法才能够唤醒
Timed waiting(计时等待)                                             同waiting状态，有几个方法(sleep,wait)有超时参数，调用他们将进入Timed waiting状态。
Teminated(被终止)                                                  因为run方法正常退出而死亡，或者因为没有捕获的异常终止了run方法而死亡。


