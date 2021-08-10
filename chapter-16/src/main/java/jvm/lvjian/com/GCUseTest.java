package jvm.lvjian.com;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Title: GCUseTest
 * Description: GC参数使用测试
 *
 *  -XX:+PrintCommandLineFlags
 *
 *
 *  -XX:+UserSerialGC: 表明新生代使用serial GC，同时老年代使用serial Old GC
 *
 *  -XX:+UseParNewGC: 表明新生代使用ParNew GC
 *
 *  -XX:+UseParallelGC: 表明新生代使用Parallel GC
 *  -XX:+UseParallelOldGC: 表明老年代使用Parallel Old GC
 *  说明：二者可以相互激活（使用Parallel Old GC时会自动激活Parallel GC，反之使用Parallel GC也是、会激活Parallel Old GC）
 *
 * -XX:+UseConcMarkSweepGC:
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/8/1 16:59
 */
public class GCUseTest {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Object> list = new ArrayList<>();
        while (true) {
            byte[] bytes = new byte[100];
            list.add(bytes);
            TimeUnit.MILLISECONDS.sleep(20);
        }

    }


}
