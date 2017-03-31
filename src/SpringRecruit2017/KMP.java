package SpringRecruit2017;

/**
 * Created by Jeff_xu on 2017/3/22.
 * KMP算法
 */

/*
 * 字符串匹配算法
 * 问题：
 *      给定两个字符串str1和str2，长度分别为len1和len2，判断str2是否在str1中出现，如果出现则返回出现的位置
 * 思想：
 *      常见的方法是按照str1的每一个字符开始一个一个循环匹配，不匹配就进入下一个字符开始匹配，效率低
 *      KMP是将
 * 解题思路：
 */
public class KMP {
    /**
     * 计算最大公共长度next[]
     *
     * @param b 子串
     * @return next[]
     */
    public int[] next(int[] b) {
        int[] next = new int[b.length];
        int j = 0, k = -1;
        next[0] = -1;
        while (j < b.length - 1) {
            if (k == -1 || b[j] == b[k]) {
                j++;
                k++;
                if (b[j] != b[k]) {
                    next[j] = k;
                } else {
                    next[j] = next[k];
                }
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public int KMP(int[] a, int[] b) {
        int[] next = next(b); //获取next数组
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (j == -1 || a[i] == b[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j >= b.length) {
            return i - b.length + 1;
        } else {
            return -1;
        }
    }
}
