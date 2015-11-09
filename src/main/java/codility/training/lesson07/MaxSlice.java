package codility.training.lesson07;

/**
 * Created by jsi on 2015-11-06.
 */
public class MaxSlice {

    public int solution(int[] A){
        int maxEl = A[0];
        for(int i: A){
            maxEl = Math.max(maxEl,i);
        }
        if(maxEl < 0){
            return maxEl;
        }

        int maxSlice = 0;
        int maxEnding = 0;


        for (int a : A) {
            maxEnding = Math.max(0, maxEnding + a);
            maxSlice = Math.max(maxSlice, maxEnding);
        }

        return maxSlice;
    }
}
