package codility.training.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jsi on 2015-11-08.
 */
public class Frog {

    private static int[] FIBONACCIS = {1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,
                                        17711,28657,46368,75025};

    public int solution(int[] A){
        int[] fib = calculateFibonacci();
        int position = -1;
        List<Integer> jumps = new ArrayList<>();
        while(position<A.length){
            int oldPosition = position;
            for (int aFib : fib) {
                if (aFib + position < A.length) {
                    if (A[aFib + position] == 1) {
                        jumps.add(aFib);
                        position += aFib;
                    }
                } else if (aFib + position == A.length) {
                    jumps.add(aFib);
                    position += aFib;
                }
            }
            if(position == oldPosition){
                return -1;
            }
        }
        for(int i =1; i<jumps.size();i++){
            if(isFibonacci(jumps.get(i-1) + jumps.get(i))){
                jumps.set(i, jumps.get(i-1) + jumps.get(i));
                jumps.set(i-1, 0);
            }
        }
        return (int) jumps.stream()
                .filter(x->x>0).count();
    }

    private boolean isFibonacci(int i) {
        return Arrays.binarySearch(FIBONACCIS, i) > -1;
    }

    private int[] calculateFibonacci() {
        return FIBONACCIS;
    }
}
