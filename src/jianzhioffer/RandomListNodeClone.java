package jianzhioffer;

/**
 * Created by Jeff_xu on 2019/11/4.
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 *
 * @author Jeff_xu
 */
public class RandomListNodeClone {
    public static RandomListNode Clone(RandomListNode pHead) {
        if(pHead==null){
            return null;
        }
        RandomListNode node = pHead;
        //拷贝节点
        while(node!=null){
            RandomListNode cloneNode = new RandomListNode(node.label);
            cloneNode.next = node.next;
            node.next = cloneNode;
            node = cloneNode.next;
        }
        //拷贝特殊节点
        node = pHead;
        while(node!=null){
            if(node.random!=null){
                node.next.random = node.random.next;
            }
            node = node.next.next;
        }
        //拆分链表
        node = pHead;
        RandomListNode res = pHead.next;
        RandomListNode tmp;
        while(node.next!=null){
            tmp = node.next;
            node.next = tmp.next;
            node = tmp;
        }
        return res;
    }

    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public static void main(String[] args) {
        RandomListNode randomListNode1 = new RandomListNode(1);
        RandomListNode randomListNode2 = new RandomListNode(2);
        RandomListNode randomListNode3 = new RandomListNode(3);
        randomListNode1.next = randomListNode2;
        randomListNode1.random = randomListNode3;
        RandomListNode clone = Clone(randomListNode1);
        System.out.println(clone);
    }
}
