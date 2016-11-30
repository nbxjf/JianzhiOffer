package jianzhioffer;

import java.util.*;

/**
 * Created by Administrator on 2016/11/30 0030.
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class TwoStacks {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    // 将当前栈中的元素全部压入stack2中，取出最后一个元素，再将stack2中的元素压回stack1中
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (stack1.size() != 1) {
            stack2.push(stack1.pop());
        }
        int val = stack1.pop();
        while (stack2.size() != 0) {
            stack1.push(stack2.pop());
        }
        return val;
    }

    public static void main(String args) {

    }
}
