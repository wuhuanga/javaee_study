package class_study;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/06
 */
public enum A {//枚举类的第一行必须是罗列枚举对象的名称
    X,Y,Z;
    private String name;

    private A(String name) {// 都是私有的
        this.name = name;
    }

    A() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
