package jvm.lvjian.com;

import java.util.concurrent.TimeUnit;

/**
 * Title: EdenSurvivorTest
 * Description: Eden Survivor
 *
 *
 * -Xms600M -Xmx600M
 *
 * -XX:NewRation: 设置新生代与老年代的内存比例 默认是1:2, 既-XX:NewRation=2
 *  可以设置-XX:NewRation=3后观察内存比例变化
 *
 * -XX:SurvivorRatio: 设置Eden区与Survivor区的内存比例，默认为8
 *
 * -XX:-UseAdaptiveSizePolicy: 关闭自适应的内存分配策略
 *
 * -Xmn: 设置新生代的内存空间大小 （一般不设置）
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/22 15:56
 */
public class EdenSurvivorTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");

        TimeUnit.SECONDS.sleep(100);
    }

}
