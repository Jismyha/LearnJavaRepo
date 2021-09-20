package DesiginPattern.Factory.SimpleFactroy;

/**
 * 客户类 与产品类形成依赖
 * 
 * @author KureNaii
 * @version 1.0
 */
public class Client {
    // 保留一个工厂的引用
    private PhoneFactory phoneFactory;

    // 初始化时需要给客户一个工厂实例的引用
    public Client(PhoneFactory phoneFactory) {
        this.phoneFactory = phoneFactory;
    }

    public void usePhone(String type) {
        // 将Client与Product的具体实现解耦，Client中不涉及具体Product的实现类
        Phone phone = phoneFactory.createPhone(type);
        System.out.println("I am Using");
        phone.brand();
    }

    // 测试
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Client client = new Client(phoneFactory);
        client.usePhone("Iphone");
        client.usePhone("Huawei");
    }

}
