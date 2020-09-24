//给你两个非负整数 low 和 high 。请你返回 low 和 high 之间（包括二者）奇数的数目。 
//
// 
//
// 示例 1： 
//
// 输入：low = 3, high = 7
//输出：3
//解释：3 到 7 之间奇数数字为 [3,5,7] 。 
//
// 示例 2： 
//
// 输入：low = 8, high = 10
//输出：1
//解释：8 到 10 之间奇数数字为 [9] 。 
//
// 
//
// 提示： 
//
// 
// 0 <= low <= high <= 10^9 
// 
// Related Topics 数学 
// 👍 7 👎 0


package leetcode.editor.cn;

/**
 * Java：在区间范围内统计奇数数目
 * date：2020-09-24 13:59:59
 **/
public class P1523CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {
        Solution solution = new P1523CountOddNumbersInAnIntervalRange().new Solution();
        // TO TEST
        System.out.println(solution.countOdds(3, 7));
        System.out.println(solution.countOdds(8, 10));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countOdds(int low, int high) {
            int diff = high - low;
            if (diff % 2 == 1) return (diff + 1) / 2;
            else {
                if (low % 2 == 1) return diff / 2 + 1;
                else return diff / 2;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
