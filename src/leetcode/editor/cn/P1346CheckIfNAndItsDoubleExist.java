//给你一个整数数组 arr，请你检查是否存在两个整数 N 和 M，满足 N 是 M 的两倍（即，N = 2 * M）。 
//
// 更正式地，检查是否存在两个下标 i 和 j 满足： 
//
// 
// i != j 
// 0 <= i, j < arr.length 
// arr[i] == 2 * arr[j] 
// 
//
// 
//
// 示例 1： 
//
// 输入：arr = [10,2,5,3]
//输出：true
//解释：N = 10 是 M = 5 的两倍，即 10 = 2 * 5 。
// 
//
// 示例 2： 
//
// 输入：arr = [7,1,14,11]
//输出：true
//解释：N = 14 是 M = 7 的两倍，即 14 = 2 * 7 。
// 
//
// 示例 3： 
//
// 输入：arr = [3,1,7,11]
//输出：false
//解释：在该情况下不存在 N 和 M 满足 N = 2 * M 。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= arr.length <= 500 
// -10^3 <= arr[i] <= 10^3 
// 
// Related Topics 数组 
// 👍 29 👎 0


package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * Java：检查整数及其两倍数是否存在
 * date：2020-11-09 16:24:36
 **/
public class P1346CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        Solution solution = new P1346CheckIfNAndItsDoubleExist().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkIfExist(int[] arr) {
            int zeroCount = 0;
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) zeroCount++;
                set.add(arr[i]);
            }
            if (zeroCount >= 2) return true;
            for (int i : set) {
                if (i != 0 && set.contains(2 * i)) return true;
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
