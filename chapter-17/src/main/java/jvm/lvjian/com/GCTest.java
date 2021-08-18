package jvm.lvjian.com;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Title: GCTest
 * Description: TODO 描述一下这个类是干嘛的
 *
 * -Xms60m -Xmx60m -XX:SurvivorRatio=8
 *
 *
 * 发生OOM时 自动导出内存映射信息数据：
 *  -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=<filename.hprof>
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/8/11 21:04
 */
public class GCTest {


    public static void main(String[] args) throws InterruptedException {
        ArrayList<byte[]> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            //100kb
            byte[] bytes = new byte[1024 * 100];

            list.add(bytes);

            TimeUnit.MILLISECONDS.sleep(50);
        }

    }


}
