package jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jeff_xu on 2019/11/27.
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 *
 * 二叉树的序列化是指：把一棵二叉树按照某种遍历方式的结果以某种格式保存为字符串，从而使得内存中建立起来的二叉树可以持久保存。
 * 序列化可以基于先序、中序、后序、层序的二叉树遍历方式来进行修改，序列化的结果是一个字符串，序列化时通过 某种符号表示空节点（#），
 * 以 ！表示一个结点值的结束（value!）。
 *
 * 二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树。
 *
 * @author Jeff_xu
 */
public class SerializeTreeNode {
    static String Serialize(TreeNode root) {
        if (root == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        List<TreeNode> zhongxu = new ArrayList<>();
        List<TreeNode> qianxu = new ArrayList<>();
        zhongxubianli(root, zhongxu);
        qianxubianli(root, qianxu);
        for (TreeNode treeNode : zhongxu) {
            result.append(treeNode.val).append("-");
        }
        result.append("$");
        for (TreeNode treeNode : qianxu) {
            result.append(treeNode.val).append("-");
        }
        return result.toString();
    }

    static TreeNode Deserialize(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\$");
        String[] split1 = split[0].split("-");
        String[] split2 = split[1].split("-");
        return restoreTreeNode(split1, split2);
    }

    static TreeNode restoreTreeNode(String[] zhongxu, String[] qianxu) {
        if (qianxu == null || qianxu.length == 0) {
            return null;
        }
        String root = qianxu[0];
        TreeNode treeNode = new TreeNode(Integer.parseInt(root));
        int index = 0;
        for (String item : zhongxu) {
            if (item.equals(root)) {
                break;
            } else {
                index++;
            }
        }
        // 左子树有节点
        if (index > 0) {
            treeNode.left = restoreTreeNode(Arrays.copyOfRange(zhongxu, 0, index), Arrays.copyOfRange(qianxu, 1, index + 1));
        }
        // 右子树有节点
        if (index < zhongxu.length - 1) {
            treeNode.right = restoreTreeNode(Arrays.copyOfRange(zhongxu, index + 1, zhongxu.length),
                Arrays.copyOfRange(qianxu, index + 1, qianxu.length));
        }
        return treeNode;
    }

    static void zhongxubianli(TreeNode node, List<TreeNode> zhong) {
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

    static void qianxubianli(TreeNode node, List<TreeNode> qian) {
        if (node == null) {
            return;
        }
        qian.add(node);
        if (node.left != null) {
            qianxubianli(node.left, qian);
        }
        if (node.right != null) {
            qianxubianli(node.right, qian);
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
        String serialize = Serialize(treeNode5);

        TreeNode deserialize = Deserialize(serialize);
        System.out.println(serialize);
        //String[] split = Serialize.split("\\$");
        //
        //String[] split1 = split[0].split("-");
        //String[] split2 = split[1].split("-");
        //System.out.println(split1);
        //System.out.println(split2);

    }
}
