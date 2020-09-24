//给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。 
//
// 幸运数是指矩阵中满足同时下列两个条件的元素： 
//
// 
// 在同一行的所有元素中最小 
// 在同一列的所有元素中最大 
// 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
//输出：[15]
//解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
//输出：[12]
//解释：12 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
// 
//
// 示例 3： 
//
// 输入：matrix = [[7,8],[1,2]]
//输出：[7]
// 
//
// 
//
// 提示： 
//
// 
// m == mat.length 
// n == mat[i].length 
// 1 <= n, m <= 50 
// 1 <= matrix[i][j] <= 10^5 
// 矩阵中的所有元素都是不同的 
// 
// Related Topics 数组 
// 👍 24 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Java：矩阵中的幸运数
 * date：2020-09-24 15:45:49
 **/
public class P1380LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        Solution solution = new P1380LuckyNumbersInAMatrix().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> luckyNumbers(int[][] matrix) {
            List<Integer> res = new ArrayList<>();
            int row = matrix.length;
            int col = matrix[0].length;
            int[] rowMin = new int[row];
            int[] colMax = new int[col];
            for (int i = 0; i < row; i++) {
                int tmpMin = matrix[i][0];
                for (int j = 1; j < col; j++) {
                    tmpMin = Math.min(matrix[i][j], tmpMin);
                }
                rowMin[i] = tmpMin;
            }
            for (int i = 0; i < col; i++) {
                int tmpMax = matrix[0][i];
                for (int j = 1; j < row; j++) {
                    tmpMax = Math.max(matrix[j][i], tmpMax);
                }
                colMax[i] = tmpMax;
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) res.add(matrix[i][j]);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
