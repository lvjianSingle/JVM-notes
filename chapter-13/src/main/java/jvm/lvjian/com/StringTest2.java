package jvm.lvjian.com;

/**
 * Title: StringTest2
 * Description: 字符串 常量池
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/26 21:01
 */
public class StringTest2 {

    public static void main(String[] args) {
        System.out.println("1");//2188
        System.out.println("2");//2190 一个换行符+字符串'2'
        System.out.println("3");//2191
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");//2194

        System.out.println();//2195

        System.out.println("1");//2195
        System.out.println("2");//2195
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");//2195
    }

}
