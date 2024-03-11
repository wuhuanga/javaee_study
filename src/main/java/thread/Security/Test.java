package thread.Security;


/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/09
 */
public class Test {
    public static void main(String[] args) {
        Account there = new Account(10000);
        new ThreadClass(there,"ming").start();
        new ThreadClass(there,"hong").start();

        Account there1 = new Account(10000);
        new ThreadClass(there1,"hei").start();
        new ThreadClass(there1,"bai").start();
    }
}
