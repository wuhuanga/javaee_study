package reflect_class;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/10
 */
public class Test2 {
    @Test
    public void Getconstructor() throws ClassNotFoundException, NoSuchMethodException {
        Class a = Student.class;
        System.out.println(a.getName());
        System.out.println(a.getSimpleName());
//        //-----------
//        Class b=Class.forName("reflect_class.Student");
//        System.out.println(a == b);
//        //------------
//        Student g = new Student("a",10);
//        Class c = g.getClass();
//        System.out.println(c == a);
//        Constructor[] constructors= a.getConstructors();
        Constructor[] constructors= a.getDeclaredConstructors();
        for (Constructor x:constructors){
            System.out.println(x.getName()+"--->"+
                    x.getParameterCount()); //获得参数个数
        }
//        System.out.println(x.constructor);


    }
    @Test
    public void TestGetConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = Student.class;
//        Constructor con = c.getConstructor();
        Constructor con = c.getDeclaredConstructor();
        System.out.println(con.getName()+"----->"+con.getParameterCount());
        try {
            con.setAccessible(true);
            Student a = (Student)con.newInstance();
            System.out.println(a);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        Constructor con1 = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(con1.getName()+"----->"+con1.getParameterCount());
        con1.newInstance("12",1);

    }
    @Test
    public void TestGetField() throws NoSuchFieldException, IllegalAccessException {
        Class c=Student.class;
        Field[] fields= c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName()+"--"+field.getType());
        }
        Field age1=c.getField("age");
        System.out.println(age1.getName()+"--"+age1.getType());
        Student stu=new Student("11",12);
        //赋值
        Field name1=c.getDeclaredField("name");
        System.out.println(name1.getName()+"--"+name1.getType());
        name1.setAccessible(true);
        name1.set(stu,"s1");
        System.out.println(stu.getName());
        //获取值
        System.out.println(name1.get(stu));
    }
    @Test
    public void Testaaa(){

    }
}
