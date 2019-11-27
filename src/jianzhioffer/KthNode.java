package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeff_xu on 2019/11/27.
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 *
 * @author Jeff_xu
 */
public class KthNode {

    static TreeNode KthNode(TreeNode pRoot, int k) {
        if(k <= 0){
            return null;
        }
        List<TreeNode> result = new ArrayList<>();
        zhongxubianli(pRoot, result);
        if(result.isEmpty() || k > result.size()){
            return null;
        }
        return result.get(k - 1);
    }

    static void zhongxubianli(TreeNode node, List<TreeNode> result) {
        if(node == null){
            return;
        }
        if (node.left != null) {
            zhongxubianli(node.left, result);
        }
        result.add(node);
        if (node.right != null) {
            zhongxubianli(node.right, result);
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
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode8 = new TreeNode(8);
        treeNode5.left = treeNode3;
        treeNode5.right = treeNode7;
        treeNode3.left = treeNode2;
        treeNode3.right = treeNode4;
        treeNode7.left = treeNode6;
        treeNode7.right = treeNode8;
        TreeNode treeNode = KthNode(treeNode5, 4);
        System.out.println(treeNode);
    }
}
