package jianzhioffer;

import java.util.*;

/**
 * Created by Jeff_xu on 2016/11/29 0029.
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
public class LinkedListPrint {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>(); //通过栈逆序获取value
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        first.next(new ListNode(2)).next(new ListNode(3)).next(new ListNode(4)).next(new ListNode(5));
        ArrayList<Integer> list = printListFromTailToHead(first);
        for (int i = 0;i < list.size();i ++){
            System.out.println(list.get(i));
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


