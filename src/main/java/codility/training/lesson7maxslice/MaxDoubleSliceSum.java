package codility.training.lesson7maxslice;

/**
 * Created by LPI on 06.11.2015
 */
public class MaxDoubleSliceSum {

    public int solution(int[] A) {
        int N = A.length;
        int[] maxEndingHere = new int[N];
        int[] maxStartingHere = new int[N];

        int maxDoubleSlice = 0;

        for (int i = 1; i < N - 1; i++) {
            maxEndingHere[i] = Math.max(0, maxEndingHere[i - 1] + A[i]);
        }

        for (int i = N - 2; i > 0; i--) {
            maxStartingHere[i] = Math.max(0, maxStartingHere[i + 1] + A[i]);
        }

        for (int i = 1; i < N - 1; i++) {
            maxDoubleSlice = Math.max(maxDoubleSlice, maxEndingHere[i - 1] + maxStartingHere[i + 1]);
        }

        return maxDoubleSlice;
    }

}
