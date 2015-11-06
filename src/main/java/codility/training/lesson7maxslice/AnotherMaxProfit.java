package codility.training.lesson7maxslice;

/**
 * Created by jsi on 2015-11-06.
 */
public class AnotherMaxProfit {
    public int solution(int[] A) {
        int[] maxStartingHere = new int[A.length];
        int[] minEndingHere = new int[A.length];
        int maxProfit = 0;

        if(A.length != 0){
            minEndingHere[0]=A[0];
            maxStartingHere[A.length-1]=A[A.length-1];
        }

        for(int i =1;i<A.length;i++){
            minEndingHere[i] = Math.min(minEndingHere[i-1], A[i]);
        }
        for(int i =A.length-2;i>=0;i--){
            maxStartingHere[i] = Math.max(maxStartingHere[i+1], A[i]);
        }

        for(int i =0;i<A.length;i++){
            maxProfit = Math.max(maxProfit, maxStartingHere[i] - minEndingHere[i]);
        }
        return maxProfit;
    }
}
