//给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。 
//
// 示例 1: 
//
// 输入: 2
//输出: 1
//解释: 2 = 1 + 1, 1 × 1 = 1。 
//
// 示例 2: 
//
// 输入: 10
//输出: 36
//解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。 
//
// 说明: 你可以假设 n 不小于 2 且不大于 58。 
// Related Topics 数学 动态规划 
// 👍 285 👎 0


package leetcode.editor.cn;

/**
 * Java：整数拆分
 * date：2020-07-30 10:02:58
 **/
public class P343IntegerBreak {
    public static void main(String[] args) {
        Solution solution = new P343IntegerBreak().new Solution();
        // TO TEST
        System.out.println(solution.integerBreak(10));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
//        数学法
//        public int integerBreak(int n) {
//            if (n < 4) return n - 1;
//            if (n % 3 == 0) return (int) Math.pow(3, n / 3);
//            else if (n % 3 == 1) return (int) Math.pow(3, n / 3 - 1) * 4;
//            else return (int) Math.pow(3, n / 3) * 2;
//        }
        // 动态规划法
        public int integerBreak(int n) {
            if (n < 4) return n - 1;
            int[] dp = new int[n + 1];
            dp[2] = 1;
            for (int i = 3; i <= n; i++) {
                dp[i] = Math.max(Math.max(2 * (i - 2), 2 * dp[i - 2]), Math.max(3 * (i - 3), 3 * dp[i - 3]));
            }
            return dp[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
