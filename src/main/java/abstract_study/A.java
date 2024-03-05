package abstract_study;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/03
 */
public abstract class A {
    int num=0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    A(){

    }
    public abstract void run();

}
