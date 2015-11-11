package codility.training.lesson14;

/**
 * Created by LPI on 11.11.2015
 */
public class TieRopes {

    public int solution(int K, int[] A) {
        int ropesCount = 0;
        int ropeLength = 0;

        for (int a : A) {
            ropeLength += a;
            if (ropeLength >= K) {
                ropeLength = 0;
                ropesCount++;
            }
        }

        return ropesCount;
    }
}
