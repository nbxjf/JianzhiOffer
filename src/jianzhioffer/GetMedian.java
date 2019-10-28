package jianzhioffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Jeff_xu on 2019/10/27.
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 *
 * @author Jeff_xu
 */
public class GetMedian {
    List<Integer> digit = new ArrayList<>();

    public void Insert(Integer num) {
        digit.add(num);
    }

    public Double GetMedian() {
        if (digit == null || digit.size() < 1) {
            return null;
        }
        digit.sort(Comparator.comparingInt(Integer::intValue));
        if (digit.size() % 2 == 1) {
            return Double.valueOf(digit.get(digit.size() / 2));
        } else {
            return Double.valueOf(digit.get(digit.size() / 2) + digit.get((digit.size() - 1) / 2)) / 2;
        }
    }
}
