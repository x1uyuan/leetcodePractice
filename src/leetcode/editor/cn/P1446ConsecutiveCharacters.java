//给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。 
//
// 请你返回字符串的能量。 
//
// 
//
// 示例 1： 
//
// 输入：s = "leetcode"
//输出：2
//解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
// 
//
// 示例 2： 
//
// 输入：s = "abbcccddddeeeeedcba"
//输出：5
//解释：子字符串 "eeeee" 长度为 5 ，只包含字符 'e' 。
// 
//
// 示例 3： 
//
// 输入：s = "triplepillooooow"
//输出：5
// 
//
// 示例 4： 
//
// 输入：s = "hooraaaaaaaaaaay"
//输出：11
// 
//
// 示例 5： 
//
// 输入：s = "tourist"
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 500 
// s 只包含小写英文字母。 
// 
// Related Topics 字符串 
// 👍 9 👎 0


package leetcode.editor.cn;

/**
 * Java：连续字符
 * date：2020-11-06 15:23:20
 **/
public class P1446ConsecutiveCharacters {
    public static void main(String[] args) {
        Solution solution = new P1446ConsecutiveCharacters().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxPower(String s) {
            char c = s.charAt(0);
            int max = 1;
            int count = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == c) count++;
                else {
                    c = s.charAt(i);
                    count = 1;
                }
                max = Math.max(max, count);
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
