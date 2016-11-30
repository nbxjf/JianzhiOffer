package jianzhioffer;

/**
 * Created by Administrator on 2016/11/30 0030.
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class OldAndEvenSort {
    public static void reOrderArray(int[] array) {
        int length = array.length;
        int lindex = 0, rindex = length - 1;
        int[] newarr = new int[length];
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 != 0) {
                newarr[lindex] = array[i];
                lindex++;
            }
        }
        for (int j = length - 1; j >= 0; j--) {
            if (array[j] % 2 == 0) {
                newarr[rindex] = array[j];
                rindex--;
            }
        }
        for (int i = 0; i < length; i++) {
            array[i] = newarr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reOrderArray(arr);
    }
}
