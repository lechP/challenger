package codility.training.lesson12;

/**
 * Created by LPI on 09.11.2015
 */
public class BinarySearch {

    /**
     * @param A sorted array of values
     * @param x value being searched for
     * @return index of last element of A less or equal x, -1 when A has only greater values
     */
    public int solution(int[] A, int x) {
        int n = A.length;
        int begin = 0;
        int end = n - 1;
        int result = -1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (A[mid] <= x) {
                begin = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

}
