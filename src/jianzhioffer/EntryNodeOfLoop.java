package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeff_xu on 2019/11/27.
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 *
 * @author Jeff_xu
 */
public class EntryNodeOfLoop {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        List<ListNode> listNodes = new ArrayList<>();
        listNodes.add(pHead);
        while (pHead.next != null) {
            if (listNodes.contains(pHead.next)) {
                return pHead.next;
            }
            pHead = pHead.next;
            listNodes.add(pHead);
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
