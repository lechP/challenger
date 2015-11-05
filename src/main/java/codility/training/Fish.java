package codility.training;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B) {

        Stack<Integer> fishesDownstream = new Stack<>();
        int fishesEaten = 0;

        for (int i = 0; i < A.length; i++) {

            if (B[i] == 1) {
                fishesDownstream.add(A[i]);
            } else {
                while (!fishesDownstream.isEmpty() && fishesDownstream.peek() < A[i]) {
                    fishesDownstream.pop();
                    fishesEaten++;
                }
                if (!fishesDownstream.isEmpty() && fishesDownstream.peek() > A[i]) {
                    fishesEaten++;
                }
            }

        }
        return A.length - fishesEaten;
    }

}
