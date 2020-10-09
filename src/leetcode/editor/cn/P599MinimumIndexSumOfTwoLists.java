//假设Andy和Doris想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。 
//
// 你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设总是存在一个答案。 
//
// 示例 1: 
//
// 输入:
//["Shogun", "Tapioca Express", "Burger King", "KFC"]
//["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
//输出: ["Shogun"]
//解释: 他们唯一共同喜爱的餐厅是“Shogun”。
// 
//
// 示例 2: 
//
// 输入:
//["Shogun", "Tapioca Express", "Burger King", "KFC"]
//["KFC", "Shogun", "Burger King"]
//输出: ["Shogun"]
//解释: 他们共同喜爱且具有最小索引和的餐厅是“Shogun”，它有最小的索引和1(0+1)。
// 
//
// 提示: 
//
// 
// 两个列表的长度范围都在 [1, 1000]内。 
// 两个列表中的字符串的长度将在[1，30]的范围内。 
// 下标从0开始，到列表的长度减1。 
// 两个列表都没有重复的元素。 
// 
// Related Topics 哈希表 
// 👍 84 👎 0


package leetcode.editor.cn;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Java：两个列表的最小索引总和
 * date：2020-10-09 15:55:39
 **/
public class P599MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        Solution solution = new P599MinimumIndexSumOfTwoLists().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            Map<String, Integer> map1 = new HashMap<>();
            Map<String, Integer> map2 = new HashMap<>();
            List<String> lst = new ArrayList<>();
            List<String> res = new ArrayList<>();
            for (int i = 0; i < list1.length; i++) {
                map1.put(list1[i], i);
            }
            for (int i = 0; i < list2.length; i++) {
                map2.put(list2[i], i);
            }
            for (String s : map1.keySet()) {
                if (map2.containsKey(s)) lst.add(s);
            }
            String s = lst.get(0);
            int index = map1.get(s) + map2.get(s);
            res.add(s);
            for (int i = 1; i < lst.size(); i++) {
                String tmp = lst.get(i);
                int tmp1 = map1.get(tmp) + map2.get(tmp);
                if (tmp1 == index) res.add(tmp);
                else if (tmp1 < index) {
                    res.clear();
                    res.add(tmp);
                    index = tmp1;
                }
            }
            String[] res1 = new String[res.size()];
            res.toArray(res1);
            return res1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
