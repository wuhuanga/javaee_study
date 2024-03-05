package org.example.DuoTaiFinal;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/03
 */
public class Main {
    public static final String a="final修饰的成员变量只能赋值一次";
    public static void main(String[] args) {



        {
            people s1=new student();

            //a.study();    多态不能使用子类的独有方法

            //teacher t1 = (teacher) s1;// study --16

            if(s1 instanceof teacher){
                teacher t2 = (teacher) s1;
                t2.teach();
            }
            if(s1 instanceof student){
                student t2 = (student) s1;
                t2.study();
            }
        }

    }
}