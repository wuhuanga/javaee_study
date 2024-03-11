package FanXing;

/**
 * Description:
 * Param:
 * return:
 * Author:CHD
 * Date:2024/03/07
 */
public class MyArryList <E>{
    int size=0;
    Object[] a=new Object[10];
    public boolean add(E e){
        a[size++]=e;
        return true;
    }
    public E get(int index){

        return (E) a[size];
    }
}
