package jvm.lvjian.com;

import java.util.concurrent.TimeUnit;

/**
 * Title: StackAllocation
 * Description: 栈上分配
 *
 *  不开启逃逸分析，设置GC打印日志，内存1G: -Xmx1G -Xms1G -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 *
 *  开启逃逸分析(注意 jdk7之后默认开启逃逸分析)，设置GC打印日志，内存1G: -Xmx1G -Xms1G -XX:+DoEscapeAnalysis -XX:+PrintGCDetails /  -Xmx1G -Xms1G -XX:+PrintGCDetails
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/22 23:35
 */
public class StackAllocation {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_0_000_000; i++) {
            alloc();
        }

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start) + " ms");

        // 为了方便查看堆内存中对象个数，线程sleep
        TimeUnit.SECONDS.sleep(1000);
    }

    private static void alloc() {
        // 未发生逃逸
        User user = new User();
    }


    //实体
    static class User {

    }

}
