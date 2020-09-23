//给定一个矩阵 A， 返回 A 的转置矩阵。 
//
// 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。 
//
// 
//
// 示例 1： 
//
// 输入：[[1,2,3],[4,5,6],[7,8,9]]
//输出：[[1,4,7],[2,5,8],[3,6,9]]
// 
//
// 示例 2： 
//
// 输入：[[1,2,3],[4,5,6]]
//输出：[[1,4],[2,5],[3,6]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 1000 
// 1 <= A[0].length <= 1000 
// 
// Related Topics 数组 
// 👍 100 👎 0


package leetcode.editor.cn;

/**
 * Java：转置矩阵
 * date：2020-08-24 16:38:12
 **/
public class P867TransposeMatrix {
    public static void main(String[] args) {
        Solution solution = new P867TransposeMatrix().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] transpose(int[][] A) {
            int row = A.length;
            int col = A[0].length;
            int[][] res = new int[col][row];
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    res[i][j] = A[j][i];
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
