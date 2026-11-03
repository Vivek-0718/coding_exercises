package funtional_interface;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgramming {
    static List<Integer> getCubesOfFirstNNumbers(int n) {
        return IntStream.range(1, n + 1).map(e -> e * e * e).boxed().collect(Collectors.toList());
    }

    static int sumOfSquares(List<Integer> list) {
        if(list==null){
            return 0;
        }
        return list.stream().map(e -> e * e).reduce(0, Integer::sum);
    }
    static int findMaxEvenNumber(List<Integer> list){
        if(list==null || list.isEmpty()){
            return 0;
        }
        Optional<Integer> evenLarge = list.stream().filter(e->e%2==0).max(Integer::compare);
        return evenLarge.orElse(0);
    }
    public static void main(String[] args) {
        System.out.println(getCubesOfFirstNNumbers(3));
        System.out.println(sumOfSquares(List.of(10000, 20000, 30000)));
        System.out.println(findMaxEvenNumber(List.of(234,235,3452,2342,12313)));
    }
}
