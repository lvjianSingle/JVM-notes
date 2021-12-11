package jvm.lvjian.com;

/**
 * Title: StringGCTest
 * Description: String的垃圾回收
 *
 * -XX:+PrintStringTableStatistics: 显示字符串常量池中的基本使用信息
 *
 * -Xms15m -Xmx15m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/27 16:21
 */
public class StringGCTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            String.valueOf(i).intern();
        }
    }

}
