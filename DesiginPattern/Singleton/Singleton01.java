package DesiginPattern.Singleton;

/**
 * 饿汉式
 * 
 * @author KureNaii
 * @version 1.0
 */
public class Singleton01 {
    // 静态域中直接进行实例化，线程安全，但没有懒加载的效果
    private static Singleton01 singleton01 = new Singleton01();

    // 私有化构造函数
    private Singleton01() {
    }

    // 对外提供唯一实例
    public static Singleton01 getInstance() {
        return singleton01;
    }

    public void println() {
        System.out.println("Singleton1");
    }
}
