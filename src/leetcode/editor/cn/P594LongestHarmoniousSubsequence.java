//和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。 
//
// 现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。 
//
// 示例 1: 
//
// 
//输入: [1,3,2,2,5,2,3,7]
//输出: 5
//原因: 最长的和谐数组是：[3,2,2,2,3].
// 
//
// 说明: 输入的数组长度最大不超过20,000. 
// Related Topics 哈希表 
// 👍 119 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * Java：最长和谐子序列
 * date：2020-09-07 17:23:41
 **/
public class P594LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        Solution solution = new P594LongestHarmoniousSubsequence().new Solution();
        // TO TEST
        System.out.println(solution.findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        Map<Integer, Integer> map = new HashMap<>();

        public int findLHS(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i] + 1)) res = Math.max(res, map.get(nums[i]) + map.get(nums[i] + 1));
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
