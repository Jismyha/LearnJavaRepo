public class ExceptionTest extends Exception {
    private String rtnMsg;
    private String rtnCode;

    public String getRtnMsg() {
        return rtnMsg;
    }

    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }

    public String getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }

    public ExceptionTest() {
        super();
    }

    public ExceptionTest(String rtnMsg) {
        super(rtnMsg);
        this.rtnMsg = rtnMsg;
    }

    public ExceptionTest(String rtnCode, String rtnMsg) {
        super();
        this.rtnCode = rtnCode;
        this.rtnMsg = rtnMsg;
    }

    // 方法中抛出异常，可直接向外 throws交给调用方处理
    public static void createExceptionAndThrows() throws ExceptionTest {
        System.out.println("I am in createExceptionAndThrows()");
        // throw 关键字抛出异常
        throw new ExceptionTest("404", "MyExceptionTest");
    }

    // 也可以直接用 try catch finally Handle掉
    public static void createExceptionAndHandle() {
        try {
            System.out.println("I am in createExceptionAndHandle()");
            throw new ExceptionTest("404", "MyExceptionTest");
        } catch (ExceptionTest eTest) {
            System.out.println("MyExceptionHandled");
        }
    }

    public static void main(String[] args) throws ExceptionTest {
        // 由于方法中未处理抛出的异常，需要在 main 函数中处理，也可以直接抛出
        try {
            ExceptionTest.createExceptionAndThrows();
        }
        // 由于未处理异常，程序无法执行下面的方法
        finally {
            ExceptionTest.createExceptionAndHandle();
        }
    }
}
