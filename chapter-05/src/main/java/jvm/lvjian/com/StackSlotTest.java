package jvm.lvjian.com;

/**
 * Title: StackSlotTest
 * Description: TODO 描述一下这个类是干嘛的
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/18 18:22
 */
public class StackSlotTest {


    public void test() {
        int a = 0;
        {
            int b = 0;
            b = a + 10;
        }

        /**
         *     LocalVariableTable:
         *         Start  Length  Slot  Name   Signature
         *             4       5     2     b   I
         *             0      14     0  this   Ljvm/lvjian/com/StackSlotTest;
         *             2      12     1     a   I
         *            13       1     2     c   I
         */
        //变量c使用之前已经被销毁的变量b占据的slot的位置
        int c = a + 2;
    }

}
