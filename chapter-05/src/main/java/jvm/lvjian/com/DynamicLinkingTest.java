package jvm.lvjian.com;

/**
 * Title: DynamicLinkingTest
 * Description: 动态链接
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/19 15:17
 */
public class DynamicLinkingTest {

    private int num = 10;

    public void methodA() {
        System.out.println("methodA()");
    }

    public void methodB() {
        System.out.println("methodB()");
        methodA();
        num ++;
    }

}
