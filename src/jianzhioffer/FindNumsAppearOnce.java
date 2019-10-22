package jianzhioffer;

/**
 * Created by Jeff_xu on 2019/10/22.
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 *
 * @author Jeff_xu
 */
public class FindNumsAppearOnce {
    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public static void findNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array.length < 2) {
            return;
        }
        int count;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1 && index == 0) {
                num1[0] = array[i];
                index++;
            }
            if (count == 1 && index == 1) {
                num2[0] = array[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 1, 2, 2, 3, 3, 4, 5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        findNumsAppearOnce(array, num1, num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
