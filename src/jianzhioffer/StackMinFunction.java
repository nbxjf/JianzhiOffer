package jianzhioffer;

/**
 * Created by Jeff_xu on 2016/12/5 0005.
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class StackMinFunction {

    int[] arr = new int[1000];
    int top = -1;

    public void push(int node) {
        top++;
        arr[top] = node;
    }

    public void pop() {
        top--;
    }

    public int top() {
        return arr[top];
    }

    public int min() {
        int min = arr[top];
        for (int i = 0; i <= top; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

    }
}
