package class_study;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/06
 */
public enum B {
//    X,Y,Z; 由于抽象类不能创建对象，第一行不能罗列对象，所以应该用匿名内部类来罗列
    X(){
    @Override
    public void run() {
        System.out.println("X");
    }
},Y(){
        @Override
        public void run() {
            System.out.println("Y");
        }
    };
    public abstract void run();
}
