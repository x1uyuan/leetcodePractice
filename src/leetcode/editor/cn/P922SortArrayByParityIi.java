//给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。 
//
// 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。 
//
// 你可以返回任何满足上述条件的数组作为答案。 
//
// 
//
// 示例： 
//
// 输入：[4,2,5,7]
//输出：[4,5,2,7]
//解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= A.length <= 20000 
// A.length % 2 == 0 
// 0 <= A[i] <= 1000 
// 
//
// 
// Related Topics 排序 数组 
// 👍 143 👎 0


package leetcode.editor.cn;

import java.util.Stack;

/**
 * Java：按奇偶排序数组 II
 * date：2020-11-12 09:23:55
 **/
public class P922SortArrayByParityIi {
    public static void main(String[] args) {
        Solution solution = new P922SortArrayByParityIi().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            Stack<Integer> stack0 = new Stack<>();
            Stack<Integer> stack1 = new Stack<>();
            for (int i = 0; i < A.length; i++) {
                if (A[i] % 2 == 0) stack0.push(A[i]);
                else stack1.push(A[i]);
            }
            for (int i = 0; i < A.length / 2; i++) {
                A[2 * i] = stack0.pop();
                A[2 * i + 1] = stack1.pop();
            }
            return A;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
