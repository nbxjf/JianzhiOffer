package jianzhioffer;


/**
 * Created by Administrator on 2016/11/30 0030.
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class LinkedListReverse {
    public static ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = ReverseList(head.next);

        return node;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        first.next(new ListNode(2)).next(new ListNode(3)).next(new ListNode(4).next(new ListNode(5)));
        ReverseList(first);
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
