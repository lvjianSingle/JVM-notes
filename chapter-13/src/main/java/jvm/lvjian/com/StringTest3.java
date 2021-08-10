package jvm.lvjian.com;

/**
 * Title: StringTest3
 * Description: TODO 描述一下这个类是干嘛的
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/27 10:20
 */
public class StringTest3 {

    public static void main(String[] args) {

        test1();
        System.out.println("=============分隔符============");
        test2();
        System.out.println("=============分隔符============");
        test3();
        System.out.println("=============分隔符============");
        test4();
        System.out.println("=============分隔符============");
        test5();

    }

    public static void test1() {
        String s1 = "a" + "b" + "c";  // 得到 abc的常量池  编译器优化
        String s2 = "abc"; // abc存放在常量池，直接将常量池的地址返回
        /**
         * 最终java编译成.class，再执行.class
         */
        System.out.println(s1 == s2); // true，因为存放在字符串常量池
        System.out.println(s1.equals(s2)); // true
    }

    public static void test2() {
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop"; //编译器优化
        //如果拼接符号的前后出现了变量，则相当于在堆空间中new String(), 具体到内容则是拼接的结果：javaEEhadoop
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4); // true
        System.out.println(s3 == s5); // false
        System.out.println(s3 == s6); // false
        System.out.println(s3 == s7); // false
        System.out.println(s5 == s6); // false
        System.out.println(s5 == s7); // false
        System.out.println(s6 == s7); // false

        String s8 = s6.intern();
        System.out.println(s3 == s8); // true
    }


    public static void test3() {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
        System.out.println(s3 == s4); //false
    }

    public static void test4() {
        final String s1 = "a";
        final String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
        System.out.println(s3 == s4); //true
    }




    public static void test5() {
        long startTime = System.currentTimeMillis();

        final int highLevel = 100000;
//        method1(highLevel); //4915ms
        method2(highLevel); //4ms

        long endTime = System.currentTimeMillis();

        System.out.println("花费的时间为:" + (endTime - startTime) + "ms");
    }


    public static void method1(int highLevel) {
        String src = "";
        for (int i = 0; i < highLevel; i++) {
            src += "a"; // 每次循环都会创建一个StringBuilder和String对象
        }
    }

    public static void method2(int highLevel) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < highLevel; i++) {
            sb.append("a");
        }
    }

}
