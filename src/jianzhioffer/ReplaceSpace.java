package jianzhioffer;

import java.util.*;

/**
 * Created by Administrator on 2016/11/29 0029.
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        String tran = str.toString();
        String res = tran.replaceAll(" ", "%20");
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        while (in.hasNext()) {
            s = in.next();
            String res = replaceSpace(new StringBuffer(s));
            System.out.println(res);
        }
    }
}
