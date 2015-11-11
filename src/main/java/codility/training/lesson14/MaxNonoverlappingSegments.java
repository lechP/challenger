package codility.training.lesson14;

/**
 * Created by LPI on 11.11.2015
 */
public class MaxNonoverlappingSegments {

    public int solution(int[] A, int[] B) {
        int result = A.length;
        int lastStaying = 0;
        for (int i = 1; i < A.length; i++) {
            if (B[lastStaying] >= A[i]) {
                result--;
            } else {
                lastStaying = i;
            }
        }
        return result;
    }
}
