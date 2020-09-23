//给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。 
//
// 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组： 
//
// 
// A.length >= 3 
// 在 0 < i < A.length - 1 条件下，存在 i 使得：
// 
// A[0] < A[1] < ... A[i-1] < A[i] 
// A[i] > A[i+1] > ... > A[A.length - 1] 
// 
// 
// 
//
// 
//
// 
//
// 
//
// 示例 1： 
//
// 输入：[2,1]
//输出：false
// 
//
// 示例 2： 
//
// 输入：[3,5,5]
//输出：false
// 
//
// 示例 3： 
//
// 输入：[0,3,2,1]
//输出：true 
//
// 
//
// 提示： 
//
// 
// 0 <= A.length <= 10000 
// 0 <= A[i] <= 10000 
// 
//
// 
//
// 
// Related Topics 数组 
// 👍 55 👎 0


package leetcode.editor.cn;

/**
 * Java：有效的山脉数组
 * date：2020-09-11 11:01:09
 **/
public class P941ValidMountainArray {
    public static void main(String[] args) {
        Solution solution = new P941ValidMountainArray().new Solution();
        // TO TEST
        System.out.println(solution.validMountainArray(new int[]{2, 1}));
        System.out.println(solution.validMountainArray(new int[]{3, 5, 5}));
        System.out.println(solution.validMountainArray(new int[]{0, 3, 2, 1}));
        System.out.println(solution.validMountainArray(new int[]{0, 1, 2, 3}));
        System.out.println(solution.validMountainArray(new int[]{4, 3, 2, 1}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean validMountainArray(int[] A) {
            int len = A.length;
            if (len < 3) return false;
            int left = 0;
            int leftTag = 0;
            int right = len - 1;
            int rightTag = 0;
            for (int i = 0; i < len - 1; i++) {
                if (A[i] < A[i + 1]) left = i + 1;
                else {
                    leftTag = 1;
                    break;
                }
            }

            for (int i = len - 1; i > 0; i--) {
                if (A[i] < A[i - 1]) right = i - 1;
                else {
                    rightTag = 1;
                    break;
                }
            }

            return leftTag == 1 && rightTag == 1 && left == right;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
