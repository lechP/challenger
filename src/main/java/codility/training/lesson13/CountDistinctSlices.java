package codility.training.lesson13;

/**
 * Created by LPI on 10.11.2015
 */
public class CountDistinctSlices {

    private static final int MAGIC_BOUNDARY = 1_000_000_000;

    public int solution(int M, int[] A) {
        int[] counters = new int[M+1];
        int tail = 0;
        int head = 0;
        long result = 0;

        do {
            counters[A[head]]++;
            while (counters[A[head]] > 1) {
                counters[A[tail]]--;
                tail++;
                result += head - tail;
            }
            result++;
            if(result > MAGIC_BOUNDARY) return MAGIC_BOUNDARY;
            head++;
        } while (head < A.length);

        long n = head - tail;
        result += n * (n - 1) / 2;

        return result > MAGIC_BOUNDARY ? MAGIC_BOUNDARY : (int) result;

    }
}
