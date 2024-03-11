package class_study;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/06
 */
public class enum_study_MeiJuLei {
    public static void main(String[] args) {
        A a1=A.X;
        System.out.println(a1);
//        A a2=new A(); 构造器是私有的
        A.values();//拿到全部变量
        A a3=A.valueOf("Y");
        System.out.println(a3.name());
        System.out.println(a3.ordinal());
    }
}
