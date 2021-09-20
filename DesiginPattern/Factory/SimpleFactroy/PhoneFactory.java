package DesiginPattern.Factory.SimpleFactroy;

/**
 * 简单工厂类 负责所有手机的生产 将实例化产品过程从Client类中解耦
 * 
 * @author KureNaii
 * @version
 */
public class PhoneFactory {
    /**
     * 通过字符串匹配type来返回创建的实例
     * 
     * @param type
     * @return
     */
    public Phone createPhone(String type) {
        switch (type) {
            case "Iphone":
                return new Iphone();
            case "Huawei":
                return new Huawei();
            default:
                return null;
        }
    }
}
