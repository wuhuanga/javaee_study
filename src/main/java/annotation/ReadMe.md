Target
作用:声明被修饰的注解只能在哪些位置使用@Target(ElementType.TYPE)   
1. TYPE,类，接口
2. FIELD，成员变量
3. METHOD，成员方法
4. PARAMETER，方法参数
5. CONSTRUCTOR，构造器
6. LOCAL_VARIABLE,局部变量


@Retention
作用:声明注解的保留周期。
@Retention(RetentionPolicy. RUNTIME)
1.SOURCE
只作用在源码阶段。字节码文件中不存在。
2.CLASS(默认值)
保留到字节码文件阶段,运行阶段不存在.
3.RUNTIME(开发常用)
一直保留到运行阶段。

