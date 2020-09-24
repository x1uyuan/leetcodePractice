//编写一个函数，以字符串作为输入，反转该字符串中的元音字母。 
//
// 
//
// 示例 1： 
//
// 输入："hello"
//输出："holle"
// 
//
// 示例 2： 
//
// 输入："leetcode"
//输出："leotcede" 
//
// 
//
// 提示： 
//
// 
// 元音字母不包含字母 "y" 。 
// 
// Related Topics 双指针 字符串 
// 👍 115 👎 0


package leetcode.editor.cn;

/**
 * Java：反转字符串中的元音字母
 * date：2020-09-23 15:06:57
 **/
public class P345ReverseVowelsOfAString {
    public static void main(String[] args) {
        Solution solution = new P345ReverseVowelsOfAString().new Solution();
        // TO TEST
        System.out.println(solution.reverseVowels("leetcode"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseVowels(String s) {
            char[] cs = s.toCharArray();
            int len = cs.length;
            int left = 0;
            int right = len - 1;
            while (left < right) {
                if (isVowel(cs[left]) && isVowel(cs[right])) {
                    char tmp = cs[left];
                    cs[left] = cs[right];
                    cs[right] = tmp;
                    left++;
                    right--;
                } else if (isVowel(cs[left])) {
                    right--;
                } else if (isVowel(cs[right])) {
                    left++;
                } else {
                    left++;
                    right--;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len; i++) {
                sb.append(cs[i]);
            }
            return sb.toString();
        }

        private boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
