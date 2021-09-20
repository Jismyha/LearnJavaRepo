package DesiginPattern.Factory.AbstractFactory;

public class AppleFactory implements AbstractFactory {
    public Phone createPhone() {
        return new Iphone();
    }

    public Laptop createLaptop() {
        return new Mac();
    }

}
