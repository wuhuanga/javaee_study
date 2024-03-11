package FanXing;

import java.util.ArrayList;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/07
 */
public class Test {
    public static void main(String[] args) {
        // 泛型
        ArrayList a=new ArrayList();
        a.add("11");
        a.add("222");
//        cat<String> c=new cat<>();
        a.add(new cat());
        for (int i = 0; i < a.size(); i++) {
            String a1= (String) a.get(i);
            System.out.println(a1);
        }
        //===========================
        ArrayList<String> b =new ArrayList<>();//1.7之后new后面的数据类型可以不声明
        b.add("11");

    }
}
class cat<E>{

}
