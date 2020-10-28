//给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺
//序）。 
//
// 找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。 
//
// 示例: 
//
// 
//输入:
//[[0,0],[1,0],[2,0]]
//
//输出:
//2
//
//解释:
//两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
// 
// Related Topics 哈希表 
// 👍 113 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * Java：回旋镖的数量
 * date：2020-10-28 10:25:56
 **/
public class P447NumberOfBoomerangs {
    public static void main(String[] args) {
        Solution solution = new P447NumberOfBoomerangs().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numberOfBoomerangs(int[][] points) {
            int len = points.length;
            int[][] mat = new int[len][len];
            int count = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    int deltaX = points[i][0] - points[j][0];
                    int deltaY = points[i][1] - points[j][1];
                    mat[i][j] = deltaX * deltaX + deltaY * deltaY;
                    mat[j][i] = mat[i][j];
                }
            }
            for (int i = 0; i < len; i++) {
                map.clear();
                for (int j = 0; j < len; j++) {
                    if (i != j) {
                        map.put(mat[i][j], map.getOrDefault(mat[i][j], 0) + 1);
                    }
                }
                for (int x : map.values()) {
                    count += (x * (x - 1));
                }
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
