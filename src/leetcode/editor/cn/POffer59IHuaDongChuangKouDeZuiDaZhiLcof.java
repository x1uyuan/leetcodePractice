//给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。 
//
// 示例: 
//
// 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
//输出: [3,3,5,5,6,7] 
//解释: 
//
//  滑动窗口的位置                最大值
//---------------               -----
//[1  3  -1] -3  5  3  6  7       3
// 1 [3  -1  -3] 5  3  6  7       3
// 1  3 [-1  -3  5] 3  6  7       5
// 1  3  -1 [-3  5  3] 6  7       5
// 1  3  -1  -3 [5  3  6] 7       6
// 1  3  -1  -3  5 [3  6  7]      7 
//
// 
//
// 提示： 
//
// 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。 
//
// 注意：本题与主站 239 题相同：https://leetcode-cn.com/problems/sliding-window-maximum/ 
// Related Topics 队列 Sliding Window 
// 👍 76 👎 0


package leetcode.editor.cn;

/**
 * Java：滑动窗口的最大值
 * date：2020-07-29 15:44:02
 **/
public class POffer59IHuaDongChuangKouDeZuiDaZhiLcof {
    public static void main(String[] args) {
        Solution solution = new POffer59IHuaDongChuangKouDeZuiDaZhiLcof().new Solution();
        // TO TEST
        int[] out = solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        for (int i : out) {
            System.out.println(i);
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if (nums.length == 0) return new int[0];
            int[] res = new int[nums.length - k + 1];
            for (int i = 0; i < nums.length - k + 1; i++) {
                res[i] = nums[i];
                for (int j = 1; j < k; j++) {
                    res[i] = Math.max(nums[i + j], res[i]);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
