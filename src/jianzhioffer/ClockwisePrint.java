package jianzhioffer;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/2 0002.
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class ClockwisePrint {
    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        for (; j < matrix.length; j++) {
            System.out.println(matrix[i][j]);
        }
        for (; i < matrix.length; i++) {
            System.out.println(matrix[i][j]);
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        ArrayList<Integer> res = printMatrix(arr);
    }
}
