package JDK8_Interface;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/05
 */
public class Test {
    public static void main(String[] args) {
        B b=new B();
        b.test1();
        A.test3();
    }
}
interface C{
    void test1();
}
interface d{
//    char test1();
}
interface e{}
interface f extends C,d,e{}

class g implements f{

    @Override
    public void test1() {

    }

}
