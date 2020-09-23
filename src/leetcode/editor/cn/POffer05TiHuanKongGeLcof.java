//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// 👍 30 👎 0


package leetcode.editor.cn;

/**
 * Java：替换空格
 * date：2020-07-22 17:02:03
 **/
public class POffer05TiHuanKongGeLcof {
    public static void main(String[] args) {
        Solution solution = new POffer05TiHuanKongGeLcof().new Solution();
        // TO TEST
        System.out.println(solution.replaceSpace("We are happy."));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String replaceSpace(String s) {
            return s.replace(" ", "%20");
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
