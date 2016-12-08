package jianzhioffer;

/**
 * Created by Jeff_xu on 2016/12/6 0006.
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 *
 * 1.二叉树中序遍历的结果与链表的顺序一致，所以可以采用中序遍历的方法来修改二叉树的指针
 * 2.该题的关键是，如何将左子树的最大值与右子树的最小值通过根root连接起来，比如题目的8和12，这也是细节部分
 * 3.写递归程序最重要的是弄明白递归进入的条件、递归返回的状态，如果递归进入时改变了环境，返回时应当恢复环境，就像栈的操作一样
 * 4.使用指针变量时，要记得初始化
 * 5.该算法没有返回链表头，而是返回了root。
 */
public class TreeToLinkedList {

    public static TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode lastNode = null;
        TreeNode headNode = ConvertNode(pRootOfTree, lastNode);
        while (headNode != null && headNode.left != null) {
            headNode = headNode.left;
        }
        return headNode;
    }

    public static TreeNode ConvertNode(TreeNode rootTree, TreeNode lastNode) {
        if (rootTree == null) {
            return null;
        }
        if (rootTree.left != null) {
            lastNode = ConvertNode(rootTree.left, lastNode);
        }
        rootTree.left = lastNode;
        if (lastNode != null) {
            lastNode.right = rootTree;
        }
        lastNode = rootTree;
        if (rootTree.right != null) {
            lastNode = ConvertNode(rootTree.right, lastNode);
        }
        return lastNode;
    }

    public static void main(String[] agrs) {
        TreeNode root = new TreeNode(4);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(6);
        TreeNode l2 = new TreeNode(1);
        TreeNode r2 = new TreeNode(3);

        root.left = l1;
        root.right = r1;
        l1.left = l2;
        l1.right = r2;

        Convert(root);
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
