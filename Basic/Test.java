package Basic;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {

    private int code;
    private String string;

    static {
        System.out.println(" I am static block");
    }

    {
        code = 0;
        string = "hello";
    }

    {
        System.out.println("hello block");
    }

    public static void main(String[] args) {
        final int finalcode;
        finalcode = 1;
        System.out.println("hello world");
        Test test = new Test();
    }
}
