package jianzhioffer;

import java.util.Stack;

/**
 * Created by Administrator on 2016/12/5 0005.
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 */
public class JudgeIsPopOrder {
    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || popA == null || popA.length == 0 || pushA.length == 0 || pushA.length != popA.length) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int pushIndex = 0;
        int popIndex = 0;
        // 如果还有出栈元素要处理
        while (popIndex < popA.length) {
            // 入栈元素还未全部入栈的条件下，如果栈为空，或者栈顶的元素不与当前处理的相等，则一直进行栈操作，
            // 直到入栈元素全部入栈或者找到了一个与当出栈元素相等的元素
            while (pushIndex < pushA.length && (stack.isEmpty() || stack.peek() != popA[popIndex])) {
                stack.push(pushA[pushIndex]);
                pushIndex++;
            }
            if (stack.peek() == popA[popIndex]) {
                stack.pop();
                popIndex++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA = {4, 5, 3, 2, 1};
        Boolean res = IsPopOrder(pushA, popA);
        System.out.println(res);
    }
}
