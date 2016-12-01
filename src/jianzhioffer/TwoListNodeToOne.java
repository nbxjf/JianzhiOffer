package jianzhioffer;

/**
 * Created by Administrator on 2016/12/1 0001.
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class TwoListNodeToOne {
    public static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode node;
        if (list1.val > list2.val) {
            node = list2;
            node.next = Merge(list1, list2.next);
        } else {
            node = list1;
            node.next = Merge(list1.next, list2);
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        first.next(new ListNode(2)).next(new ListNode(3)).next(new ListNode(4).next(new ListNode(5)));
        ListNode second = new ListNode(4);
        second.next(new ListNode(6)).next(new ListNode(7)).next(new ListNode(8).next(new ListNode(9)));
        ListNode res = Merge(first, second);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode next(ListNode node) {
            return this.next = node;
        }
    }
}
