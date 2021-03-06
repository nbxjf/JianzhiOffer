package jianzhioffer;

/**
 * Created by Jeff_xu on 2016/11/30 0030.
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JunpFunctions {

    public static int JumpFloor(int target) {
        int[] jump = new int[1000];
        jump[0] = 1;
        jump[1] = 2;
        if (target == 1) return 1;
        if (target == 2) return 2;
        for (int i = 2; i < jump.length; i++) {
            jump[i] = jump[i - 1] + jump[i - 2];
        }
        return jump[target - 1];
    }

    public static void main(String[] args) {
        int res = JumpFloor(5);
        System.out.println(res);
    }

}
