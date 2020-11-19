//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 821 👎 0


package leetcode.editor.cn;

/**
 * Java：移动零
 * date：2020-11-19 09:56:45
 **/
public class P283MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new P283MoveZeroes().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int left = 0;
            int right = 1;
            while (right < nums.length) {
                if (nums[left] == 0) {
                    if (nums[right] == 0) {
                        right++;
                    } else {
                        nums[left] = nums[right];
                        nums[right] = 0;
                    }
                } else {
                    left++;
                    right++;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
