package class_study;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/06
 */
public class outer {
    int b=100;
    static String name;

    public class demo1{
        int b=120;
        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        //普通成员内部类,
        String a="和普通类一样";//JDK16以后才支持静态成员变量
        public void test1(){
            System.out.println("普通内部类被调用了");
            System.out.println(a);
            int b=66;
            System.out.println(b);//66代码块
            System.out.println(this.b);//120内部类
            System.out.println(outer.this.b);//100外部类

        }
    } //普通内部类
    public static class demo2{
        void test(){
            System.out.println(name);
//            System.out.println(b); b

        }
    }  //静态内部类,和普通类一样

    public static void main(String[] args) {
        //------------------------------------------------------
        //1.把它编译成子类，并立即为其创建一个子类对象 匿名内部类
        Animal a=new Animal(){
            @Override
            public void cry() {
                System.out.println("miao");
            }
        };
        a.cry();
    }


}
//class cat extends Animal{         //正常类
//
//    @Override
//    public void cry() {
//        System.out.println("miao");
//    }
//}
abstract class Animal{
    public abstract void cry();
}
