package API.Object;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/07
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student ns=new Student("zha",12);
        System.out.println(ns.toString());
        Student ns2=new Student("zha",12);
        System.out.println(ns.equals(ns2));//false 因为地址不一样
        System.out.println(ns == ns2);//同上
        Student ns3= (Student) ns.clone();
        System.out.println(ns3.toString());
        System.out.println(ns3.equals(ns));
    }
}
