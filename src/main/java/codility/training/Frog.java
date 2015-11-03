package codility.training;


public class Frog {

    public int solution(int X, int[] A) {

        int [] counters = new int[X];

        int leafCounter = 0;

        for (int i = 0; i < A.length; i++) {
            counters[A[i]-1]++;
            if(counters[A[i]-1]==1){
                leafCounter++;
                if(leafCounter==X){
                    return i;
                }
            }
        }

        return -1;
    }

}
