package Basic.MutiThread.CreateThread;

/**
 * 创建线程 2.实现 Runnable 接口 信息共享通过成员变量实现
 * 
 * @author KureNaii
 * @version 1.0
 */
public class CreateThread02 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("I am Thread 02");
        }
    }
}
