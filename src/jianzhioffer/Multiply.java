package jianzhioffer;

/**
 * Created by Jeff_xu on 2019/10/28.
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 *
 * @author Jeff_xu
 */
public class Multiply {

    public static int[] multiply(int[] A) {
        if (A == null || A.length == 0) {
            return A;
        }
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int multiply = 1;
            for (int j = 0; j < A.length; j++) {
                if (i != j) {
                    multiply *= A[j];
                }
            }
            result[i] = multiply;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] multiply = multiply(new int[] {1, 2, 3, 4});
        for (int i : multiply) {
            System.out.println(i);
        }
    }
}
