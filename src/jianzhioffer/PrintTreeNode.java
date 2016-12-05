package jianzhioffer;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/5 0005.
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class PrintTreeNode {
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null) return new ArrayList<>(); //输入为{}，返回[]
        ArrayList<TreeNode> list = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        list.add(root);
        while (list != null && list.size() != 0) {
            if (list.get(0).left != null) {
                list.add(list.get(0).left);
            }
            if (list.get(0).right != null) {
                list.add(list.get(0).right);
            }
            TreeNode del = list.remove(0);
            res.add(del.val);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode l2 = new TreeNode(4);
        TreeNode r2 = new TreeNode(5);

        root.left = l1;
        root.right = r1;
        l1.left = l2;
        l1.right = r2;

        ArrayList<Integer> res = PrintFromTopToBottom(root);
        while (res != null && res.size() != 0)
            System.out.println(res.remove(0));
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
