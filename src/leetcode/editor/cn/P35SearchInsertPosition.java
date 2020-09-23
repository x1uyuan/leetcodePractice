//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 你可以假设数组中无重复元素。 
//
// 示例 1: 
//
// 输入: [1,3,5,6], 5
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [1,3,5,6], 2
//输出: 1
// 
//
// 示例 3: 
//
// 输入: [1,3,5,6], 7
//输出: 4
// 
//
// 示例 4: 
//
// 输入: [1,3,5,6], 0
//输出: 0
// 
// Related Topics 数组 二分查找 
// 👍 591 👎 0


package leetcode.editor.cn;

/**
 * Java：搜索插入位置
 * date：2020-07-17 13:43:59
 **/
public class P35SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution = new P35SearchInsertPosition().new Solution();
        // TO TEST
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int searchInsert(int[] nums, int target) {
            // 顺序遍历法
//            int len = nums.length;
//            for (int i = 0; i < len; i++) {
//                if (nums[i] >= target) return i;
//            }
//            return len;
            // 二分法
            if (nums.length == 0) return 0;

            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            if (nums[left] >= target) return left;
            return left + 1;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
