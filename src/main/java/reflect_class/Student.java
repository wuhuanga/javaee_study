package reflect_class;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/10
 */
public class Student {
    public static String me;
    public static final String he="he";
    private String name;
    public int age;

    private Student() {
        System.out.println("无参");
    }

    Student(String name, int age) {
        System.out.println("有参");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
