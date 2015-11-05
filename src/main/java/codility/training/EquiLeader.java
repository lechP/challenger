package codility.training;

public class EquiLeader {

    public int solution(int[] A) {
        Leader leader = getLeader(A);
        if (leader == null) {
            return 0;
        } else {
            int equiLeaders = 0;
            int leadersOnTheLeft = 0;
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] == leader.value) {
                    leadersOnTheLeft++;
                }
                if (isLeader(leadersOnTheLeft, i + 1) && isLeader(leader.count - leadersOnTheLeft, A.length - (i + 1))) {
                    equiLeaders++;
                }
            }
            return equiLeaders;
        }
    }

    private Leader getLeader(int[] A) {
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

        if (stackSize > 0) {
            int counter = 0;
            for (int a : A) {
                if (a == head) {
                    counter++;
                }
            }

            if (isLeader(counter, A.length)) {
                return new Leader(head, counter);
            }
        }
        return null;
    }

    private boolean isLeader(int count, int length) {
        return 2 * count > length;
    }

    private class Leader {
        int value;
        int count;

        Leader(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }
}
