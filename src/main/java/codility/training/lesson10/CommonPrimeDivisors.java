package codility.training.lesson10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * created by LPI
 */
public class CommonPrimeDivisors {

    public int solution(int[] A, int[] B) {
        int max = getMaxValue(A, B);
        int[] factors = prepareFactors(max);

        int result = 0;

        for (int i = 0; i < A.length; i++) {
            int gcd = gcd(A[i], B[i]);
            Set<Integer> gcdFactors = getDistinctPrimeFactors(gcd, factors);
            Set<Integer> factorsOfRestOfA = getDistinctPrimeFactors(A[i] / gcd, factors);
            factorsOfRestOfA.removeAll(gcdFactors);
            if (factorsOfRestOfA.isEmpty()) {
                Set<Integer> factorsOfRestOfB = getDistinctPrimeFactors(B[i] / gcd, factors);
                factorsOfRestOfB.removeAll(gcdFactors);
                if (factorsOfRestOfB.isEmpty()) {
                    result++;
                }
            }
        }

        return result;
    }

    protected int getMaxValue(int[] A, int[] B) {
        int maxA = Arrays.stream(A).max().getAsInt();
        int maxB = Arrays.stream(B).max().getAsInt();
        return Math.max(maxA, maxB);
    }

    protected int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    protected int[] prepareFactors(int n) {
        int[] factors = new int[n + 1];
        int i = 2;
        while (i * i <= n) {
            if (factors[i] == 0) {
                int k = i * i;
                while (k <= n) {
                    if (factors[k] == 0) {
                        factors[k] = i;
                    }
                    k += i;
                }
            }
            i++;
        }
        return factors;
    }

    protected Set<Integer> getDistinctPrimeFactors(int i, int[] factors) {
        Set<Integer> primeFactors = new HashSet<>((int) Math.log(i) + 1);
        if(i>=2) {
            while (factors[i] > 0) {
                primeFactors.add(factors[i]);
                i /= factors[i];
            }
            primeFactors.add(i);
        }
        return primeFactors;
    }

}
