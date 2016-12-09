package jianzhioffer;

/**
 * Created by Jeff_xu on 2016/12/6 0006.
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
 */
public class Count1Times {
    public static int NumberOf1Between1AndN_Solution(int n) {
        int num = n;
        int count = 0;// 计算数字中含有1的数字个数。
        int strLen = 0;//每个数字的长度
        for (int i = 0; i <= num; i++) {
            String str = String.valueOf(i);
            strLen = str.length();
            for (int j = 0; j < strLen; j++) {
                if (str.charAt(j) == '1') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 133;
        int count = NumberOf1Between1AndN_Solution(n);
        System.out.println(count);
    }
}
