package Basic.MutiThread.CreateThread;

public class Main {
    public static void main(String[] args) {
        // 继承Thread的类启动线程直接new+start
        new CreateThread01().start();
        // 实现Runnable方法的类启动线程需要构造出Thread类再start
        new Thread(new CreateThread02()).start();
    }

}
