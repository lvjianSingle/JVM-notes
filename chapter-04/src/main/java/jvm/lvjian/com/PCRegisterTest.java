package jvm.lvjian.com;

/**
 * Title: PCRegisterTest
 * Description: PC寄存器(程序计数器)测试
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/17 23:57
 */
public class PCRegisterTest {


    public static void main(String[] args) {
        /**
         * javap -v PCRegisterTest.class
         *
         * public static void main(java.lang.String[]);
         *     descriptor: ([Ljava/lang/String;)V
         *     flags: ACC_PUBLIC, ACC_STATIC
         *     Code:
         *       stack=2, locals=4, args_size=1
         *
         *      指令地址  操作指令
         *     (偏移地址)
         *          0: bipush        10
         *          2: istore_1
         *          3: bipush        20
         *          5: istore_2
         *          6: iload_1
         *          7: iload_2
         *          8: iadd
         *          9: istore_3
         *         10: return
         *       LineNumberTable:
         *         line 15: 0
         *         line 16: 3
         *         line 18: 6
         *         line 19: 10
         *       LocalVariableTable:
         *         Start  Length  Slot  Name   Signature
         *             0      11     0  args   [Ljava/lang/String;
         *             3       8     1     i   I
         *             6       5     2     j   I
         *            10       1     3     x   I
         *
         */
        int i = 10;
        int j = 20;

        int x = i + j;
    }

}
