//你这个学期必须选修 numCourse 门课程，记为 0 到 numCourse-1 。 
//
// 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们：[0,1] 
//
// 给定课程总量以及它们的先决条件，请你判断是否可能完成所有课程的学习？ 
//
// 
//
// 示例 1: 
//
// 输入: 2, [[1,0]] 
//输出: true
//解释: 总共有 2 门课程。学习课程 1 之前，你需要完成课程 0。所以这是可能的。 
//
// 示例 2: 
//
// 输入: 2, [[1,0],[0,1]]
//输出: false
//解释: 总共有 2 门课程。学习课程 1 之前，你需要先完成​课程 0；并且学习课程 0 之前，你还应先完成课程 1。这是不可能的。 
//
// 
//
// 提示： 
//
// 
// 输入的先决条件是由 边缘列表 表示的图形，而不是 邻接矩阵 。详情请参见图的表示法。 
// 你可以假定输入的先决条件中没有重复的边。 
// 1 <= numCourses <= 10^5 
// 
// Related Topics 深度优先搜索 广度优先搜索 图 拓扑排序 
// 👍 486 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Java：课程表
 * date：2020-08-04 16:51:59
 **/
public class P207CourseSchedule {
    public static void main(String[] args) {
        Solution solution = new P207CourseSchedule().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            HashMap<Integer, ArrayList<Integer>> outNodes = new HashMap<>();
            HashSet<Integer> set = new HashSet<>();
            int rows = prerequisites.length;
            for (int i = 0; i < rows; i++) {
                int key = prerequisites[i][0];
                int value = prerequisites[i][1];
                set.add(key);
                if (!outNodes.containsKey(key)) {
                    outNodes.put(key, new ArrayList<>());
                }
                //存储当前节点的所有先修课程
                ArrayList<Integer> list = outNodes.get(key);
                list.add(value);
            }

            HashSet<Integer> visitedFinish = new HashSet<>();
            //判断每一门课
            for (int k : set) {
                if (!dfs(k, outNodes, new HashSet<>(), visitedFinish)) {
                    return false;
                }
                visitedFinish.add(k);
            }
            return true;
        }

        private boolean dfs(int start, HashMap<Integer, ArrayList<Integer>> outNodes, HashSet<Integer> visited,
                            HashSet<Integer> visitedFinish) {
            //已经处理过或者到了叶子节点
            if (visitedFinish.contains(start) || !outNodes.containsKey(start)) {
                return true;
            }
            //出现了环
            if (visited.contains(start)) {
                return false;
            }
            //将当前节点加入路径
            visited.add(start);
            ArrayList<Integer> list = outNodes.get(start);
            for (int k : list) {
                if(!dfs(k, outNodes, visited, visitedFinish)){
                    return false;
                }
            }
            visited.remove(start);
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
