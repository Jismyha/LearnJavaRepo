package DesiginPattern.Factory.FactoryMethod;

/**
 * 客户类的具体实现类。需要什么手机，就继承抽象客户类并且实现createPhone方法来实例化类，这里的客户类实际上是Creator
 * 
 * @author KureNaii
 * @version
 */
public class ClientUseIphone extends AbstractClient {
    public Phone createPhone() {
        return new Iphone();
    }

    public static void main(String[] args) {
        ClientUseIphone clientUseIphone = new ClientUseIphone();
        clientUseIphone.usePhone(clientUseIphone.createPhone());
    }
}
