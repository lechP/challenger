package codility.training;

import java.util.Arrays;

/**
 * Created by jsi on 2015-11-04.
 */
public class Triangle {

    public int solution(int[] A){
        Arrays.sort(A);
        for(int i = 2; i < A.length; i++){
            if(checkTriangle(A[i-2], A[i-1], A[i])){
                return 1;
            }
        }
        return 0;
    }

    private boolean checkTriangle(int a, int b, int c) {
        return (long) a + b > c &&(long) b + c > a &&(long) c + a > b;
    }
}
