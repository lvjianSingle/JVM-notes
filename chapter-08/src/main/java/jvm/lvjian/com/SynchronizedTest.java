package jvm.lvjian.com;

/**
 * Title: SynchronizedTest
 * Description: 同步省略（锁消除）
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/23 0:00
 */
public class SynchronizedTest {

    /**
     * 代码中对hellis这个对象加锁，但是hellis对象的生命周期只在f()方法中，并不会被其他线程所访问到，所以在JIT编译阶段就会被优化掉，优化成：
     *
     * public void f() {
     *     Object hellis = new Object();
     * 	System.out.println(hellis);
     * }
     *
     */
    public void f() {
        Object hellis = new Object();
        synchronized(hellis) {
            System.out.println(hellis);
        }
    }

}
