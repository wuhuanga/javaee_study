package thread.study;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/08
 */
public class Runnable_study implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("runnable" + i);
        }
    }
}
