package thread.funcation;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/09
 */
public class sleep_study {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 50; i++) {
            System.out.println("输出:" + i);
            if (i==3){
                Thread.sleep(5000);//5s
            }
        }
    }
}
