package codility.training;

/**
 * Created by jsi on 2015-11-04.
 */
public class Slices {

    public int solution(int[] A){
        int begin = 0;
        float avg = (A[0] + A[1])/2;
        for (int i = 1; i < A.length-1; i++) {
            if(avg > (A[i] + A[i+1])/2f){
                begin = i;
                avg = (A[i] + A[i+1])/2f;
            }

        }
        for(int i =0; i<A.length-2; i++){
            if(avg > (A[i] + A[i+1] + A[i+2])/3f){
                begin = i;
                avg = (A[i] + A[i+1] + A[i+2])/3f;
            }
        }
        return begin;
    }
}
