package Basic.MutiThread.Communicate;

public class Main {
    public static void main(String[] args) {
        StoreThread thread = new StoreThread();
        new Thread(thread, "thread 0").start();
        new Thread(thread, "thread 1").start();
        new Thread(thread, "thread 2").start();
        new Thread(thread, "thread 3").start();
    }
}
