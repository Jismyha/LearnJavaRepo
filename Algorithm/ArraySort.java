package Algorithm;

import java.util.Arrays;

/**
 * 基于最简单的int数组的排序算法集合类
 * 
 * @author KureNaii
 * @version 1.0
 */
public class ArraySort {
    /**
     * 冒泡排序 时间复杂度 O(n^2) 稳定
     * 
     * @param numbers int []
     * @return result int[]
     */
    public static int[] bubbleSort(int[] numbers) {
        // 拷贝实参
        int[] result = Arrays.copyOf(numbers, numbers.length);

        // 外层循环每走一次确定一个最大值，最坏情况需要n-1次排序
        for (int i = 0; i < (result.length - 1); i++) {
            // flag判断排序是否完成
            boolean flag = true;
            // 外层每确定一次，内层少排一次，所以应该减去i
            for (int j = 0; j < (result.length - i - 1); j++) {
                // 若小索引值大于大索引，则交换位置
                if (result[j] > result[j + 1]) {
                    swap(result, j, j + 1);
                    flag = false;
                }
            }
            // 内层遍历未出现交换，说明排序已完毕，无需再循环
            if (flag) {
                break;
            }
        }
        return result;
    }

    /**
     * 选择排序 O(n^2) 不稳定
     * 
     * @param numbers int[]
     * @return result int[]
     */
    public static int[] selectSort(int[] numbers) {
        // 拷贝实参
        int[] result = Arrays.copyOf(numbers, numbers.length);

        for (int i = 0; i < result.length - 1; i++) {
            // 每次循环选出最小的值放在开头，剩下n-i个数中继续选择
            // int minValue = numbers[i]; (有索引，不需要minValue)
            int minIndex = i;
            for (int j = i + 1; j < result.length; j++) {
                if (result[j] < result[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                // 将最小值交换到最开头
                swap(result, i, minIndex);
            }
        }

        return result;
    }

    /**
     * 插入排序 O(n^2) 稳定
     * 
     * @param numbers int[]
     * @return result int[]
     */
    public static int[] insertSort(int[] numbers) {
        // 拷贝实参
        int[] result = Arrays.copyOf(numbers, numbers.length);
        // 将第一个元素设为有序序列，其余元素为无序序列，将无序序列一个一个插入有序序列中
        for (int i = 1; i < result.length; i++) {
            // 保留要插入的值，并将该位留空
            int tempt = result[i];
            // 将第i个元素跟有序序列中的元素比较
            int j = i - 1;
            while (j >= 0 && result[j] > tempt) {
                // 把比tempt大的数都往后移一位，直到遇见比tempt小的数
                result[j + 1] = result[j];
                j--;
            }
            // 判断有没有做上面的循环，没有做无需赋值
            if (j != i) {
                result[j + 1] = tempt;
            }
        }
        return result;
    }

    /**
     * 希尔排序 (插排改良） 不稳定 默认增量为
     * <p>
     * {@code int N = numbers.length/2}
     * </p>
     * 
     * @param numbers int[]
     * @return result int[]
     */
    public static int[] shellSort(int[] numbers) {
        // 拷贝实参
        int[] result = Arrays.copyOf(numbers, numbers.length);
        for (int gap = result.length / 2; gap > 0; gap /= 2) {
            // 从gap开始对对前面的有序序列进行插入排序
            for (int i = gap; i < result.length; i++) {
                // 采用交换法
                int j = i;
                while (j - gap >= 0 && result[j] < result[j - gap]) {
                    swap(result, j, j - gap);
                    j -= gap;
                }

            }
        }

        return result;
    }

    /**
     * 归并排序 O(nlogn) 稳定
     * 
     * @param numbers int[]
     * @return result int[]
     */
    public static int[] mergeSort(int[] numbers) {

    }

    /**
     * 内部交换函数，交换数组中i索引和j索引的值
     * 
     * @param numbers int[]
     * @param i       int 索引
     * @param j       int 索引
     */
    private static void swap(int[] result, int i, int j) {
        int tempt = result[i];
        result[i] = result[j];
        result[j] = tempt;
    }

    public static void main(String[] args) {
        int[] testArray = { 4, 2, 5, 8, 7, 3, 1, 6, 10, 9 };
        System.out.println(Arrays.toString(testArray));
        System.out.println("bubbleSort--------------------------");
        System.out.println(Arrays.toString(ArraySort.bubbleSort(testArray)));
        System.out.println("selectSort--------------------------");
        System.out.println(Arrays.toString(ArraySort.selectSort(testArray)));
        System.out.println("insertSort--------------------------");
        System.out.println(Arrays.toString(ArraySort.insertSort(testArray)));
        System.out.println("shellSort---------------------------");
        System.out.println(Arrays.toString(ArraySort.shellSort(testArray)));

    }
}
