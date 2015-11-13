package codility.training.lesson15;

/**
 * Created by LPI on 13.11.2015
 */
public class NumberSolitaire {

    public int solution(int[] A) {

        int[] maxResults = new int[A.length];
        int diceMax = 6;

        maxResults[0] = A[0];

        for (int i = 1; i < maxResults.length; i++) {
            maxResults[i] = maxResults[i - 1] + A[i];
            for (int j = 2; j <= Math.min(diceMax, i); j++) {
                maxResults[i] = Math.max(maxResults[i], maxResults[i - j] + A[i]);
            }
        }

        return maxResults[A.length - 1];
    }
}
