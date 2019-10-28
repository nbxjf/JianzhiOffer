package jianzhioffer;

/**
 * Created by Jeff_xu on 2019/10/23.
 * 输入两个链表，找出它们的第一个公共结点。
 *
 * @author Jeff_xu
 */
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        if (pHead1.equals(pHead2)) {
            return pHead1;
        }
        while (pHead1 != null) {
            ListNode pHead3 = pHead2;
            while (pHead3 != null) {
                if (pHead1.equals(pHead3)) {
                    return pHead1;
                }
                pHead3 = pHead3.next;
            }
            pHead1 = pHead1.next;
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
