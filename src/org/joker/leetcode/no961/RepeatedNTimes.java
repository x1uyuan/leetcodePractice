package org.joker.leetcode.no961;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-14 00:23
 */
public class RepeatedNTimes {
    /**
     * 执行用时 : 145 ms, 在N-Repeated Element in Size 2N Array的Java提交中击败了5.23% 的用户
     * 内存消耗 : 50.4 MB, 在N-Repeated Element in Size 2N Array的Java提交中击败了25.75% 的用户
     *
     * @param A
     * @return
     */
    public int repeatedNTimes(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    result = A[i];
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RepeatedNTimes repeatedNTimes = new RepeatedNTimes();
        int[] input = {1, 2, 3, 3};
        System.out.println(repeatedNTimes.repeatedNTimes(input));
    }
}

