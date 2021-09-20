package DesiginPattern.Factory.AbstractFactory;

/**
 * Factory类接口，定义Product的组合
 * 
 * @author KureNaii
 * @version
 */
public interface AbstractFactory {
    Phone createPhone();

    Laptop createLaptop();
}
