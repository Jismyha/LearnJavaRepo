package DataStructure.Search;

public class BinarySearch {

    public static int find(int[] array, int target) {
        int beginIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        if (array.length == 0) {
            return -1;
        } else {
            while (beginIndex <= endIndex) {
                middleIndex = beginIndex + (endIndex - beginIndex) / 2;
                if (array[middleIndex] == target) {
                    return middleIndex;
                } else if (array[middleIndex] < target) {
                    beginIndex = middleIndex + 1;
                } else {
                    endIndex = middleIndex - 1;
                }
            }
            return -1;
        }
    }
}
