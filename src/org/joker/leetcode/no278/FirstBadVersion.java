package org.joker.leetcode.no278;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-06-13 10:34
 */

/**
 * The isBadVersion API is defined in the parent class VersionControl.
 *       boolean isBadVersion(int version);
 */
public class FirstBadVersion extends VersionControl {

    /**
     * 执行用时 :17 ms, 在所有Java提交中击败了72.96%的用户
     * 内存消耗 :31.9 MB, 在所有Java提交中击败了99.49%的用户
     *
     * @param n
     * @return
     */
    public int firstBadVersion(int n) {
        int low = 1, high = n, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low <= n && isBadVersion(low)) {
            return low;
        } else {
            return -1;
        }
    }
}

