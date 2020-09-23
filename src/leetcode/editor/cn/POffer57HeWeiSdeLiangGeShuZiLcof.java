//输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [2,7,11,15], target = 9
//输出：[2,7] 或者 [7,2]
// 
//
// 示例 2： 
//
// 输入：nums = [10,26,30,31,47,60], target = 40
//输出：[10,30] 或者 [30,10]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= nums.length <= 10^5 
// 1 <= nums[i] <= 10^6 
// 
// 👍 31 👎 0


package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * Java：和为s的两个数字
 * date：2020-07-29 13:54:16
 **/
public class POffer57HeWeiSdeLiangGeShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new POffer57HeWeiSdeLiangGeShuZiLcof().new Solution();
        // TO TEST
        int[] res1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] res2 = solution.twoSum(new int[]{10, 26, 30, 31, 47, 60}, 40);
        System.out.println(res1[0]);
        System.out.println(res1[1]);
        System.out.println(res2[0]);
        System.out.println(res2[1]);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
//            int len = nums.length;
//            int[] res = new int[2];
//            int left = 0;
//            int right = len - 1;
//            while (left < right) {
//                if (nums[left] + nums[right] == target) {
//                    res[0] = nums[left];
//                    res[1] = nums[right];
//                    break;
//                } else if (nums[left] + nums[right] > target) {
//                    right--;
//                } else {
//                    left++;
//                }
//            }
//            return res;
            int len = nums.length;
            Set<Integer> set = new HashSet<>();
            int[] res = new int[2];
            for (int i = 0; i < len; i++) {
                if (set.contains(target - nums[i])) {
                    res[0] = nums[i];
                    res[1] = target - res[0];
                    break;
                }
                set.add(nums[i]);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
