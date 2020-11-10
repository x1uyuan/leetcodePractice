//实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。 
//
// 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。 
//
// 必须原地修改，只允许使用额外常数空间。 
//
// 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。 
//1,2,3 → 1,3,2 
//3,2,1 → 1,2,3 
//1,1,5 → 1,5,1 
// Related Topics 数组 
// 👍 766 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * Java：下一个排列
 * date：2020-11-10 10:54:38
 **/
public class P31NextPermutation {
    public static void main(String[] args) {
        Solution solution = new P31NextPermutation().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void nextPermutation(int[] nums) {
            int len = nums.length;
            int i = len - 1;
            while (i > 0) {
                if (nums[i] <= nums[i - 1]) {
                    i--;
                } else {
                    Arrays.sort(nums, i, len);
                    for (int k = i; k < len; k++) {
                        if (nums[k] > nums[i - 1]) {
                            int temp = nums[i - 1];
                            nums[i - 1] = nums[k];
                            nums[k] = temp;
                            break;
                        }
                    }
                    break;
                }
            }
            if (i == 0) {
                Arrays.sort(nums);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
