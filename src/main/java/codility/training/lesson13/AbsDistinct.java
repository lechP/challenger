package codility.training.lesson13;

/**
 * Created by LPI on 10.11.2015
 */
public class AbsDistinct {

    public int solution(int[] A) {
        int negativeIdx = -1;
        int distinctCounter = 0;
        while (nextIsNegative(A, negativeIdx)) {
            negativeIdx++;
            if (isFirstOrIncreased(negativeIdx, A)) distinctCounter++;
        }

        int positiveIdx = negativeIdx + 1;
        while (positiveIdx < A.length) {
            if (negativeIdx == -1) {
                if (isFirstOrIncreased(positiveIdx, A)) distinctCounter++;
            } else {
                while (negativeIdx > -1 && A[positiveIdx] > Math.abs(A[negativeIdx])) negativeIdx--;
                if ((negativeIdx == -1 || A[positiveIdx] < Math.abs(A[negativeIdx])) && A[positiveIdx] > A[positiveIdx - 1])
                    distinctCounter++;
            }
            positiveIdx++;
        }

        return distinctCounter;
    }

    private boolean isFirstOrIncreased(int negativeIdx, int[] A) {
        return negativeIdx == 0 || A[negativeIdx] > A[negativeIdx - 1];
    }

    private boolean nextIsNegative(int[] A, int indexOfNegative) {
        return indexOfNegative + 1 < A.length && A[indexOfNegative + 1] < 0;
    }
}
