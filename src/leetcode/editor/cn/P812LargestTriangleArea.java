//给定包含多个点的集合，从其中取三个点组成三角形，返回能组成的最大三角形的面积。 
//
// 
//示例:
//输入: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
//输出: 2
//解释: 
//这五个点如下图所示。组成的橙色三角形是最大的，面积为2。
// 
//
// 
//
// 注意: 
//
// 
// 3 <= points.length <= 50. 
// 不存在重复的点。 
// -50 <= points[i][j] <= 50. 
// 结果误差值在 10^-6 以内都认为是正确答案。 
// 
// Related Topics 数学 
// 👍 66 👎 0


package leetcode.editor.cn;

/**
 * Java：最大三角形面积
 * date：2020-10-21 09:30:19
 **/
public class P812LargestTriangleArea {
    public static void main(String[] args) {
        Solution solution = new P812LargestTriangleArea().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double largestTriangleArea(int[][] points) {
            double max = 0.0d;
            int len = points.length;
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    for (int k = 0; k < len; k++) {
                        if (i != j && i != k && j != k) {
                            max = Math.max(max, getAreaByThreePoints(points[i][0], points[i][1],
                                    points[j][0], points[j][1],
                                    points[k][0], points[k][1]));
                        }
                    }
                }
            }
            return max;
        }

        private double getAreaByThreePoints(int x1, int y1, int x2, int y2, int x3, int y3) {
            return 0.5 * Math.abs(x1 * y2 + x2 * y3 + x3 * y1 - x1 * y3 - x2 * y1 - x3 * y2);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
