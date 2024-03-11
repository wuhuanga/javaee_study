package API.Object;

import java.util.Objects;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/07
 */
//Cloneable 标记接口
public class Student implements Cloneable{
    private String name;
    private int age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //如果地址一样直接返回true
        if (o == null || getClass() != o.getClass()) return false;
        //这个对象是null直接返回false，如果对象类型不一样返回false，getclass()object的函数
        // student.class != teacher.class
        //强转开始比较内容
        Student student = (Student) o;
        //
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Student s= (Student) super.clone();
//
//        return super.clone();
//    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
