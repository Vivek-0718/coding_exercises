package Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics {
    public static List<Integer> determineAllFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        if (num < 1) {
            return factors;
        }
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    public static List<Integer> determineMultiples(int num, int limit) {
        ArrayList<Integer> multiples = new ArrayList<>();
        int i = 1;
        while (num * i < limit && num>0) {
            multiples.add(num * i);
            i++;
        }
        return multiples;
    }

    public static void main(String[] args) {
        System.out.println(determineAllFactors(100));
        System.out.println(determineMultiples(1, 10));
    }
}
