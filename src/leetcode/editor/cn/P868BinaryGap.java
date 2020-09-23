//给定一个正整数 N，找到并返回 N 的二进制表示中两个相邻 1 之间的最长距离。 
//
// 如果没有两个相邻的 1，返回 0 。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入：22
//输出：2
//解释：
//22 的二进制是 0b10110 。
//在 22 的二进制表示中，有三个 1，组成两对相邻的 1 。
//第一对相邻的 1 中，两个 1 之间的距离为 2 。
//第二对相邻的 1 中，两个 1 之间的距离为 1 。
//答案取两个距离之中最大的，也就是 2 。
// 
//
// 示例 2： 
//
// 输入：5
//输出：2
//解释：
//5 的二进制是 0b101 。
// 
//
// 示例 3： 
//
// 输入：6
//输出：1
//解释：
//6 的二进制是 0b110 。
// 
//
// 示例 4： 
//
// 输入：8
//输出：0
//解释：
//8 的二进制是 0b1000 。
//在 8 的二进制表示中没有相邻的两个 1，所以返回 0 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= N <= 10^9 
// 
// Related Topics 数学 
// 👍 52 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Java：二进制间距
 * date：2020-09-07 16:56:19
 **/
public class P868BinaryGap {
    public static void main(String[] args) {
        Solution solution = new P868BinaryGap().new Solution();
        // TO TEST
        System.out.println(solution.binaryGap(6));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int binaryGap(int N) {
//            String s = Integer.toBinaryString(N);
//            List<Integer> lst = new ArrayList<>();
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) == '1') lst.add(i);
//            }
//            if (lst.size() < 2) return 0;
//            int res = lst.get(1) - lst.get(0);
//            for (int i = 2; i < lst.size(); i++) {
//                res = Math.max(res, lst.get(i) - lst.get(i - 1));
//            }
//            return res;
            char[] cs = Integer.toBinaryString(N).toCharArray();
            int first = 0;
            for (int i = 0; i < cs.length; i++) {
                if (cs[i] == '1') {
                    first = i;
                    break;
                }
            }
            int res = 0;
            for (int i = first + 1; i < cs.length; i++) {
                if (cs[i] == '1') {
                    res = Math.max(i - first, res);
                    first = i;
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
