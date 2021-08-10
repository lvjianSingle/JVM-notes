package jvm.lvjian.com;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Title: OOMTest
 * Description: OOM
 *
 *  -Xms64M -Xmx64M
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/21 0:15
 */
public class OOMTest {


    public static void main(String[] args) {
        ArrayList<Picture> pictures = new ArrayList<>();
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pictures.add(new Picture(new Random().nextInt(1024 * 1024)));
        }


    }


}

class Picture {

    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }

}
