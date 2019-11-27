package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeff_xu on 2019/10/23.
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 *
 * @author Jeff_xu
 */
public class TreeLinkNodeGetNext {

    public static TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        TreeLinkNode root = traceFirst(pNode);
        List<TreeLinkNode> zhong = new ArrayList<>();
        zhongxubianli(root, zhong);
        for (int i = 0; i < zhong.size(); i++) {
            if (pNode == zhong.get(i)) {
                return i == zhong.size() - 1 ? null : zhong.get(i + 1);
            }
        }
        return null;
    }

    private static void zhongxubianli(TreeLinkNode node, List<TreeLinkNode> zhong) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            zhongxubianli(node.left, zhong);
        }
        zhong.add(node);
        if (node.right != null) {
            zhongxubianli(node.right, zhong);
        }
    }

    private static TreeLinkNode traceFirst(TreeLinkNode pNode) {
        if (pNode.next == null) {
            return pNode;
        } else {
            return traceFirst(pNode.next);
        }
    }

    static class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeLinkNode p8 = new TreeLinkNode(8);
        TreeLinkNode p6 = new TreeLinkNode(6);
        TreeLinkNode p10 = new TreeLinkNode(10);
        TreeLinkNode p5 = new TreeLinkNode(5);
        TreeLinkNode p7 = new TreeLinkNode(7);
        TreeLinkNode p9 = new TreeLinkNode(9);
        TreeLinkNode p11 = new TreeLinkNode(11);
        p8.left = p6;
        p8.right = p10;
        p6.left = p5;
        p6.right = p7;
        p10.left = p9;
        p10.right = p11;
        p5.next = p6;
        p7.next = p6;
        p6.next = p8;
        p9.next = p10;
        p11.next = p10;
        p10.next = p8;

        TreeLinkNode treeLinkNode = GetNext(p11);

        System.out.println(treeLinkNode != null ? treeLinkNode.val : null);
    }
}
