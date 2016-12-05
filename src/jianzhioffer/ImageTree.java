package jianzhioffer;

/**
 * Created by Administrator on 2016/12/5 0005.
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 二叉树的镜像定义：源二叉树
 * 8
 * /  \
 * 6   10
 * / \  / \
 * 5  7 9 11
 * 镜像二叉树
 * 8
 * /  \
 * 10   6
 * / \  / \
 * 11 9 7  5
 */
public class ImageTree {

    public static void Mirror(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            Mirror(root.left);
            Mirror(root.right);
        }

    }

    public static void main(String[] args) {
        ImageTree d = new ImageTree();
        TreeNode root2 = d.new TreeNode(2);
        TreeNode l1 = d.new TreeNode(4);
        TreeNode r1 = d.new TreeNode(5);
        TreeNode r2 = d.new TreeNode(7);

        root2.left = l1;
        root2.right = r1;
        r1.right = r2;
        Mirror(root2);
    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }
}
