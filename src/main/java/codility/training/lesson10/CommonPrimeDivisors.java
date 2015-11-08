package codility.training.lesson10;

/**
 * created by LPI
 */
public class CommonPrimeDivisors {

    public int solution(int[] A, int[] B) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (haveSamePrimeDivisors(A[i], B[i])) result++;
        }
        return result;
    }

    private boolean haveSamePrimeDivisors(int a, int b) {
        int gcdAB = gcd(a, b);
        return hasNoOtherFactors(a, gcdAB) && hasNoOtherFactors(b, gcdAB);
    }

    private boolean hasNoOtherFactors(int value, int dividor) {
        int remainder = value / dividor;
        while (remainder > 1) {
            int gcd = gcd(remainder, dividor);
            if(gcd == 1) return false;
            remainder /= gcd;
        }
        return true;
    }

    private int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

}
