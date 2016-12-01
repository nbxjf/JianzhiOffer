package jianzhioffer;

/**
 * Created by Administrator on 2016/11/30 0030.
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class LinkedListReverse {
    public static ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        //记录当前节点的前一个节点
        ListNode prenode = null;
        //记录当前节点的后一个节点
        ListNode aftnode = head.next;
        //当前节点
        ListNode innode = head;
        //将头节点改为尾节点
        head.next = null;
        prenode = head;
        //指针指向下一个节点
        head = aftnode;

        while (head != null) {
            //1.记录该节点的后一个节点
            //2.将该节点的next指向前一个节点
            //3.将该节点的指针后移
            //4.修改该移动后的pre节点。
            aftnode = head.next;
            head.next = prenode;
            prenode = head;
            head = aftnode;
        }
        return prenode;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        first.next(new ListNode(2)).next(new ListNode(3)).next(new ListNode(4).next(new ListNode(5)));
        ListNode node = ReverseList(first);
        while (node != null) {
            System.out.println(node.val);
        }
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
