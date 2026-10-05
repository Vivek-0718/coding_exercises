package Array;

//In the class BiArray, you are given two integer arrays.
//Your task is to write a method to compare the sum of these two arrays and determine if they are equal.
//You are also required to write a method to calculate the sum of the elements of an array.
public class Biarray {
    int[] arr1;
    int[] arr2;

    public Biarray(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public int calculateSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public boolean areSumsEqual() {
        return calculateSum(this.arr1) == calculateSum(this.arr2);
    }

    public static void main(String[] args) {
        Biarray b1 = new Biarray(new int[] {1, 2, 3, 4, 5, 6}, new int[] {21});
        System.out.println(b1.areSumsEqual());
    }
}
