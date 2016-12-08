package jianzhioffer;

import java.util.Scanner;

/**
 * Created by Jeff_xu on 2016/11/30 0030.
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Number {
    public static int NumberOf1(int n) {
        String binary = Integer.toBinaryString(n);
        System.out.println(binary.length());
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            int x = binary.charAt(i);
            // ascaii码表49是1
            if (x == 49) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        while (in.hasNext()) {
            n = in.nextInt();
            int res = NumberOf1(n);
            System.out.println(res);
        }
    }
}
