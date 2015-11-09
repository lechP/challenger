package codility.training.lesson11;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by LPI on 09.11.2015
 */
public class FibFrog {

    private static final int[] FIBS = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393};


    public int solution(int[] A) {
        List<Integer> possibleJumps = getPossibleJumpPositions(A, -1);
        if (possibleJumps.isEmpty()) return -1;
        return countMinimalRequiredJumps(possibleJumps, A);
    }

    private int countMinimalRequiredJumps(List<Integer> possibleJumpPositions, int[] leaves) {
        if (possibleJumpPositions.get(0) == leaves.length) return 1;

        for (final Integer newPosition : possibleJumpPositions) {
            List<Integer> nextPossibleJumpPositions = getPossibleJumpPositions(leaves, newPosition);
            if (!nextPossibleJumpPositions.isEmpty()) {
                int jumps = countMinimalRequiredJumps(nextPossibleJumpPositions, leaves);
                if (jumps != -1) return 1 + jumps;
            }
        }
        return -1;
    }

    protected List<Integer> getPossibleJumpPositions(int[] leaves, int currentPos) {
        List<Integer> result = new LinkedList<>();
        int limit = leaves.length - currentPos - 1;
        int i = 0;
        while (FIBS[i] <= limit + 1) {
            int nextPositionCandidate = currentPos + FIBS[i];
            if (nextPositionCandidate == leaves.length || leaves[nextPositionCandidate] == 1) {
                result.add(0, nextPositionCandidate);
            }
            i++;
        }
        return result;
    }

}
