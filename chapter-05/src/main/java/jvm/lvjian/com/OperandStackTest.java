package jvm.lvjian.com;

/**
 * Title: OperandStackTest
 * Description: 操作数栈
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/19 14:50
 */
public class OperandStackTest {


    public void testAddOperation() {
        //byte、short、char和boolean都以int型来保存
        byte i = 15;
        int j = 8;
        int k = i + j;

        //sipush 800: short -> int push 800
        int m = 800;

        int m2 = 8000000;

    }

}
