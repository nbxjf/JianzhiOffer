package jianzhioffer;

/**
 * Created by Administrator on 2016/12/1 0001.
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class SubStructer {

    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        boolean result = false;
        if (root1.val == root2.val) {
            result = true;
        }
        if (result) {
            result = dosTreeHasSub(root1, root2);
        }
        if (!result)
            result = HasSubtree(root1.left, root2);

        if (!result)
            result = HasSubtree(root1.right, root2);
        return result;
    }

    public static boolean dosTreeHasSub(TreeNode root, TreeNode root2) {

        if (root2 == null)
            return true;

        if (root == null)
            return false;

        if (root.val != root2.val)
            return false;

        return dosTreeHasSub(root.left, root2.left) && dosTreeHasSub(root.right, root2.right);
    }

    public static void main(String[] args) {
        SubStructer d = new SubStructer();
        TreeNode root = d.new TreeNode(0);
        TreeNode left1 = d.new TreeNode(1);
        TreeNode r1 = d.new TreeNode(2);
        TreeNode left2 = d.new TreeNode(3);
        TreeNode r2 = d.new TreeNode(4);

        TreeNode root2 = d.new TreeNode(1);
        TreeNode l1 = d.new TreeNode(3);
        TreeNode rr2 = d.new TreeNode(4);

        root.left = left1;
        root.right = r1;
        left1.left = left2;
        left1.right = r2;

        root2.left = l1;
        root2.right = rr2;
        boolean res = HasSubtree(root, root2);
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
