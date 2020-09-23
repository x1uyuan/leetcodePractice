//给你一个整数 n，请你每隔三位添加点（即 "." 符号）作为千位分隔符，并将结果以字符串格式返回。 
//
// 
//
// 示例 1： 
//
// 输入：n = 987
//输出："987"
// 
//
// 示例 2： 
//
// 输入：n = 1234
//输出："1.234"
// 
//
// 示例 3： 
//
// 输入：n = 123456789
//输出："123.456.789"
// 
//
// 示例 4： 
//
// 输入：n = 0
//输出："0"
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n < 2^31 
// 
// Related Topics 字符串 
// 👍 0 👎 0


package leetcode.editor.cn;

/**
 * Java：千位分隔数
 * date：2020-08-26 17:53:36
 **/
public class P1556ThousandSeparator {
    public static void main(String[] args) {
        Solution solution = new P1556ThousandSeparator().new Solution();
        // TO TEST
        System.out.println(solution.thousandSeparator(987));
        System.out.println(solution.thousandSeparator(1234));
        System.out.println(solution.thousandSeparator(123456789));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String thousandSeparator(int n) {
            StringBuilder sb = new StringBuilder(n + "");
            int len = sb.length();
            for (int i = len - 3; i > 0;) {
                sb.insert(i, '.');
                i -= 3;
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
