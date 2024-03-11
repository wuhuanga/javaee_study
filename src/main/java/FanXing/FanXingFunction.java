package FanXing;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/07
 */
public class FanXingFunction {
    public static <E> E add(E e){

        return e;
    }

    public static void main(String[] args) {
        add("111");
        add(new FanXingFunction());
    }
}
