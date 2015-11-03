package codility.training;

/**
 * TODO LPI comment me
 *
 * @author Lech Piechota, Capgemini
 */
public class MaxCounters {

    public int[] solution(int N, int[] A){
        int [] result = new int[N];

        int localMax =0;
        int globalMax = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] > N){
                globalMax += localMax;
                localMax = 0;
                result = new int[N];
            } else {
                result[A[i] - 1]++;
                if (localMax < result[A[i] - 1]) {
                    localMax = result[A[i] - 1];
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            result[i] += globalMax;

        }

        return result;
    }
}
