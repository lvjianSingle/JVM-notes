package jvm.lvjian.com;

/**
 * Title: StackFrameTest
 * Description: 栈帧测试
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/18 17:06
 */
public class StackFrameTest {

    public static void main(String[] args) {
        StackFrameTest frameTest = new StackFrameTest();
        double v = frameTest.method1();

        String str = "test";
    }



    public double method1() {
        System.out.println("method1()方法开始");
        double i = 10.0d;
        int method2 = method2();
        System.out.println("method1()方法结束");
        return i + method2;
    }

    public int method2() {
        System.out.println("method2()方法开始");
        String method3 = method3();
        int i = 10;
        System.out.println("method2()方法结束");
        return i;
    }


    public String method3() {
        System.out.println("method3()方法开始");
        String returnStr = "Hello";
        System.out.println("method3()方法结束");
        return returnStr;
    }

}
