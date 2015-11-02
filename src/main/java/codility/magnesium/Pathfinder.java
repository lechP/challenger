package codility.magnesium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pathfinder {

    public int solution(int N, int[] A, int[] B, int[] C) {
        int M = A.length;
        List<Attraction> sortedAttractions = getSortedAttractions(C);
        int[] pathLengths = new int[N];
        List<Path> tempPaths = new ArrayList<>();

        for (int i = 0; i < sortedAttractions.size(); i++) {
            Attraction currentAttraction = sortedAttractions.get(i);

            int nodeA = A[currentAttraction.index];
            int nodeB = B[currentAttraction.index];
            int nodeAcurrentLength = pathLengths[nodeA];
            int nodeBcurrentLength = pathLengths[nodeB];

            tempPaths.add(new Path(nodeA, Math.max(nodeAcurrentLength, nodeBcurrentLength + 1)));
            tempPaths.add(new Path(nodeB, Math.max(nodeBcurrentLength, nodeAcurrentLength + 1)));

            if (i == M - 1 || currentAttraction.value > sortedAttractions.get(i + 1).value) {
                for (final Path tempPath : tempPaths) {
                    pathLengths[tempPath.startNode] = Math.max(pathLengths[tempPath.startNode], tempPath.length);
                }
                tempPaths.clear();
            }

        }
        return findMax(pathLengths);
    }

    private int findMax(int[] pathLengths) {
        int max = 0;
        for (int pathLength : pathLengths) {
            if (pathLength > max) {
                max = pathLength;
            }
        }
        return max;
    }

    private List<Attraction> getSortedAttractions(int[] C) {
        List<Attraction> result = new ArrayList<>();
        for (int i = 0; i < C.length; i++) {
            result.add(new Attraction(i, C[i]));
        }
        Collections.sort(result, new Comparator<Attraction>() {
            @Override
            public int compare(Attraction o1, Attraction o2) {
                return o2.value - o1.value;
            }
        });
        return result;
    }

    private class Attraction {
        int value;
        int index;

        Attraction(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    private class Path {
        int startNode;
        int length;

        Path(int startNode, int length) {
            this.startNode = startNode;
            this.length = length;
        }
    }

}
