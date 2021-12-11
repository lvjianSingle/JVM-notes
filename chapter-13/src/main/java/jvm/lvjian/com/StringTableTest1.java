package jvm.lvjian.com;

import java.util.concurrent.TimeUnit;

/**
 * Title: StringTableTest1
 * Description: 设置StringTableSize
 *
 * jdk6 默认StringTableSize=1009
 *
 * jdk7 默认StringTable=60013, 范围没有要求
 * jdk8 默认StringTable=60013，范围在1009~(2^61)-1
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/11/27 23:59
 */
public class StringTableTest1 {


	public static void main(String[] args) throws InterruptedException {
		System.out.println("启动");


		final long startTime = System.currentTimeMillis();

		for (int i = 0; i < 200000; i++) {
			String str = "a"+ i;
			System.out.println(str.intern());
		}

		final long endTime = System.currentTimeMillis();

		System.out.println("用时: " + (endTime - startTime) + "ms"); //=60013 708ms, =1009 1061ms

//		TimeUnit.SECONDS.sleep(1000);
	}

}
