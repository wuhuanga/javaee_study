package class_study;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/06
 */
public class Test {
    public static void main(String[] args) {
        //outer.demo1 a=new outer.demo1(); 不可以这样子
        outer.demo1 a=new outer().new demo1(); // 普通内部类
        a.test1();
        outer.demo2 b=new outer.demo2(); //静态内部类

    }
}
