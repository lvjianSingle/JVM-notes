package jvm.lvjian.com;

import java.util.ArrayList;

/**
 * Title: HeapOOM
 * Description: 内存溢出排查
 *
 *  -Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/29 17:51
 */
public class HeapOOM {

    // 创建1M的文件
    byte [] buffer = new byte[1 * 1024 * 1024];

    public static void main(String[] args) {
        ArrayList<HeapOOM> list = new ArrayList<>();
        int count = 0;
        try {
            while (true) {
                list.add(new HeapOOM());
                count++;
            }
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("count:" + count);
        }
    }

}
