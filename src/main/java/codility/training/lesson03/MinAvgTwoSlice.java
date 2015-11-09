package codility.training.lesson03;

public class MinAvgTwoSlice {

    public int solution(int[] A) {

        double minAvg = (A[0] + A[1]) / 2.0;
        int minAvgPosition = 0;

        for (int i = 1; i < A.length - 1; i++) {
            double avg = (A[i] + A[i + 1]) / 2.0;
            if (avg < minAvg) {
                minAvg = avg;
                minAvgPosition = i;
            }
        }

        for (int i = 0; i < A.length - 2; i++) {
            double avg = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            if (avg < minAvg) {
                minAvg = avg;
                minAvgPosition = i;
            }
        }

        return minAvgPosition;
    }
}
