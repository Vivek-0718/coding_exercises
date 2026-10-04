package Array;

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
