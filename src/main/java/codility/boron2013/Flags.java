package codility.boron2013;

public class Flags {

    public int solution(int[] A) {
        int peaksCount = countPeaks(A);
        if (peaksCount <= 2) return peaksCount;

        int currentFlagsCount = Math.min(peaksCount, (int) Math.sqrt(getMaxDistance(A)) + 1);
        int result = 2;
        int[] nearestPeaks = mapNearestPeaks(A);
        while (currentFlagsCount > result) {
            result = Math.max(result, countPossibleFlags(nearestPeaks, currentFlagsCount));
            currentFlagsCount--;
        }

        return result;
    }

    protected int countPossibleFlags(int[] nearestPeaks, int flagsCount) {
        int currentPosition = nearestPeaks[0];
        int possibleFlags = 0;
        while (nearestPeaks[currentPosition] > -1) {
            possibleFlags++;
            if (currentPosition + flagsCount < nearestPeaks.length) {
                currentPosition += flagsCount;
                if (nearestPeaks[currentPosition] > -1) {
                    currentPosition = nearestPeaks[currentPosition];
                }
            } else {
                break;
            }
        }
        return Math.min(possibleFlags, flagsCount);
    }

    protected int getMaxDistance(int[] A) {
        int firstPeakPos = 1;
        while (firstPeakPos < A.length && !isPeak(A, firstPeakPos)) firstPeakPos++;
        int lastPeakPos = A.length - 2;
        while (lastPeakPos > 0 && !isPeak(A, lastPeakPos)) lastPeakPos--;

        return lastPeakPos - firstPeakPos;
    }


    private int countPeaks(int[] A) {
        int result = 0;
        for (int i = A.length - 2; i > 0; i--) {
            if (isPeak(A, i)) {
                result++;
            }
        }
        return result;
    }

    protected int[] mapNearestPeaks(int[] A) {
        int[] nearestPeaks = new int[A.length];
        nearestPeaks[A.length - 1] = -1;
        for (int i = A.length - 2; i > 0; i--) {
            if (isPeak(A, i)) {
                nearestPeaks[i] = i;
            } else {
                nearestPeaks[i] = nearestPeaks[i + 1];
            }
        }
        nearestPeaks[0] = nearestPeaks[1];
        return nearestPeaks;
    }

    private boolean isPeak(int[] A, int i) {
        return A[i] > A[i - 1] && A[i] > A[i + 1];
    }


}
