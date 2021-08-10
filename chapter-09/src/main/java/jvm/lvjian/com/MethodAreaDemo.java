package jvm.lvjian.com;

import java.util.concurrent.TimeUnit;

/**
 * Title: MethodAreaDemo
 * Description: 测试设置方法区大小参数的默认值
 *
 *
 *  以下参数只针对JDK7及之前的
 *    -XX:PermSize     : 设置永久代初始分配空间，默认值为20.75M。
 *    -XX:MaxPermSize  : 设置永久代最大可分配空间，32位机器默认64M，64为机器默认82M。
 *
 *  JDK8及之后的不再有永生代了，只有元空间，所有参数也有所变化
 *   -XX:MetaspaceSize    : 设置初始的元空间大小，Windows平台默认为21M。
 *   -XX:MaxMetaspaceSize : 设置元空间最大的空间，默认为-1，表示不限制。
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/23 21:24
 */
public class MethodAreaDemo {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        TimeUnit.SECONDS.sleep(1000);
        System.out.println("end");
    }

}
