package jvm.lvjian.com;

/**
 * Title: IntCompTest
 * Description: 编译器测试
 *
 *
 * <pre>
 *     测试解释器和JIT编译器模式
 *      -Xint    (纯解释器模式)           : 6243ms
 *      -Xcomp   (纯编译器模式)           : 660ms
 *      -Xmixed  (解释器+编译器的混合模式)  : 979ms 657ms
 *
 * </pre>
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/26 17:24
 */
public class IntCompTest {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        testPrimeNumber(1_000_000);
        long endTime = System.currentTimeMillis();

        System.out.println("花费的时间: " + (endTime - startTime) + "ms");
    }


    public static void testPrimeNumber(int count) {
        for (int i = 0; i < count; i++) {
            //计算100以内的质数
            label:
            for (int j = 2; j <= 100; j++) {
                for (int k = 2; k < Math.sqrt(j); k++) {
                    if (j % k == 0) {
                        continue label;
                    }
                }
            }
        }

    }

}
