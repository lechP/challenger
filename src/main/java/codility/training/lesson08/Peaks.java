package codility.training.lesson08;

/**
 * https://codility.com/demo/results/trainingU9E4N8-GJV/
 * @author lpi
 */
public class Peaks {

    public int solution(int[] A) {
        int result = 0;
        int N = A.length;
        int[] accumulatedPeaks = accumulatePeaks(A);
        int peaksCount = accumulatedPeaks[accumulatedPeaks.length - 1];
        int[] dividors = findRelevantDividors(N);

        for (int dividor : dividors) {
            boolean canBeDivided = true;
            int left;
            int right = N / dividor;
            if (accumulatedPeaks[right - 1] == 0 || peaksCount < dividor) {
                canBeDivided = false;
            } else {
                while (right < N) {
                    left = right;
                    right = left + N / dividor;
                    if (accumulatedPeaks[right - 1] - accumulatedPeaks[left - 1] == 0) {
                        canBeDivided = false;
                        break;
                    }
                }
            }
            if (canBeDivided) result = dividor;
        }

        return result;
    }

    protected int[] accumulatePeaks(int[] A) {
        int[] peaksAccumulated = new int[A.length];
        for (int i = 1; i < A.length - 1; i++) {
            peaksAccumulated[i] = peaksAccumulated[i - 1];
            if (isPeak(A, i)) {
                peaksAccumulated[i]++;
            }
            if (A.length > 1) peaksAccumulated[A.length - 1] = peaksAccumulated[A.length - 2];
        }
        return peaksAccumulated;
    }

    private boolean isPeak(int[] A, int i) {
        return A[i] > A[i - 1] && A[i] > A[i + 1];
    }

    protected int[] findRelevantDividors(int N) {
        int dividorsSubarraysSize = (int) Math.sqrt(N) + 1;
        int[] leftDividors = new int[dividorsSubarraysSize];
        int[] rightDividors = new int[dividorsSubarraysSize];

        //we don't want to take N or N/2 as dividors, because number of peaks must be less than N/2
        leftDividors[0] = 1;
        int leftDividorsSize = 1;
        if (N % 2 == 0 && N > 2) {
            leftDividors[1] = 2;
            leftDividorsSize = 2;
        }
        int rightDividorsSize = 0;
        int k = 3;
        while (k * k <= N) {
            if (N % k == 0) {
                leftDividors[leftDividorsSize] = k;
                leftDividorsSize++;
                if (k * k != N) { //not a square root
                    rightDividors[dividorsSubarraysSize - 1 - rightDividorsSize] = N / k;
                    rightDividorsSize++;
                }
            }
            k++;
        }

        int allDividorsSize = leftDividorsSize + rightDividorsSize;
        int[] allDividors = new int[allDividorsSize];
        System.arraycopy(leftDividors, 0, allDividors, 0, leftDividorsSize);
        System.arraycopy(rightDividors, dividorsSubarraysSize - rightDividorsSize, allDividors, leftDividorsSize, rightDividorsSize);

        return allDividors;
    }

}
