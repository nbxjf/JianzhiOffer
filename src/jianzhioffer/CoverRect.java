package jianzhioffer;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/30 0030.
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class CoverRect {
    public static int RectCover(int target) {
        if (target == 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[target - 1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        while (in.hasNext()) {
            n = in.nextInt();
            int res = RectCover(n);
            System.out.println(res);
        }
    }
}
