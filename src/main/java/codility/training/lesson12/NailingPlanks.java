package codility.training.lesson12;

import java.util.Arrays;

/**
 * Created by LPI on 10.11.2015
 */
public class NailingPlanks {

    public int solution(int[] A, int[] B, int[] C) {
        int result = -1;

        int leftBoundary = 1;
        int rightBoundary = C.length;
        int maxVal = Math.max(Arrays.stream(B).max().getAsInt(), Arrays.stream(C).max().getAsInt());

        while (leftBoundary <= rightBoundary) {
            int mid = (leftBoundary + rightBoundary) / 2;
            if (isEnoughNails(A, B, C, mid, maxVal)) {
                result = mid;
                rightBoundary = mid - 1;
            } else {
                leftBoundary = mid + 1;
            }
        }
        return result;
    }

    private boolean isEnoughNails(int[] A, int[] B, int[] C, int nailsCount, int maxVal) {
        int[] cumulatedNails = getCumulatedNails(C, nailsCount, maxVal);
        for (int i = 0; i < A.length; i++) {
            if (cumulatedNails[B[i]] - cumulatedNails[A[i] - 1] == 0) return false;
        }
        return true;
    }

    private int[] getCumulatedNails(int[] C, int nailsCount, int maxVal) {
        int[] cumulatedNails = new int[maxVal + 1];

        for (int i = 0; i < nailsCount; i++) {
            cumulatedNails[C[i]]++;
        }
        for (int i = 1; i <= maxVal; i++) {
            cumulatedNails[i] += cumulatedNails[i - 1];
        }
        return cumulatedNails;
    }

}
