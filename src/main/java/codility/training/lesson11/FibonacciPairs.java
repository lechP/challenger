package codility.training.lesson11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LPI on 09.11.2015
 */
public class FibonacciPairs {

    public boolean[] solution(int[] numbers, int limit) {
        boolean[] fibonacciPairs = markFibonacciPairsSums(limit);
        boolean[] result = new boolean[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = fibonacciPairs[numbers[i]];
        }
        return result;
    }

    protected boolean[] markFibonacciPairsSums(int limit) {
        boolean[] result = new boolean[limit + 1];
        List<Integer> fibonacciNumbers = getFibonacciNumbers(limit);
        for (int i = 0; i < fibonacciNumbers.size(); i++) {
            for (int j = i; j < fibonacciNumbers.size(); j++) {
                int pairSum = fibonacciNumbers.get(i) + fibonacciNumbers.get(j);
                if (pairSum < limit) result[pairSum] = true;
            }
        }
        return result;
    }

    protected List<Integer> getFibonacciNumbers(int limit) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int preLast = 0;
        int last = 1;
        fibonacciNumbers.add(preLast);
        fibonacciNumbers.add(last);
        int next = last;
        while (next < limit) {
            next = last + preLast;
            if (next < limit) {
                preLast = last;
                last = next;
                fibonacciNumbers.add(next);
            }
        }
        return fibonacciNumbers;
    }

}
