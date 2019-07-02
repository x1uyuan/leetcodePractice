package org.joker.leetcode.no944;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-15 17:09
 */
public class MinDeletionSize {
    /**
     * 执行用时 : 121 ms, 在Delete Columns to Make Sorted的Java提交中击败了5.16% 的用户
     * 内存消耗 : 47.5 MB, 在Delete Columns to Make Sorted的Java提交中击败了44.09% 的用户
     *
     * @param A
     * @return
     */
    public int minDeletionSize(String[] A) {
        int result = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 0; j < A.length - 1; j++) {
                int tmp = result;
                for (int k = j + 1; k < A.length; k++) {
                    if (A[j].charAt(i) > A[k].charAt(i)) {
                        result++;
                        break;
                    }
                }
                if (tmp != result) {
                    break;
                }
            }
        }
        return result;
    }
}

