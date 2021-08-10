package jvm.lvjian.com;

/**
 * Title: StringTest4
 * Description: TODO 描述一下这个类是干嘛的
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/27 15:56
 */
public class StringTest4 {

    public static void main(String[] args) {
        String s1 = new String("ab");
//        String s1 = new String("a") + new String("b");
        String s3 = s1.intern();

        String s2 = "ab";

        System.out.println(s1 == s2);
        System.out.println(s3 == s2);

    }

}
