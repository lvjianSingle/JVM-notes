package jvm.lvjian.com;

/**
 * Title: ScalarReplaceExplain
 * Description: 标量替换
 *
 * <pre>
 *    标量（scalar）是指一个无法再分解成更小的数据的数据。Java中的原始数据类型就是标量。
 *
 *   相对的，那些还可以分解的数据叫做聚合量（Aggregate），Java中的对象就是聚合量，因为他可以分解成其他聚合量和标量。
 *
 *   在JIT阶段，如果经过逃逸分析，发现一个对象不会被外界访问的话，那么经过JIT优化，就会把这个对象拆解成若干个其中包含的若干个成员变量来代替。这个过程就是标量替换。
 *
 *
 *   参数一xx：+EliminateAllocations：开启了标量替换（默认打开），允许将对象打散分配在栈上，比如对象拥有id和name两个字段，那么这两个字段将会被视为两个独立的局部变量进行分配
 * </pre>
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/23 0:03
 */
public class ScalarReplaceExplain {

    public static void main(String args[]) {
        alloc();
    }

    private static void alloc() {
        Point point = new Point(1,2);
        System.out.println("point.x" + point.x + ";point.y" + point.y);
    }

    /**
     * 以上代码，经过标量替换后，就会变成
     */
    private static void allocReplace() {
        int x = 1;
        int y = 2;
        System.out.println("point.x = " + x + "; point.y=" + y);
    }

    static class Point {
        private int x;
        private int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
