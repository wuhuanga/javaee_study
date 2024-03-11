package FanXing;

import java.util.ArrayList;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/07
 */
public class Fanxing {
    public static void main ( String[]args) {
        //目标:理解泛型的注意事项.
        //1、泛型是工作在编译阶段的，一旦程序编译成class文件，class文件中就不存在泛型了，这就是泛型擦除。
        ArrayList<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        String rs= list.get(2);
        System.out.println(rs);
        //2、泛型不支持基本数据类型，只能支持对象类型（引用数据类型)。
//        ArrayList<int> a=new ArrayList<>(); //int
        ArrayList<Integer> a=new ArrayList<>();
    }

}
