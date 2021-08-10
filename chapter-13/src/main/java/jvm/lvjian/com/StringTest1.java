package jvm.lvjian.com;

import java.util.concurrent.TimeUnit;

/**
 * Title: StringTest1
 * Description: TODO 描述一下这个类是干嘛的
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/26 20:17
 */
public class StringTest1 {

    public static void main(String[] args) throws InterruptedException {
        String s = "hello";

        String intern = s.intern();

        System.out.println(intern);

        TimeUnit.SECONDS.sleep(1000);
    }

}
