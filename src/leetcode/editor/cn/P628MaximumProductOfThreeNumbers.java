//给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。 
//
// 示例 1: 
//
// 
//输入: [1,2,3]
//输出: 6
// 
//
// 示例 2: 
//
// 
//输入: [1,2,3,4]
//输出: 24
// 
//
// 注意: 
//
// 
// 给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。 
// 输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。 
// 
// Related Topics 数组 数学 
// 👍 176 👎 0


package leetcode.editor.cn;

/**
 * Java：三个数的最大乘积
 * date：2020-09-29 14:30:13
 **/
public class P628MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        Solution solution = new P628MaximumProductOfThreeNumbers().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maximumProduct(int[] nums) {
            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
            for (int n : nums) {
                if (n <= min1) {
                    min2 = min1;
                    min1 = n;
                } else if (n <= min2) {
                    min2 = n;
                }
                if (n >= max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = n;
                } else if (n >= max2) {
                    max3 = max2;
                    max2 = n;
                } else if (n >= max3) {
                    max3 = n;
                }
            }
            return Math.max(min1 * min2 * max1, max1 * max2 * max3);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
