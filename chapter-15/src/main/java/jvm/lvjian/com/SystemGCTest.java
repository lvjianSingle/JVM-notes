package jvm.lvjian.com;

/**
 * Title: SystemGCTest
 * Description: System.gc()
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/30 15:24
 */
public class SystemGCTest {

    public static void main(String[] args) {
        new SystemGCTest();
        // 提醒JVM进行垃圾回收
        System.gc();

        //强制调用 失去引用对象的finalize()
        System.runFinalization();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("SystemGCTest 执行了 finalize方法");
    }

}
