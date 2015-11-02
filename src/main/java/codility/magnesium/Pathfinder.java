package codility.magnesium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pathfinder {

    public int solution(int N, int[] A, int[] B, int[] C) {
        int M = A.length;
        List<Integer> indexes = getSortedIndexes(C, M);

        int[] pathLengths = new int[N];
        List<Path> tempPaths = new ArrayList<>();

        for (int i = 0; i < indexes.size(); i++) {

            int nodeA = A[indexes.get(i)];
            int nodeB = B[indexes.get(i)];
            int nodeAcurrentLength = pathLengths[nodeA];
            int nodeBcurrentLength = pathLengths[nodeB];

            tempPaths.add(new Path(nodeA, Math.max(nodeAcurrentLength, nodeBcurrentLength + 1)));
            tempPaths.add(new Path(nodeB, Math.max(nodeBcurrentLength, nodeAcurrentLength + 1)));

            if (i == M - 1 || C[indexes.get(i)] > C[indexes.get(i+1)]) {
                for (final Path tempPath : tempPaths) {
                    pathLengths[tempPath.startNode] = Math.max(pathLengths[tempPath.startNode], tempPath.length);
                }
                tempPaths.clear();
            }

        }
        return findMax(pathLengths);
    }

    private List<Integer> getSortedIndexes(int[] C, int m) {
        List<Integer> indexes = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            indexes.add(i);
        }
        Collections.sort(indexes, (i, j) -> C[j] - C[i]);
        return indexes;
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

    private class Path {
        int startNode;
        int length;

        Path(int startNode, int length) {
            this.startNode = startNode;
            this.length = length;
        }
    }

}
