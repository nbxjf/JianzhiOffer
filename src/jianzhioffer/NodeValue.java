package jianzhioffer;

import java.util.Stack;

/**
 * Created by Administrator on 2016/11/30 0030.
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class NodeValue {
    public static ListNode FindKthToTail(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode node = null;
        if (stack.size() < k) return null;
        for (int i = 0; i < k; i++) {
            node = stack.pop();
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        first.next(new ListNode(2)).next(new ListNode(3)).next(new ListNode(4).next(new ListNode(5)));
        ListNode node = FindKthToTail(first, 3);
        System.out.println(node.val);
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode next(ListNode node) {
            return this.next = node;
        }
    }
}
