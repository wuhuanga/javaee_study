package class_study;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/06
 */
public class Test2 {
    public static void main(String[] args) {
        swimming s1=new swimming(){

            @Override
            public void swim() {
                System.out.println("狗");
            }
        };
        run(s1);

        run(new swimming() {
            @Override
            public void swim() {
                System.out.println("11111");
            }
        });
    }
    public static void run(swimming s){
        s.swim();
    }
}
interface swimming{
    void swim();
}