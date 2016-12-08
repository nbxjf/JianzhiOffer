package jianzhioffer;

/**
 * Created by Jeff_xu on 2016/12/8.
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Add {
    public static int Add(int num1, int num2) {
//        return Math.addExact(num1, num2); //Java1.8 新特性
        if (num2 > 0) {
            for (int i = 0; i < num2; i++) {
                num1++;
            }
        } else {
            for (int i = 0; i < -num2; i++) {
                num1--;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        System.out.println(Add(5, -155));
    }
}
