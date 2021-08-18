package jvm.lvjian.com;

/**
 * Title: ClinitTest
 * Description: TODO 描述一下这个类是干嘛的
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/8/12 16:32
 */
public class ClinitTest {


    public static void main(String[] args) {
        UseChapterTest useChapterTest1 = new UseChapterTest();
        UseChapterTest useChapterTest2 = new UseChapterTest();

        System.out.println(UseChapterTest.num);
    }

}

class UseChapterTest {

    public final static int num = 1;

    static {
        System.out.println("1111111111");
    }

}
