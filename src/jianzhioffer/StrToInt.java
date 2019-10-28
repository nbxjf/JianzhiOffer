package jianzhioffer;

/**
 * Created by Jeff_xu on 2019/10/27.
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * 输入描述:
 * 输入一个字符串,包括数字字母符号,可以为空
 * 输出描述:
 * 如果是合法的数值表达则返回该数字，否则返回0
 * 输入
 * +2147483647
 * 1a33
 * 输出
 * 2147483647
 * 0
 *
 * @author Jeff_xu
 */
public class StrToInt {

    public static int StrToInt(String str) {
        //if (str == null || "".equals(str)) {
        //    return 0;
        //}
        //for (int i = 0; i < str.length(); i++) {
        //    char c = str.charAt(i);
        //    if (c == 43 && i != str.length() - 1) {
        //
        //    } else if (c == 45 && i != str.length() - 1) {
        //
        //    } else if (c >= 48 && c <= 57) {
        //
        //    } else {
        //        return 0;
        //    }
        //}
        int result;
        try {
            result = Integer.parseInt(str);
        } catch (Exception e) {
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int i = StrToInt("-2147483649");
        System.out.println(i);
    }
}
