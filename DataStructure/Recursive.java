package DataStructure;

/**
 * 递归应用与测试类
 * <p>
 * （例子主要参考自 《Java数据结构与算法 第二版》）
 * </p>
 * 
 * @author KureNaii
 * @version 1.0
 */
public class Recursive {

    /**
     * 毕达哥拉斯三角数 递归实现
     * <p>
     * a1= 1 a2 =3 a3=6 a4=10 an = n + an-1
     * </p>
     * 
     * @param num
     * @return
     */
    public static int triangle(int num) {
        // base case
        if (num == 1) {
            return 1;
        }
        return num + triangle(num - 1);
    }

    /**
     * 阶乘 递归实现
     * <p>
     * a0 = 1 an=n*an-1
     * </p>
     * 
     * @param num
     * @return
     */
    public static long factorial(long num) {
        // base case
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(triangle(100));
        System.out.println(factorial(10));
    }
}
