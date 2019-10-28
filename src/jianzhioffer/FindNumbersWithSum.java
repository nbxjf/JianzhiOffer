package jianzhioffer;

import java.util.ArrayList;

/**
 * Created by Jeff_xu on 2019/10/23.
 *
 * @author Jeff_xu
 */
public class FindNumbersWithSum {
    public static ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
        int index = 0;
        int end = array.length - 1;
        ArrayList<Integer> result = new ArrayList<>();
        while (index < end) {
            if (array[index] + array[end] == sum) {
                if (result.isEmpty()) {
                    result.add(array[index]);
                    result.add(array[end]);
                } else {
                    if (result.get(0) * result.get(1) > array[index] + array[end]) {
                        result.clear();
                        result.add(array[index]);
                        result.add(array[end]);
                    }
                }
                index++;
            } else if (array[index] + array[end] > sum) {
                end--;
            } else {
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        ArrayList<Integer> numbersWithSum = findNumbersWithSum(array, 21);
        System.out.println(numbersWithSum);
    }
}
