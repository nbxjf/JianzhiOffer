package offer2019;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jeff_xu on 2019/12/9.
 *
 * 题目描述
 * 牛牛总是睡过头，所以他定了很多闹钟，只有在闹钟响的时候他才会醒过来并且决定起不起床。从他起床算起他需要X分钟到达教室，上课时间为当天的A时B分，请问他最晚可以什么时间起床
 * 输入描述:
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含一个正整数，表示闹钟的数量N(N<=100)。
 * 接下来的N行每行包含两个整数，表示这个闹钟响起的时间为Hi(0<=A<24)时Mi(0<=B<60)分。
 * 接下来的一行包含一个整数，表示从起床算起他需要X(0<=X<=100)分钟到达教室。
 * 接下来的一行包含两个整数，表示上课时间为A(0<=A<24)时B(0<=B<60)分。
 * 数据保证至少有一个闹钟可以让牛牛及时到达教室。
 * 输出描述:
 * 输出两个整数表示牛牛最晚起床时间。
 * 示例1
 * 输入
 * 3
 * 5 0
 * 6 0
 * 7 0
 * 59
 * 6 59
 * 输出
 * 6 0
 *
 * @author Jeff_xu
 */
public class WakeUpClock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        List<Time> timeList = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            timeList.add(new Time(scanner.nextInt(), scanner.nextInt()));
        }
        timeList.sort(Comparator.comparing(o -> o));
        int needMinute = scanner.nextInt();
        Time timeLine = new Time(scanner.nextInt(), scanner.nextInt());
        Time result = null;
        for (Time time : timeList) {
            Time line = addMinute(time, needMinute);
            if (line.compareTo(timeLine) <= 0) {
                result = time;
            } else {
                break;
            }
        }
        System.out.println(result.hour + " " + result.minute);

    }

    public static Time addMinute(Time time, int minute) {
        Time timeCopy = new Time(time.hour, time.minute);
        while (minute > 0) {
            int minusMinute = timeCopy.minute + minute >= 60 ? 60 - timeCopy.minute : minute;
            minute = minute - minusMinute;
            if (timeCopy.minute + minusMinute >= 60) {
                timeCopy.hour++;
                timeCopy.minute = 0;
            } else {
                timeCopy.minute = timeCopy.minute + minusMinute;
            }
        }
        return timeCopy;
    }

    public static class Time implements Comparable<Time> {
        public int hour;

        public int minute;

        public Time(int hour, int minute) {
            this.hour = hour;
            this.minute = minute;
        }

        @Override
        public int compareTo(Time o) {
            if (hour == o.hour) {
                return minute - o.minute;
            } else {
                return hour - o.hour;
            }
        }
    }

}
