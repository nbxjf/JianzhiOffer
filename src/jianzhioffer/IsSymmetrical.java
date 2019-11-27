package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeff_xu on 2019/11/27.
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 *
 * @author Jeff_xu
 */
public class IsSymmetrical {

    static boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        List<Integer> zhong = new ArrayList<>();
        zhongxubianli(pRoot, zhong);
        int start = 0, end = zhong.size() - 1;
        while (start <= end) {
            if (zhong.get(start).intValue() != zhong.get(end).intValue()) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    static void zhongxubianli(TreeNode node, List<Integer> zhong) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            zhongxubianli(node.left, zhong);
        } else {
            if (node.right != null) {
                zhong.add(-1);
            }
        }
        zhong.add(node.val);
        if (node.right != null) {
            zhongxubianli(node.right, zhong);
        } else {
            if (node.left != null) {
                zhong.add(-1);
            }
        }
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode l1 = new TreeNode(5);
        TreeNode r1 = new TreeNode(5);
        TreeNode l2 = new TreeNode(5);
        TreeNode r2 = new TreeNode(5);
        TreeNode l3 = new TreeNode(5);
        TreeNode r3 = new TreeNode(5);

        root.left = l1;
        root.right = r1;
        l1.left = l2;
        r1.right = r2;
        l2.left = l3;
        r2.right = r3;
        System.out.println(isSymmetrical(root));
    }
}
