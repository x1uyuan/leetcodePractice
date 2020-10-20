//给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。 
//
// 示例 1: 
//
// 
//输入: "aba"
//输出: True
// 
//
// 示例 2: 
//
// 
//输入: "abca"
//输出: True
//解释: 你可以删除c字符。
// 
//
// 注意: 
//
// 
// 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。 
// 
// Related Topics 字符串 
// 👍 276 👎 0


package leetcode.editor.cn;

/**
 * Java：验证回文字符串 Ⅱ
 * date：2020-10-20 13:21:56
 **/
public class P680ValidPalindromeIi {
    public static void main(String[] args) {
        Solution solution = new P680ValidPalindromeIi().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int flag = 0;

        public boolean validPalindrome(String s) {
            int len = s.length();
            if (len < 3) return true;
            return helper(s, 0, len - 1);
        }

        private boolean helper(String s, int i, int j) {
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    if (flag == 0) {
                        flag++;
                        return helper(s, i + 1, j) || helper(s, i, j - 1);
                    } else {
                        return false;
                    }
                } else {
                    i++;
                    j--;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
