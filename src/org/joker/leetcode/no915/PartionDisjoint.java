package org.joker.leetcode.no915;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-15 00:49
 */
public class PartionDisjoint {
    /**
     * 执行用时 : 715 ms, 在Partition Array into Disjoint Intervals的Java提交中击败了5.38% 的用户
     * 内存消耗 : 49 MB, 在Partition Array into Disjoint Intervals的Java提交中击败了38.78% 的用户
     *
     * @param A
     * @return
     */
    public int partitionDisjoint(int[] A) {
        int result = A[0];
        for (int i = 0; i < A.length - 1; i++) {
            if (findMax(A, 0, i) <= findMin(A, i + 1, A.length - 1)) {
                result = i + 1;
                break;
            }
        }
        return result;
    }

    public int findMax(int[] A, int x, int y) {
        int max = A[x];
        for (int i = x + 1; i <= y; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    public int findMin(int[] A, int x, int y) {
        int min = A[x];
        for (int i = x + 1; i <= y; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        PartionDisjoint pd = new PartionDisjoint();
        int[] input = {6, 0, 8, 30, 37, 6, 75, 98, 39, 90, 63, 74, 52, 92, 64};
        System.out.println(pd.partitionDisjoint(input));
    }
}

