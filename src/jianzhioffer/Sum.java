package jianzhioffer;

/**
 * Created by Jeff_xu on 2016/12/8.
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Sum {
    public static int Sum_Solution(int n) {
        int sum = (int) (Math.pow(n, 2) + n);
        return sum >> 1;
//        if(n == 0)
//            return 0;
//        else
//            return n+Sum_Solution(n-1);
    }

    public static void main(String[] args) {
        int n = Sum_Solution(100);
        System.out.println(n);
    }
}
