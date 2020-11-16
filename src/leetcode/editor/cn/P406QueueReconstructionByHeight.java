//假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。 编写一个算法来
//重建这个队列。 
//
// 注意： 
//总人数少于1100人。 
//
// 示例 
//
// 
//输入:
//[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
//
//输出:
//[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
// 
// Related Topics 贪心算法 
// 👍 580 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Java：根据身高重建队列
 * date：2020-11-16 10:43:35
 **/
public class P406QueueReconstructionByHeight {
    public static void main(String[] args) {
        Solution solution = new P406QueueReconstructionByHeight().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] reconstructQueue(int[][] people) {
            int len = people.length;
            for (int i = 0; i < len - 1; i++) {
                for (int j = 0; j < len - i - 1; j++) {
                    if (people[j][1] > people[j + 1][1]) {
                        int tmp0 = people[j][0];
                        int tmp1 = people[j][1];
                        people[j][0] = people[j + 1][0];
                        people[j][1] = people[j + 1][1];
                        people[j + 1][0] = tmp0;
                        people[j + 1][1] = tmp1;
                    }
                }
            }
            List<List<Integer>> lst = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(people[i][0]);
                tmp.add(people[i][1]);
                if (lst.size() == 0) {
                    lst.add(tmp);
                } else {
                    int count = 0;
                    for (int j = 0; j < lst.size(); j++) {
                        if (tmp.get(0) <= lst.get(j).get(0)) count++;
                        if (count > tmp.get(1)) {
                            lst.add(j, tmp);
                            break;
                        }
                    }
                    if (lst.size() < i + 1) {
                        lst.add(tmp);
                    }
                }
            }
            int[][] res = new int[len][2];
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < 2; j++) {
                    res[i][j] = lst.get(i).get(j);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
