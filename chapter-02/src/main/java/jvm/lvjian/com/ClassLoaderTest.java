package jvm.lvjian.com;

/**
 * Title: ClassLoaderTest
 * Description: ClassLoader
 *
 * @author lvjian
 * @version 1.0.0
 * @date 2021/7/16 22:43
 */
public class ClassLoaderTest {

    public static void main(String[] args) {

        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//jdk.internal.loader.ClassLoaders$AppClassLoader@1f89ab83

        //获取扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//jdk.internal.loader.ClassLoaders$PlatformClassLoader@129a8472

        //获取java引导类加载器
        ClassLoader bootClassLoader = extClassLoader.getParent();
        System.out.println(bootClassLoader);//null


        //查看自定义的类用的哪种加载器
        ClassLoader classLoader1 = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader1);//jdk.internal.loader.ClassLoaders$AppClassLoader@1f89ab83

        //查看JDK核心类库的加载器
        ClassLoader classLoader2 = Object.class.getClassLoader();
        System.out.println(classLoader2);//null

    }

}
