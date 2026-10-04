package Array;

//Find Second Largest Element
//Example 1:
//Input: [5, 7, 9, 2, 4, 9]
//Output: 7

//Example 2:
//Input: [1, 1, 1, 1]
//Output: -1

//Example 3:
//Input: [7]
//Output: -1

public class SecondLargestInt {
    public static int findSecondLargestElement(int... arr) {
        if (arr.length < 2) {
            return -1;
        }
        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;

        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i != largest) {
                secondLargest = i;
            }
        }
        return secondLargest==Long.MIN_VALUE ? -1 : (int) secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(findSecondLargestElement(Integer.MIN_VALUE,10));
    }
}
