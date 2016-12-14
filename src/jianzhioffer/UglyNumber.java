package jianzhioffer;

/**
 * Created by Jeff_xu on 2016/12/10 0010.
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class UglyNumber {
    public static int GetUglyNumber_Solution(int index) {
        if (index <= 0) return 0;
        int[] result = new int[index];
        result[0] = 1;
        int begin = 1, m2 = 0, m3 = 0, m5 = 0;
        while (begin < index) {
            result[begin] = min(result[m2] * 2, result[m3] * 3, result[m5] * 5);//大于当前最大丑数的最小数
            while ((result[m2] * 2 <= result[begin])) {
                m2++;
            }
            while ((result[m3] * 3 <= result[begin])) {
                m3++;
            }
            while ((result[m5] * 5 <= result[begin])) {
                m5++;
            }
            begin++;
        }
        return result[index - 1];
    }

    public static int min(int i, int j, int k) {
        int temp = i < j ? i : j;
        return temp < k ? temp : k;
    }

    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(1500));
    }
}
