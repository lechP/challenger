package codility.training;

public class Dominator {

    public int solution(int[] A) {
        int stackSize = 0;
        int head = 0;

        for (int a : A) {
            if (stackSize == 0) {
                stackSize++;
                head = a;
            } else {
                if (a == head) {
                    stackSize++;
                } else {
                    stackSize--;
                }
            }
        }

        if(stackSize>0) {
            int counter = 0;
            for (int a : A) {
                if (a == head) {
                    counter++;
                }
            }

            if (2 * counter > A.length) {
                for (int i = 0; i < A.length; i++) {
                    if (A[i] == head) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
