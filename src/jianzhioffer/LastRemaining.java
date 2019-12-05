package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeff_xu on 2019/10/30.
 * 每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。
 * HF作为牛客的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。
 * 然后,他随机指定一个数m,让编号为0的小朋友开始报数。
 * 每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....
 * 这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
 * 请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
 *
 * 如果没有小朋友，请返回-1
 *
 * @author Jeff_xu
 */
public class LastRemaining {

    public static int lastRemainingSolution(int n, int m) {
        if (n <= 0) {
            return -1;
        }
        List<Node> nodeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Node item = new Node(i);
            nodeList.add(item);
        }
        for (int i = 0; i < nodeList.size(); i++) {
            if (i == nodeList.size() - 1) {
                nodeList.get(i).next = nodeList.get(0);
            } else {
                nodeList.get(i).next = nodeList.get(i + 1);
            }
        }
        Node node = nodeList.get(0);
        int index = 0;
        while (node.next != null) {
            index++;
            if (index == m - 1) {
                node.next = node.next.next;
                index = 0;
                if (node.equals(node.next)) {
                    break;
                }
            }
            node = node.next;
        }
        return node.getNum();
    }

    public static void main(String[] args) {
        System.out.println(lastRemainingSolution(5, 3));
    }

    public static class Node {
        private int num;
        private Node next;

        public Node(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public Node getNext() {
            return next;
        }
    }
}
