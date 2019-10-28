package jianzhioffer;

/**
 * Created by Jeff_xu on 2019/10/23.
 * 给你一根长度为n的绳子，请把绳子剪成m段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * @author Jeff_xu
 */
public class CutRope {

    public static int cutRope(int target) {
        //int[] array = new int[30];
        //array[2] = 1;
        //array[3] = 2;
        //array[4] = 4;
        //array[5] = 6;
        //for (int i = 6; i < array.length; i++) {
        //    array[i] = 2 * array[i - 2] > 3 * array[i - 3] ? 2 * array[i - 2] : 3 * array[i - 3];
        //}
        //return array[target];
        if (target <= 2) {
            return 1;
        }
        int mutiply = 1;
        for (int i = 1; i <= target / 2; i++) {
            if (mutiply < i * (target - i)) {
                mutiply = i * (target - i);
            }
            if (target - i != 0) {
                int rest = i * cutRope(target - i);
                if (rest > mutiply) {
                    mutiply = rest;
                }
            }
        }
        return mutiply;
    }

    public static void main(String[] args) {
        System.out.println(cutRope(5));
    }
}
