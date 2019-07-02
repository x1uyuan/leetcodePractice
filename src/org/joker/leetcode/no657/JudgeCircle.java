package org.joker.leetcode.no657;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-13 23:07
 */
public class JudgeCircle {
    /**
     * 执行用时 : 14 ms, 在Robot Return to Origin的Java提交中击败了65.47% 的用户
     * 内存消耗 : 37 MB, 在Robot Return to Origin的Java提交中击败了95.21% 的用户
     *
     * @param moves
     * @return
     */
    public boolean judgeCircle(String moves) {
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                left++;
            } else if (moves.charAt(i) == 'R') {
                right++;
            } else if (moves.charAt(i) == 'U') {
                up++;
            } else if (moves.charAt(i) == 'D') {
                down++;
            }
        }
        if (left == right && up == down) {
            return true;
        }
        return false;
    }
}

