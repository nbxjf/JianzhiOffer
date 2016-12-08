package jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jeff_xu on 2016/12/6 0006.
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class MixKNumbers {

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if(input == null || input.length == 0 || k>input.length)
            return new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        ArrayList<Integer> list = GetLeastNumbers_Solution(arr, 4);
        while (list.size() != 0)
            System.out.println(list.remove(0));
    }
}
