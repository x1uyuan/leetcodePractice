//给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。 
//
// 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。 
//
// 
//
// 例如，给定三角形： 
//
// [
//     [2],
//    [3,4],
//   [6,5,7],
//  [4,1,8,3]
//]
// 
//
// 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。 
//
// 
//
// 说明： 
//
// 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。 
// Related Topics 数组 动态规划 
// 👍 453 👎 0


package leetcode.editor.cn;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Java：三角形最小路径和
 * date：2020-07-14 09:13:03
 **/
public class P120Triangle {
    public static void main(String[] args) {
        Solution solution = new P120Triangle().new Solution();
        // TO TEST
        List<List<Integer>> in = new ArrayList<>();
        List<Integer> in1 = new ArrayList<>();
        in1.add(2);
        List<Integer> in2 = new ArrayList<>();
        in2.add(3);
        in2.add(4);
        List<Integer> in3 = new ArrayList<>();
        in3.add(6);
        in3.add(5);
        in3.add(7);
        List<Integer> in4 = new ArrayList<>();
        in4.add(4);
        in4.add(1);
        in4.add(8);
        in4.add(3);
        in.add(in1);
        in.add(in2);
        in.add(in3);
        in.add(in4);
        System.out.println(solution.minimumTotal(in));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            int row = triangle.size();
            if (row == 1) return triangle.get(0).get(0);
            for (int i = 1; i < row; i++) {
                triangle.get(i).set(0, triangle.get(i - 1).get(0) + triangle.get(i).get(0));
                for (int j = 1; j < i ; j++) {
                    int minSum = Math.min(triangle.get(i - 1).get(j - 1), triangle.get(i - 1).get(j)) + triangle.get(i).get(j);
                    triangle.get(i).set(j, minSum);
                }
                triangle.get(i).set(i, triangle.get(i - 1).get(i - 1) + triangle.get(i).get(i));
            }
            int res = Integer.MIN_VALUE;
            for (int i = 0; i < row; i++) {
                if (res > triangle.get(row - 1).get(i)) res = triangle.get(row - 1).get(i);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
