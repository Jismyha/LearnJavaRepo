package Basic.Collection;

/**
 * 自定义泛型类
 * 
 * @author KureNaii
 * @since 2021-11-22 10:29:02
 */
public class MyGenericClass<T> {
    private T code;

    public MyGenericClass() {
        this.code = null;
    }

    public MyGenericClass(T code) {
        this.code = code;
    }

    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.code = code;
    }

    public static void main(String[] args) {
        MyGenericClass<String> myGenericClass = new MyGenericClass<>("Mycode");
        System.out.println(myGenericClass.getCode());
    }

}
