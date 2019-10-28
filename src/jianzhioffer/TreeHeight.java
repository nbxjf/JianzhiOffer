package jianzhioffer;

/**
 * Created by Jeff_xu on 2016/12/14 0014.
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class TreeHeight {
    public static int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = 1;
        int right = 1;
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left != null) {
            left += TreeDepth(root.left);
        }
        if (root.right != null) {
            right += TreeDepth(root.right);
        }
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(6);
        TreeNode l2 = new TreeNode(1);
        TreeNode r2 = new TreeNode(3);
        TreeNode l3 = new TreeNode(0);
        TreeNode r3 = new TreeNode(0);

        root.left = l1;
        root.right = r1;
        l1.left = l2;
        l1.right = r2;
        l2.left = l3;
        r1.right = r3;

        System.out.println(TreeDepth(root));
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
