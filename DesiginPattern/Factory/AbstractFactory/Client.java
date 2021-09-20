package DesiginPattern.Factory.AbstractFactory;

/**
 * 客户类 客户需要多种产品的组合实现时使用该工厂模式，对应该例子，客户需要phone和 laptop的组合实例
 * 
 * @author KureNaii
 * @version
 */
public class Client {
    // 依赖抽象
    private AbstractFactory abstractFactory;

    public Client(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void useProduct() {
        System.out.println("Using");
        abstractFactory.createLaptop().brand();
        abstractFactory.createPhone().brand();
    }

    public static void main(String[] args) {
        Client client = new Client(new AppleFactory());
        client.useProduct();
    }
}
