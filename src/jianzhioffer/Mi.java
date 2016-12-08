package jianzhioffer;

import java.util.Scanner;

/**
 * Created by Jeff_xu on 2016/11/30 0030.
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Mi {
    public static double Power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base;
        int exponent;
        while (in.hasNext()) {
            base = in.nextDouble();
            exponent = in.nextInt();
            double res = Power(base, exponent);
            System.out.println(res);
        }
    }
}
