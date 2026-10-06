package Array;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverserAnArray(int[] arr) {

        if (arr.length <= 1) {
            return arr;
        }
        int start = 0;
        int end = arr.length - 1;
        int[] reversedArr = new int[arr.length];
        while (start <= end) {
            reversedArr[start] = arr[end];
            reversedArr[end] = arr[start];
            start++;
            end--;
        }
        return reversedArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverserAnArray(new int[]{3000000, 2000000, 1000000})));
    }
}
