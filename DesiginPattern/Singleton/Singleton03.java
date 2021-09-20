package DesiginPattern.Singleton;

/**
 * 静态内部类
 * 
 * @author KureNaii
 * @version 1.0
 */
public class Singleton03 {

    private Singleton03() {
    }

    // 静态内部类SingletonInstance，通过 jvm 类加载的机制达到懒加载和线程安全的效果
    private static class SingletonInstance {
        private static Singleton03 singleton03 = new Singleton03();
    }

    public static Singleton03 getInstance() {
        return SingletonInstance.singleton03;
    }
}
