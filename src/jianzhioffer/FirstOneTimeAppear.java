package jianzhioffer;

/**
 * Created by Jeff_xu on 2016/12/14 0014.
 * 在一个字符串(1<=字符串长度<=10000，全部由大写字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */
public class FirstOneTimeAppear {
    public static int FirstNotRepeatingChar(String str) {
        if (str.length() == 0) return -1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j)
                    break;
                if (j == str.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "";
        System.out.println(FirstNotRepeatingChar(s));
    }
}
