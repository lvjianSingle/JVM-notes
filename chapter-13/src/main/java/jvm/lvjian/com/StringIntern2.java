package jvm.lvjian.com;

import java.util.concurrent.TimeUnit;

/**
 * Title: StringIntern2
 * Description: 使用Intern() 测试执行效率: 空间使用情况
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/27 11:12
 */
public class StringIntern2 {

    static final int MAX_COUNT = 1000 * 10000;

    static final String[] ARR = new String[MAX_COUNT];

    public static void main(String[] args) throws InterruptedException {
        Integer[] data = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        long start = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
//            ARR[i] = String.valueOf(data[i % data.length]);
//            ARR[i] = String.valueOf(data[i % data.length]).intern();
            ARR[i] = String.valueOf(data[i % data.length].intValue()).intern();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));

        TimeUnit.SECONDS.sleep(1000);
    }

}
