package jianzhioffer;

import java.util.ArrayList;

/**
 * Created by Jeff_xu on 2016/12/2 0002.
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class ClockwisePrint {
    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int startX = 0, startY = 0;
        int endX = matrix[0].length - 1; //列号
        int endY = matrix.length - 1; //行号
        while (startX <= endX && startY <= endY) {
            for (int i = startX; i <= endX; i++) {
                list.add(matrix[startY][i]);
            }
            for (int j = startY + 1; j <= endY; j++) {
                list.add(matrix[j][endX]);
            }
            if (endY - startY > 0) {
                for (int i = endX - 1; i >= startX; i--) {
                    list.add(matrix[endY][i]);
                }
            }
            if (endX - startX > 0) {
                for (int j = endY - 1; j > startX; j--) {
                    list.add(matrix[j][startX]);
                }
            }
            startX++;
            startY++;
            endX--;
            endY--;
        }
//        if (endX == startX)
//            list.add(matrix[endX][endX]);
        return list;
    }

    public static void main(String[] args) {
//        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] arr = {{1}, {2}, {3}, {4}, {5}};
//        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        ArrayList<Integer> res = printMatrix(arr);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}
