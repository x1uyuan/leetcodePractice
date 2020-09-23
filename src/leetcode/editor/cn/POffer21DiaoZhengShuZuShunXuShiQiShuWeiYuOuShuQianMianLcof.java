//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。 
//
// 
//
// 示例： 
//
// 输入：nums = [1,2,3,4]
//输出：[1,3,2,4] 
//注：[3,1,2,4] 也是正确的答案之一。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 50000 
// 1 <= nums[i] <= 10000 
// 
// 👍 33 👎 0


package leetcode.editor.cn;

/**
 * Java：调整数组顺序使奇数位于偶数前面
 * date：2020-07-23 16:55:41
 **/
public class POffer21DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof {
    public static void main(String[] args) {
        Solution solution = new POffer21DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();
        // TO TEST
        int[] out = solution.exchange(new int[]{1, 2, 3, 4});
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] exchange(int[] nums) {
            int len = nums.length;
            int left = 0;
            int right = len - 1;

            while (left < right) {
                if (nums[left] % 2 == 0) {
                    if (nums[right] % 2 != 0) {
                        int tmp = nums[left];
                        nums[left] = nums[right];
                        nums[right] = tmp;
                        left++;
                    }
                    right--;
                } else {
                    if (nums[right] % 2 == 0) right--;
                    left++;
                }
            }
            return nums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
