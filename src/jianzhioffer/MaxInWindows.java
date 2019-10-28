package jianzhioffer;

import java.util.ArrayList;

/**
 * Created by Jeff_xu on 2019/10/27.
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}，
 * {2,3,4,2,6,[2,5,1]}。
 *
 * @author Jeff_xu
 */
public class MaxInWindows {
    public static ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if (num == null || num.length == 0 || size < 1) {
            return result;
        }
        if (size > num.length) {
            return result;
        }
        for (int i = 0; i <= num.length - size; i++) {
            int window = num[i];
            for (int j = 0; j < size; j++) {
                if (num[i + j] > window) {
                    window = num[i + j];
                }
            }
            result.add(window);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[] {2, 3, 4, 2, 6, 2, 5, 1};
        ArrayList<Integer> arrayList = maxInWindows(array, 13);
        System.out.println(arrayList.toString());
    }
}
