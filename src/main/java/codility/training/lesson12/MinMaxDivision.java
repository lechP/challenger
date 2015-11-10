package codility.training.lesson12;

import java.util.Arrays;

/**
 * Created by LPI on 09.11.2015
 */
public class MinMaxDivision {

    public int solution(int K, int M, int[] A) {

        int leftBoundary = Arrays.stream(A).max().getAsInt();
        int rightBoundary = Arrays.stream(A).sum();

        while (leftBoundary <= rightBoundary) {
            int mid = (leftBoundary + rightBoundary) / 2;
            if (countIntervals(A, mid) > K) {
                leftBoundary = mid + 1;
            } else {
                rightBoundary = mid - 1;
            }
        }
        return leftBoundary;
    }

    private int countIntervals(int[] A, int limit) {
        int result = 0;
        int sum = 0;
        for (int a : A) {
            sum += a;
            if (sum > limit) {
                result++;
                sum = a;
            }
        }
        return result + (sum > 0 ? 1 : 0);
    }
}
