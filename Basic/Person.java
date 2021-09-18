package Basic;

/**
 * 自建测试类，测试 Java 中类的建造，继承等
 * 
 */
public class Person {
    // 成员变量私有化，对外提供getter，setter
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "My name is" + name + "." + "My age is" + age;
    }

    // @Override
    // public int equals(Object b) {

    // }

}
