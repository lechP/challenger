package codility.training.lesson11;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsi on 2015-11-08.
 */
public class Frog {

    private static int MAX = 100_000;
    private static int[] FIBONACCIS = {1,2,3,5,8,13,21,34,55,89,144,233,377,610};

    public int solution(int[] A){
        int[] fib = calculateFibonacci();
        int position = -1;
        List<Integer> jumps = new ArrayList<>();
        while(position<A.length){
            for(int i = 2;i<fib.length;i++){
                if(fib[i] + position < A.length){
                    if(A[fib[i] + position] == 1){
                        jumps.add(fib[i]);
                    }
                    position += fib[i];
                    break;
                }else if(fib[i] + position == A.length) {
                    jumps.add(fib[i]);
                    position += fib[i];
                    break;
                } else {
                    return -1;
                }
            }
        }
        return jumps.size();
    }

    private int[] calculateFibonacci() {
        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        int i =1;
        while(fib.get(i)<MAX){
            i++;
            fib.add(fib.get(i-1)+fib.get(i-2));
        }
        return fib.stream().mapToInt(x->x).toArray();
    }
}
