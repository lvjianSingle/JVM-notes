package jvm.lvjian.com;

import sun.misc.Launcher;

import java.net.URL;
import java.util.Arrays;

/**
 * Title: ClassLoaderTest2
 * Description: TODO 描述一下这个类是干嘛的
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/16 22:54
 */
public class ClassLoaderTest2 {

    public static void main(String[] args) {

        System.out.println("***********启动类加载器***********");
        //获取BootstrapClassLoader能够加载的api路径
        URL[] classPathURLs = Launcher.getBootstrapClassPath().getURLs();
        Arrays.stream(classPathURLs).forEach(url -> System.out.println(url.toExternalForm()));


        System.out.println("***********启动类加载器***********");
        String extDriPath = System.getProperty("java.ext.dirs");
        String[] pathUrl = extDriPath.split(";");
        Arrays.stream(pathUrl).forEach(System.out::println);
    }

}
