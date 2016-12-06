package jianzhioffer;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/12/5 0005.
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class JudgeIsLRD {
    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 1) return true;
        if (sequence == null || sequence.length == 0) return false;
        int flag = sequence[sequence.length - 1]; //取最后一个元素
        int middle = 0;
        for (int i = 0; i <= sequence.length - 1; i++) {
            if (sequence[i] >= flag) {
                middle = i;
                break;
            }
        }
        if (sequence.length - 2 < middle) return true;
        for (int j = sequence.length - 2; j >= middle; j--) {
            if (sequence[j] < flag)
                return false;
        }
        Boolean res1;
        Boolean res2;
        if (middle == 0) {
            res1 = true;
        } else {
            res1 = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, middle));
        }
        if (middle == sequence.length - 1) {
            res2 = true;
        } else {
            res2 = VerifySquenceOfBST(Arrays.copyOfRange(sequence, middle, sequence.length - 1));
        }
        return res1 && res2;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 3, 2, 5, 7, 6, 4};
//        int[] arr = {5, 4, 3, 2, 1};
        int[] arr = {};
        Boolean res = VerifySquenceOfBST(arr);
        System.out.println(res);
    }
}
