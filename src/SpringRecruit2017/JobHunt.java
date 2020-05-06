package SpringRecruit2017;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Jeff_xu on 2019/12/5.
 * 题目描述
 * 为了找到自己满意的工作，牛牛收集了每种工作的难度和报酬。牛牛选工作的标准是在难度不超过自身能力值的情况下，牛牛选择报酬最高的工作。在牛牛选定了自己的工作后，牛牛的小伙伴们来找牛牛帮忙选工作，牛牛依然使用自己的标准来帮助小伙伴们。牛牛的小伙伴太多了，于是他只好把这个任务交给了你。
 * 输入描述:
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含两个正整数，分别表示工作的数量N(N<=100000)和小伙伴的数量M(M<=100000)。
 * 接下来的N行每行包含两个正整数，分别表示该项工作的难度Di(Di<=1000000000)和报酬Pi(Pi<=1000000000)。
 * 接下来的一行包含M个正整数，分别表示M个小伙伴的能力值Ai(Ai<=1000000000)。
 * 保证不存在两项工作的报酬相同。
 * 输出描述:
 * 对于每个小伙伴，在单独的一行输出一个正整数表示他能得到的最高报酬。一个工作可以被多个人选择。
 *
 * linkUrl: https://www.nowcoder.com/practice/46e837a4ea9144f5ad2021658cb54c4d?tpId=98&tqId=32824&tPage=1&rp=1&ru=/ta/2019test&qru=/ta/2019test/question-ranking
 *
 * @author Jeff_xu
 *         linkurl: https://www.nowcoder.com/practice/46e837a4ea9144f5ad2021658cb54c4d?tpId=98&tqId=32824&tPage=1&rp=1&ru=/ta/2019test
 *         &qru=/ta/2019test/question-ranking
 */
public class JobHunt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();
        for(int i = 0; i < caseNum; i ++){
            int length = scanner.nextInt();
            String road = scanner.next();
            System.out.println(length);
            System.out.println(road);
        }
        scanner.close();

        //Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();
        //int M = sc.nextInt();
        //int[][] arr = new int[N][2];
        //TreeMap map = new TreeMap();
        //for (int i = 0; i < N; i++) {
        //    arr[i][0] = sc.nextInt();
        //    arr[i][1] = sc.nextInt();
        //}
        //Arrays.sort(arr, Comparator.comparingInt(e -> e[0]));
        //for (int i = 1; i < arr.length; i++) {
        //    arr[i][1] = Math.max(arr[i - 1][1], arr[i][1]);
        //}
        //for (int i = 0; i < arr.length; i++) {
        //    map.put(arr[i][0], arr[i][1]);
        //}
        //for (int i = 0; i < M; i++) {
        //    int ability = sc.nextInt();
        //    Integer index = (Integer)map.floorKey(ability);
        //    if (index != null) {
        //        System.out.println(map.get(index));
        //    } else {
        //        System.out.println(0);
        //    }
        //}
    }
}
