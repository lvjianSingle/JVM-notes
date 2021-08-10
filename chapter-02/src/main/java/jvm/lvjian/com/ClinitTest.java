package jvm.lvjian.com;

/**
 * Title: ClinitTest
 * Description: jvm clinit
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/16 22:25
 */
public class ClinitTest {


    static class Father {

        public static int a = 1;

        static {
            a = 10;
        }

    }


    static class Son extends Father {

        public static int b = a;

    }

    public static void main(String[] args) {
        //先加载父类，其次加载子类
        System.out.println(Son.b);
    }


}
