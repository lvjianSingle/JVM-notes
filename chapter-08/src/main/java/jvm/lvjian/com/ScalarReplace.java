package jvm.lvjian.com;

/**
 * Title: ScalarReplace
 * Description: 标量替换
 *
 *
 *  关闭标量替换、设置堆空间大小、开启逃逸分析、打印GC日志：-Xmx100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-EliminateAllocations
 *
 *  开启标量替换、设置堆空间大小、开启逃逸分析、打印GC日志：-Xmx100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:+EliminateAllocations
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/23 0:09
 */
public class ScalarReplace {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            alloc();
        }

        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start) + " ms");
    }



    public static void alloc() {
        User user = new User(); //未发生逃逸
        user.id = 5;
        user.name = "JVM scalar replace";

    }

    public static class User {
        private int id;
        private String name;
    }

}
