//给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。 
//
// 说明：不要使用任何内置的库函数，如 sqrt。 
//
// 示例 1： 
//
// 输入：16
//输出：True 
//
// 示例 2： 
//
// 输入：14
//输出：False
// 
// Related Topics 数学 二分查找 
// 👍 168 👎 0


package leetcode.editor.cn;

/**
 * Java：有效的完全平方数
 * date：2020-09-25 14:28:28
 **/
public class P367ValidPerfectSquare {
    public static void main(String[] args) {
        Solution solution = new P367ValidPerfectSquare().new Solution();
        // TO TEST
        System.out.println(solution.isPerfectSquare(16));
        System.out.println(solution.isPerfectSquare(15));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPerfectSquare(int num) {
            double sqrt = Math.sqrt(num);
            return sqrt == Math.floor(sqrt) && sqrt == Math.ceil(sqrt);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
