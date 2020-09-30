//给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。 
//
// 
//
// 示例 1： 
//
// 输入： A = "ab", B = "ba"
//输出： true
// 
//
// 示例 2： 
//
// 输入： A = "ab", B = "ab"
//输出： false
// 
//
// 示例 3: 
//
// 输入： A = "aa", B = "aa"
//输出： true
// 
//
// 示例 4： 
//
// 输入： A = "aaaaaaabc", B = "aaaaaaacb"
//输出： true
// 
//
// 示例 5： 
//
// 输入： A = "", B = "aa"
//输出： false
// 
//
// 
//
// 提示： 
//
// 
// 0 <= A.length <= 20000 
// 0 <= B.length <= 20000 
// A 和 B 仅由小写字母构成。 
// 
// Related Topics 字符串 
// 👍 111 👎 0


package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * Java：亲密字符串
 * date：2020-09-30 13:33:12
 **/
public class P859BuddyStrings {
    public static void main(String[] args) {
        Solution solution = new P859BuddyStrings().new Solution();
        // TO TEST
        System.out.println(solution.buddyStrings("abab", "baba"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean buddyStrings(String A, String B) {
            int len1 = A.length();
            int len2 = B.length();
            int count = 0;
            if (len1 == 0 || len2 == 0 || len1 != len2) return false;
            Set<Character> set = new HashSet<>();
            if (A.equals(B)) {
                for (int i = 0; i < len1; i++) {
                    set.add(A.charAt(i));
                }
                if (set.size() < len1) return true;
                else return false;
            } else {
                for (int i = 0; i < len1; i++) {
                    if (A.charAt(i) != B.charAt(i)) {
                        count++;
                        set.add(A.charAt(i));
                    }
                }
                if (count == 2 && set.size() == 2) return true;
                else return false;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
