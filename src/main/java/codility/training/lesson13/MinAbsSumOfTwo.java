package codility.training.lesson13;

import java.util.Arrays;

/**
 * Created by LPI on 11.11.2015
 */
public class MinAbsSumOfTwo {

    public int solution(int[] A) {
        int limit = 0;
        Arrays.sort(A);
        int left = 0;
        int right = A.length - 1;

        if (A[left] >= 0) return 2 * A[left];
        if (A[right] < 0) return -2 * A[right];

        int minAbsSum = Math.abs(A[right] + A[left]);
        while (minAbsSum > limit && left <= right) {
            minAbsSum = Math.min(minAbsSum, Math.abs(A[right] + A[left]));
            while (A[left] < 0 && Math.abs(A[left]) > A[right]) {
                left++;
                minAbsSum = Math.min(minAbsSum, Math.abs(A[right] + A[left]));
            }
            right--;
        }

        return minAbsSum;
    }
}
