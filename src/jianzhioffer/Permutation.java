package jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Jeff_xu on 2019/10/27.
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 *
 * @author Jeff_xu
 */
public class Permutation {

    public static ArrayList<String> Permutation(String str) {
        Set<String> result = new TreeSet<>();
        if (str == null || str.length() <= 0) {
            return new ArrayList<>(result);
        }
        if (str.length() == 1) {
            result.add(str);
            return new ArrayList<>(result);
        }
        char[] array = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
        }
        Arrays.sort(array);
        for (int first = 0; first < array.length; first++) {
            StringBuilder subStr = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                if (i != first) {
                    subStr.append(array[i]);
                }
            }
            ArrayList<String> permutation = Permutation(subStr.toString());
            if (permutation != null && permutation.size() > 0) {
                int finalFirst = first;
                permutation.forEach(o -> result.add(array[finalFirst] + o));
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        String str = "aab";
        ArrayList<String> permutation = Permutation(str);
        for (String s : permutation) {
            System.out.println(s);
        }
    }
}
