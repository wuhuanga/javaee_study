package JDK8_Interface;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/05
 */
public interface A {
    default void test1(){
        System.out.println("==默认方法==");
    }
    //私用方法：从JDK 9开始的
//    private void test2(){
//
//    }
    public static void test3(){

    }
    void test4();
    void test5();

}
