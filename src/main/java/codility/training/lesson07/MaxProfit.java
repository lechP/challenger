package codility.training.lesson07;

/**
 * Created by LPI on 06.11.2015
 */
public class MaxProfit {

    public int solution(int[] A) {

        int maxProfit = 0;
        int maxTempProfit = 0;

        if(A.length==0) return 0;

        for (int i = A.length-1; i > 0; i--) {
            A[i] = A[i]-A[i-1];
        }
        A[0]=0;

        for (int a : A) {
            maxTempProfit = Math.max(0, maxTempProfit + a);
            maxProfit = Math.max(maxProfit, maxTempProfit);
        }

        return maxProfit;
    }
}
