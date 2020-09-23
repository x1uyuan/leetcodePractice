//字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数
//将返回左旋转两位得到的结果"cdefgab"。 
//
// 
//
// 示例 1： 
//
// 输入: s = "abcdefg", k = 2
//输出: "cdefgab"
// 
//
// 示例 2： 
//
// 输入: s = "lrloseumgh", k = 6
//输出: "umghlrlose"
// 
//
// 
//
// 限制： 
//
// 
// 1 <= k < s.length <= 10000 
// 
// Related Topics 字符串 
// 👍 45 👎 0


package leetcode.editor.cn;

/**
 * Java：左旋转字符串
 * date：2020-07-29 15:39:50
 **/
public class POffer58IIZuoXuanZhuanZiFuChuanLcof {
    public static void main(String[] args) {
        Solution solution = new POffer58IIZuoXuanZhuanZiFuChuanLcof().new Solution();
        // TO TEST
        System.out.println(solution.reverseLeftWords("abcdefg", 2));
        System.out.println(solution.reverseLeftWords("lrloseumgh", 6));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseLeftWords(String s, int n) {
            int len = s.length();
            int op = n % len;
            return s.substring(op) + s.substring(0, op);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
