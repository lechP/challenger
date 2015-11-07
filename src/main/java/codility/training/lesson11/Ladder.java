package codility.training.lesson11;

import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * Created by jsi on 2015-11-07.
 */
public class Ladder {

    public int[] solution(int[] A, int[] B){
        int max = findMaxInTable(A);
        BigInteger[] fib = calculateFibonacci(max);
        long [] powers = calculatePowers(findMaxInTable(B));
        int[] result = new int[A.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = fib[A[i]+1].remainder(BigInteger.valueOf(powers[B[i]])).intValue();
        }
        return result;
    }

    private long[] calculatePowers(int max) {
        long[] result = new long[max+1];
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = 2*result[i-1];
        }
        return result;
    }

    private BigInteger[] calculateFibonacci(int max) {
        BigInteger[] fib = new BigInteger[max+2];
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;
        for(int i =2; i<fib.length;i++){
            fib[i] = fib[i-1].add(fib[i - 2]);
        }
        return fib;
    }

    private int findMaxInTable(int[] a) {
        return IntStream.of(a).max().orElse(-1);
    }
}
