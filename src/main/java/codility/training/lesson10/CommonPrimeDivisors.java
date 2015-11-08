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
        if(a==b) return true;

        int gcdAB = gcd(a, b);
        if (gcdAB > 1) {
            int remainderA = a / gcdAB;
            int remainderB = b / gcdAB;

            if (hasNoOtherFactors(remainderA, gcdAB) && hasNoOtherFactors(remainderB, gcdAB)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasNoOtherFactors(int remainder, int dividor) {
        while (dividor < remainder) {
            if(remainder % dividor != 0) return false;
            remainder /= dividor;
        }
        return gcd(remainder, dividor) == remainder;
    }

    protected int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

}
