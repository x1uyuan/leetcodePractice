//给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。 
//
// 示例 1: 
//
// 输入: [1,12,-5,-6,50,3], k = 4
//输出: 12.75
//解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
// 
//
// 
//
// 注意: 
//
// 
// 1 <= k <= n <= 30,000。 
// 所给数据范围 [-10,000，10,000]。 
// 
// Related Topics 数组 
// 👍 113 👎 0


package leetcode.editor.cn;

/**
 * Java：子数组最大平均数 I
 * date：2020-10-30 13:42:46
 **/
public class P643MaximumAverageSubarrayI {
    public static void main(String[] args) {
        Solution solution = new P643MaximumAverageSubarrayI().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            double sum = 0;
            for (int i = 0; i < k; i++) {
                sum += nums[i];
            }
            double max = sum;
            for (int i = 0; i < nums.length - k; i++) {
                sum += (nums[i + k] - nums[i]);
                max = Math.max(max, sum);
            }
            return max / k;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
