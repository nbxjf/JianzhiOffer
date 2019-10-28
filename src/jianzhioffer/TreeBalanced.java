package jianzhioffer;

/**
 * Created by Jeff_xu on 2019/10/22.
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 *
 * 平衡二叉树：它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树
 *
 * @author Jeff_xu
 */
public class TreeBalanced {
    public boolean isBalancedTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isBalancedTree(root.left) &&
            isBalancedTree(root.right) &&
            Math.abs(treeDepth(root.left) - treeDepth(root.right)) <= 1;
    }

    public static int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = 1;
        int right = 1;
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left != null) {
            left += treeDepth(root.left);
        }
        if (root.right != null) {
            right += treeDepth(root.right);
        }
        return left > right ? left : right;
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
