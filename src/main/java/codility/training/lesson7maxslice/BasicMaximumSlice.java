package codility.training.lesson7maxslice;


public class BasicMaximumSlice {

    public int solution(int[] A) {

        int maxSlice = 0;
        int maxEnding = 0;

        for (int a : A) {
            maxEnding = Math.max(0, maxEnding + a);
            maxSlice = Math.max(maxSlice, maxEnding);
        }

        return maxSlice;
    }

}
