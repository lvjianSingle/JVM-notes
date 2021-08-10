package jvm.lvjian.com;

import java.util.concurrent.TimeUnit;

/**
 * Title: HeapSpaceInitial
 * Description: TODO 描述一下这个类是干嘛的
 *
 *
 * -Xms600M -Xmx600M -XX:+PrintGCDetails
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/20 23:55
 */
public class HeapSpaceInitial {

    public static void main(String[] args) {
        // 返回Java虚拟机中的堆内存总量(默认占用物理机内存的1/64)
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        // 返回Java虚拟机试图使用的最大堆内存(默认占用物理机内存的1/4)
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        System.out.println("-Xms:" + initialMemory + "M");
        System.out.println("-Xmx:" + maxMemory + "M");

//        System.out.println("系统内存大小为: " + initialMemory * 64.0 / 1024 + "G");
//        System.out.println("系统内存大小为: " + maxMemory * 4.0 / 1024 + "G");


//        try {
//            TimeUnit.SECONDS.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }

}
