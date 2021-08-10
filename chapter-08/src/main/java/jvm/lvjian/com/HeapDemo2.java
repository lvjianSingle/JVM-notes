package jvm.lvjian.com;

import java.util.concurrent.TimeUnit;

/**
 * Title: HeapDemo2
 * Description: TODO 描述一下这个类是干嘛的
 *
 *
 * -Xms20m -Xmx20m
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/20 17:06
 */
public class HeapDemo2 {

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
