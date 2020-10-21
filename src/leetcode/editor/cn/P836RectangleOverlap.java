//矩形以列表 [x1, y1, x2, y2] 的形式表示，其中 (x1, y1) 为左下角的坐标，(x2, y2) 是右上角的坐标。 
//
// 如果相交的面积为正，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠。 
//
// 给出两个矩形，判断它们是否重叠并返回结果。 
//
// 
//
// 示例 1： 
//
// 输入：rec1 = [0,0,2,2], rec2 = [1,1,3,3]
//输出：true
// 
//
// 示例 2： 
//
// 输入：rec1 = [0,0,1,1], rec2 = [1,0,2,1]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 两个矩形 rec1 和 rec2 都以含有四个整数的列表的形式给出。 
// 矩形中的所有坐标都处于 -10^9 和 10^9 之间。 
// x 轴默认指向右，y 轴默认指向上。 
// 你可以仅考虑矩形是正放的情况。 
// 
// Related Topics 数学 
// 👍 181 👎 0


package leetcode.editor.cn;

/**
 * Java：矩形重叠
 * date：2020-10-21 10:42:58
 **/
public class P836RectangleOverlap {
    public static void main(String[] args) {
        Solution solution = new P836RectangleOverlap().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
            if (rec1[0] == rec1[2] || rec1[1] == rec1[3] || rec2[0] == rec2[2] || rec2[1] == rec2[3]) return false;
            return !(rec1[2] <= rec2[0] || rec2[2] <= rec1[0] || rec1[3] <= rec2[1] || rec2[3] <= rec1[1]);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
