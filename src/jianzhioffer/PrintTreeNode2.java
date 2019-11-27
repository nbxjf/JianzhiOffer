package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeff_xu on 2019/11/27.
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 *
 * @author Jeff_xu
 */
public class PrintTreeNode2 {

    static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot == null) {
            return new ArrayList<>();
        }
        List<TreeNode> nodeList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        nodeList.add(pRoot);
        nodeList.add(null);
        ArrayList<Integer> resultItem = new ArrayList<>();
        while (!nodeList.isEmpty()) {
            if (nodeList.get(0) == null) {
                if (nodeList.size() > 1) {
                    nodeList.add(null);
                }
                if (!resultItem.isEmpty()) {
                    result.add(resultItem);
                    resultItem = new ArrayList<>();
                }
            } else {
                if (nodeList.get(0).left != null) {
                    nodeList.add(nodeList.get(0).left);
                }
                if (nodeList.get(0).right != null) {
                    nodeList.add(nodeList.get(0).right);
                }
                resultItem.add(nodeList.get(0).val);
            }
            nodeList.remove(0);
        }
        return result;
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
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode l2 = new TreeNode(4);
        TreeNode r2 = new TreeNode(5);

        root.left = l1;
        root.right = r1;
        l1.left = l2;
        l1.right = r2;

        ArrayList<ArrayList<Integer>> print = Print(root);
        for (ArrayList<Integer> arrayList : print) {
            for (Integer integer : arrayList) {
                System.out.print(integer);
                System.out.print("");
            }
            System.out.println();
        }
    }
}
