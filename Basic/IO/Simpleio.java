package Basic.IO;

import java.util.Scanner;

public class Simpleio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNext("0")) {
            System.out.println(scan.next());
        }
        scan.close();
    }
}
