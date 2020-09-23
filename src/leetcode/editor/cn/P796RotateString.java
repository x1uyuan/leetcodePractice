//给定两个字符串, A 和 B。 
//
// A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后
//，A 能变成B，那么返回True。 
//
// 
//示例 1:
//输入: A = 'abcde', B = 'cdeab'
//输出: true
//
//示例 2:
//输入: A = 'abcde', B = 'abced'
//输出: false 
//
// 注意： 
//
// 
// A 和 B 长度不超过 100。 
// 
// 👍 96 👎 0


package leetcode.editor.cn;

/**
 * Java：旋转字符串
 * date：2020-09-14 15:40:11
 **/
public class P796RotateString {
    public static void main(String[] args) {
        Solution solution = new P796RotateString().new Solution();
        // TO TEST
        System.out.println(solution.rotateString("abcde", "cdeab"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean rotateString(String A, String B) {
            int len1 = A.length();
            int len2 = B.length();
            if (len1 != len2) return false;
            if (A.equals(B)) return true;
            String tmp = A;
            for (int i = 0; i < len1; i++) {
                if (rotate(tmp).equals(B)) return true;
                tmp = rotate(tmp);
            }
            return false;
        }

        private String rotate(String s) {
            String fp = s.substring(0, 1);
            String sp = s.substring(1);
            return sp + fp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
