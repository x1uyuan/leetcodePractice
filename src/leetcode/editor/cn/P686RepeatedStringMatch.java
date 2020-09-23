//给定两个字符串 A 和 B, 寻找重复叠加字符串A的最小次数，使得字符串B成为叠加后的字符串A的子串，如果不存在则返回 -1。 
//
// 举个例子，A = "abcd"，B = "cdabcdab"。 
//
// 答案为 3， 因为 A 重复叠加三遍后为 “abcdabcdabcd”，此时 B 是其子串；A 重复叠加两遍后为"abcdabcd"，B 并不是其子串。 
//
//
// 注意: 
//
// A 与 B 字符串的长度在1和10000区间范围内。 
// Related Topics 字符串 
// 👍 102 👎 0


package leetcode.editor.cn;

/**
 * Java：重复叠加字符串匹配
 * date：2020-08-21 15:27:11
 **/
public class P686RepeatedStringMatch {
    public static void main(String[] args) {
        Solution solution = new P686RepeatedStringMatch().new Solution();
        // TO TEST
        System.out.println(solution.repeatedStringMatch("abcd","cdabcdab"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int repeatedStringMatch(String A, String B) {
            int n = B.length() / A.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(A);
            }
            for (int i = 0; i < 2; i++) {
                if (sb.indexOf(B) > 0) return n + i;
                sb.append(A);
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
