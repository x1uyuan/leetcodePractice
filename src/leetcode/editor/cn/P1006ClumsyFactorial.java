//通常，正整数 n 的阶乘是所有小于或等于 n 的正整数的乘积。例如，factorial(10) = 10 * 9 * 8 * 7 * 6 * 5 * 4 *
// 3 * 2 * 1。 
//
// 相反，我们设计了一个笨阶乘 clumsy：在整数的递减序列中，我们以一个固定顺序的操作符序列来依次替换原有的乘法操作符：乘法(*)，除法(/)，加法(+)
//和减法(-)。 
//
// 例如，clumsy(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1。然而，这些运算仍然使用通常的算术运算顺序：我
//们在任何加、减步骤之前执行所有的乘法和除法步骤，并且按从左到右处理乘法和除法步骤。 
//
// 另外，我们使用的除法是地板除法（floor division），所以 10 * 9 / 8 等于 11。这保证结果是一个整数。 
//
// 实现上面定义的笨函数：给定一个整数 N，它返回 N 的笨阶乘。 
//
// 
//
// 示例 1： 
//
// 输入：4
//输出：7
//解释：7 = 4 * 3 / 2 + 1
// 
//
// 示例 2： 
//
// 输入：10
//输出：12
//解释：12 = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= N <= 10000 
// -2^31 <= answer <= 2^31 - 1 （答案保证符合 32 位整数。） 
// 
// Related Topics 数学 
// 👍 14 👎 0


package leetcode.editor.cn;

/**
 * Java：笨阶乘
 * date：2020-07-17 14:05:18
 **/
public class P1006ClumsyFactorial {
    public static void main(String[] args) {
        Solution solution = new P1006ClumsyFactorial().new Solution();
        // TO TEST
        System.out.println(solution.clumsy(1));
        System.out.println(solution.clumsy(2));
        System.out.println(solution.clumsy(3));
        System.out.println(solution.clumsy(4));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int clumsy(int N) {
            if (N == 1) return 1;
            if (N == 2) return 2;
            if (N == 3) return 6;
            int circle = N / 4;
            int res = 0;
            if (circle > 0) res = N * (N - 1) / (N - 2) + (N - 3);
            for (int i = 1; i < circle; i++) {
                res -= (N - i * 4) * (N - i * 4 - 1) / (N - i * 4 - 2) - (N - i * 4 - 3);
            }
            int mod = N % 4;
            if (mod == 1) res -= 1;
            if (mod == 2) res -= 2;
            if (mod == 3) res -= 6;
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
