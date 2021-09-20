package DesiginPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton01 singleton01 = new Singleton01();
        Singleton01 singleton01 = Singleton01.getInstance();
        Singleton01 singleton012 = Singleton01.getInstance();
        System.out.println(singleton01 == singleton012);
    }

}
