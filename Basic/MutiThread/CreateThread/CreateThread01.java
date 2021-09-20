package Basic.MutiThread.CreateThread;

/**
 * 多线程创建方法 1.类继承 Thread 方法 信息共享只能通过静态成员变量实现
 * 
 * @author KureNaii
 * @version 1.0
 */
public class CreateThread01 extends Thread {
    // 实现 run() 方法
    public void run() {
        while (true) {
            System.out.println("I am Thread 01");
        }
    }
}
