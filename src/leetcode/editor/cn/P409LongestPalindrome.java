//给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。 
//
// 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。 
//
// 注意: 
//假设字符串的长度不会超过 1010。 
//
// 示例 1: 
//
// 
//输入:
//"abccccdd"
//
//输出:
//7
//
//解释:
//我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
// 
// Related Topics 哈希表 
// 👍 231 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Java：最长回文串
 * date：2020-09-14 14:42:56
 **/
public class P409LongestPalindrome {
    public static void main(String[] args) {
        Solution solution = new P409LongestPalindrome().new Solution();
        // TO TEST
        System.out.println(solution.longestPalindrome("dccaccd"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestPalindrome(String s) {
            Set<Character> set = new HashSet<>();
            char[] cs = s.toCharArray();
            int count = 0;
            for (char c : cs) {
                if (set.contains(c)) {
                    count += 2;
                    set.remove(c);
                } else {
                    set.add(c);
                }
            }
            return s.length() > count ? count + 1 : count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
