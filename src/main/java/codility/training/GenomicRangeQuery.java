package codility.training;

public class GenomicRangeQuery {

    private int[][] impactCumulativeCounters;

    public int[] solution(String S, int[] P, int[] Q) {
        countCumulativeImpacts(S);
        return findResponses(P, Q);
    }

    private int[] findResponses(int[] P, int[] Q) {
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int leftIndex = P[i] - 1;
            int rightIndex = Q[i];
            for (int j = 0; j < impactCumulativeCounters.length; j++) {
                int leftValue = getLeftValue(leftIndex, j);
                if (impactCumulativeCounters[j][rightIndex] - leftValue > 0) {
                    result[i] = j + 1;
                    break;
                }
            }
        }

        return result;
    }

    private int getLeftValue(int leftIndex, int j) {
        int leftValue;
        if (leftIndex == -1) {
            leftValue = 0;
        } else {
            leftValue = impactCumulativeCounters[j][leftIndex];
        }
        return leftValue;
    }

    private void countCumulativeImpacts(String S) {
        impactCumulativeCounters = new int[4][S.length()];
        countFirstImpact(S);
        for (int i = 1; i < S.length(); i++) {
            copyPreviousCounters(i);
            increaseOnCurrentImpact(S, i);
        }
    }

    private void countFirstImpact(String S) {
        impactCumulativeCounters[getImpact(S.charAt(0)) - 1][0] = 1;
    }

    private void copyPreviousCounters(int i) {
        for (int j = 0; j < impactCumulativeCounters.length; j++) {
            impactCumulativeCounters[j][i] = impactCumulativeCounters[j][i - 1];
        }
    }

    private void increaseOnCurrentImpact(String S, int i) {
        int impact = getImpact(S.charAt(i));
        impactCumulativeCounters[impact - 1][i]++;
    }

    private int getImpact(char factor) {
        switch (factor) {
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            case 'T':
                return 4;
            default:
                throw new IllegalArgumentException();
        }
    }
}
