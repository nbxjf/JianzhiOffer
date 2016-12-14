package jianzhioffer;

/**
 * Created by Jeff_xu on 2016/12/14 0014.
 * 统计一个数字在排序数组中出现的次数。
 */
public class ConutTimesInOrderArray {
    public static int GetNumberOfK(int[] array, int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == k){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 5};
        System.out.println(GetNumberOfK(arr, 3));
    }
}
