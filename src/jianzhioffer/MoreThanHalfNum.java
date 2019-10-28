package jianzhioffer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jeff_xu on 2019/10/27.
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 * 如果不存在则输出0。
 *
 * @author Jeff_xu
 */
public class MoreThanHalfNum {
    public static int MoreThanHalfNum_Solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : array) {
            map.merge(item, 1, (a, b) -> a + b);
        }
        final int[] result = {0};
        map.forEach((key, value) -> {
            if (value > array.length / 2) {
                result[0] = key;
            }
        });
        return result[0];
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
}
