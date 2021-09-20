package Basic.MutiThread.Communicate;

/**
 * 通过 {@code ticket} 变量测试线程间通信，
 * 
 * @author KureNaii
 * @version
 */
public class StoreThread implements Runnable {
    // 初始化100张票
    private volatile int ticket = 500;

    // 线程方法
    public void run() {
        synSell();
    }

    // 不加锁
    private void sell() {
        while (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + " is selling the " + ticket--);
        }
    }

    // 加锁
    private synchronized void synSell() {
        while (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "is selling the" + ticket--);
        }
    }
}
