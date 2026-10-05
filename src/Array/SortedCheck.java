package Array;

public class SortedCheck {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int[] {4, 6, 7, 5}));
    }
}
