package DesiginPattern.Factory.FactoryMethod;

/**
 * 抽象客户类，直接在客户类中提供抽象的工厂方法
 * 
 * @author KureNaii
 * @version
 */
public abstract class AbstractClient {
    public void usePhone(Phone phone) {
        System.out.println("Using");
        phone.brand();
    }

    // 工厂方法
    public abstract Phone createPhone();

}
