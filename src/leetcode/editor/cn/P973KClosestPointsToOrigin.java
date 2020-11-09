//我们有一个由平面上的点组成的列表 points。需要从中找出 K 个距离原点 (0, 0) 最近的点。 
//
// （这里，平面上两点之间的距离是欧几里德距离。） 
//
// 你可以按任何顺序返回答案。除了点坐标的顺序之外，答案确保是唯一的。 
//
// 
//
// 示例 1： 
//
// 输入：points = [[1,3],[-2,2]], K = 1
//输出：[[-2,2]]
//解释： 
//(1, 3) 和原点之间的距离为 sqrt(10)，
//(-2, 2) 和原点之间的距离为 sqrt(8)，
//由于 sqrt(8) < sqrt(10)，(-2, 2) 离原点更近。
//我们只需要距离原点最近的 K = 1 个点，所以答案就是 [[-2,2]]。
// 
//
// 示例 2： 
//
// 输入：points = [[3,3],[5,-1],[-2,4]], K = 2
//输出：[[3,3],[-2,4]]
//（答案 [[-2,4],[3,3]] 也会被接受。）
// 
//
// 
//
// 提示： 
//
// 
// 1 <= K <= points.length <= 10000 
// -10000 < points[i][0] < 10000 
// -10000 < points[i][1] < 10000 
// 
// Related Topics 堆 排序 分治算法 
// 👍 166 👎 0


package leetcode.editor.cn;

import java.util.*;

/**
 * Java：最接近原点的 K 个点
 * date：2020-11-09 13:39:34
 **/
public class P973KClosestPointsToOrigin {
    public static void main(String[] args) {
        Solution solution = new P973KClosestPointsToOrigin().new Solution();
        // TO TEST
        solution.kClosest(new int[][]{{1,3},{-2,2}}, 1);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] kClosest(int[][] points, int K) {
            int[][] res = new int[K][2];
            if (K == 0) return res;
            int[] map = new int[points.length];
            Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return map[o1] - map[o2];
                }
            });
            for (int i = 0; i < points.length; i++) {
                int x = points[i][0];
                int y = points[i][1];
                map[i] = x * x + y * y;
                pq.add(i);
            }
            int index = 0;
            while (index < K) {
                int count = pq.remove();
                res[index][0] = points[count][0];
                res[index][1] = points[count][1];
                index++;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
