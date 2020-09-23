//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。 
//
// 注意： 
//
// 
// num1 和num2 的长度都小于 5100. 
// num1 和num2 都只包含数字 0-9. 
// num1 和num2 都不包含任何前导零。 
// 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。 
// 
// Related Topics 字符串 
// 👍 228 👎 0


package leetcode.editor.cn;

/**
 * Java：字符串相加
 * date：2020-08-03 16:32:08
 **/
public class P415AddStrings {
    public static void main(String[] args) {
        Solution solution = new P415AddStrings().new Solution();
        // TO TEST
        System.out.println(solution.addStrings("30230", "42130"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addStrings(String num1, String num2) {
            int len1 = num1.length();
            int len2 = num2.length();

            if (len1 < len2) {
                String tmp = num1;
                num1 = num2;
                num2 = tmp;
            }

            len1 = num1.length();
            len2 = num2.length();

            StringBuilder sb = new StringBuilder();
            int carry = 0;

            for (int i = 0; i < Math.min(len1, len2); i++) {
                int count1 = num1.charAt(len1 - i - 1) - '0';
                int count2 = num2.charAt(len2 - i - 1) - '0';
                int sum = count1 + count2 + carry;
                sb.append(sum % 10);
                carry = sum / 10;
            }

            for (int i = 0; i < len1 - len2; i++) {
                int count1 = num1.charAt(len1 - i - 1) - '0';
                int sum = count1 + carry;
                sb.append(sum % 10);
                carry = sum / 10;
            }
            sb.reverse();
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
