package DesiginPattern.Singleton;

/**
 * 懒汉式
 * 
 * @author KureNaii
 * @version 1.0
 */
public class Singleton02 {
    // 静态域不赋值，在getInstance方法中赋值，从而达到懒加载效果
    private static Singleton02 singleton02;

    private Singleton02() {
    }

    // 此方法线程不安全，需要加锁
    public static Singleton02 getInstance1() {
        if (singleton02 == null) {
            return new Singleton02();
        } else
            return singleton02;
    }

    // 直接加锁保证线程安全，但每次调用都需要检查锁的状态，而实际需求只需要初次调用时加锁，浪费资源
    public static synchronized Singleton02 getInstance2() {
        if (singleton02 == null) {
            return new Singleton02();
        } else
            return singleton02;
    }

    public void println() {
        System.out.println("Singleton2");
    }
}
