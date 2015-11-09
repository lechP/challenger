package codility.training.lesson07;


public class MaximumSliceWithNegatives {

    public int solution(int[] A) {

        int maxElement = getMaxElement(A);
        if(maxElement<=0) return maxElement;

        int maxSlice = 0;
        int maxEnding = 0;

        for (int a : A) {
            maxEnding = Math.max(0, maxEnding + a);
            maxSlice = Math.max(maxSlice, maxEnding);
        }

        return maxSlice;
    }


    private int getMaxElement(int [] A){
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if(A[i]>max) max = A[i];
        }
        return max;
    }
}
