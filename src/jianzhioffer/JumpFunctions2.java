package jianzhioffer;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/30 0030.
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFunctions2 {
    public static int JumpFloor2(int target) {
        /**
         * 1   1
         * 2   2
         * 3   4
         * 4   8
         * 5   16
         */
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        return 2 * JumpFloor2(target - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        while (in.hasNext()) {
            n = in.nextInt();
            int res = JumpFloor2(n);
            System.out.println(res);
        }
    }
}
