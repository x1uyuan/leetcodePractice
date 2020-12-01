//三合一。描述如何只用一个数组来实现三个栈。 
//
// 你应该实现push(stackNum, value)、pop(stackNum)、isEmpty(stackNum)、peek(stackNum)方法。s
//tackNum表示栈下标，value表示压入的值。 
//
// 构造函数会传入一个stackSize参数，代表每个栈的大小。 
//
// 示例1: 
//
//  输入：
//["TripleInOne", "push", "push", "pop", "pop", "pop", "isEmpty"]
//[[1], [0, 1], [0, 2], [0], [0], [0], [0]]
// 输出：
//[null, null, null, 1, -1, -1, true]
//说明：当栈为空时`pop, peek`返回-1，当栈满时`push`不压入元素。
// 
//
// 示例2: 
//
//  输入：
//["TripleInOne", "push", "push", "push", "pop", "pop", "pop", "peek"]
//[[2], [0, 1], [0, 2], [0, 3], [0], [0], [0], [0]]
// 输出：
//[null, null, null, null, 2, 1, -1, -1]
// 
// Related Topics 设计 
// 👍 19 👎 0


package leetcode.editor.cn;

/**
 * Java：三合一
 * date：2020-11-19 13:31:56
 **/
public class P0301ThreeInOneLcci {
    public static void main(String[] args) {
//        Solution solution = new P0301ThreeInOneLcci().new Solution();
        // TO TEST
        TripleInOne tripleInOne = new TripleInOne(18);
        tripleInOne.peek(1);
        tripleInOne.pop(2);
        tripleInOne.isEmpty(1);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class TripleInOne {
        private int[] data;
        private int size;
        private int[] index = new int[3];

        public TripleInOne(int stackSize) {
            size = stackSize;
            data = new int[3 * stackSize];
            index[1] = stackSize;
            index[2] = 2 * stackSize;
        }

        public void push(int stackNum, int value) {
            if (index[stackNum] < (stackNum + 1) * size) data[index[stackNum]++] = value;
        }

        public int pop(int stackNum) {
            if (index[stackNum] > stackNum * size) return data[--index[stackNum]];
            else return -1;
        }

        public int peek(int stackNum) {
            if (index[stackNum] > stackNum * size) return data[index[stackNum] - 1];
            else return -1;
        }

        public boolean isEmpty(int stackNum) {
            return index[stackNum] == stackNum * size;
        }
    }

/**
 * Your TripleInOne object will be instantiated and called as such:
 * TripleInOne obj = new TripleInOne(stackSize);
 * obj.push(stackNum,value);
 * int param_2 = obj.pop(stackNum);
 * int param_3 = obj.peek(stackNum);
 * boolean param_4 = obj.isEmpty(stackNum);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
