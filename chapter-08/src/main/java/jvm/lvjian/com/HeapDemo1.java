package jvm.lvjian.com;

import java.util.concurrent.TimeUnit;

/**
 * Title: HeapDemo1
 * Description: HeapDemo1
 *
 *  -Xms10m -Xmx10m
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/20 17:05
 */
public class HeapDemo1 {


    public static void main(String[] args) {
        System.out.println("start");
        try {
            TimeUnit.HOURS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }


}
