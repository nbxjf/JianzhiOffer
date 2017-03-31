package SpringRecruit2017;

/**
 * Created by Jeff_xu on 2017/3/21.
 * 二分搜索算法
 * 题目：
 * 给出一个有序的数组和一个数字，若数组中存在该数字，返回该下标，若没有，返回-1
 */
public class BinarySerach {
    // 迭代方式实现
    public int findTargetBum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;  //防止(left + right)大数溢出
            if (arr[middle] < target) {
                left = middle + 1;
            } else if (arr[middle] > target) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    // 递归方式实现
    public int findTargetBumByRecrusion(int[] arr, int begin, int end, int target) {
        if(begin <= end ){
            //递归必要的两个要素，递归条件与递归出口
            int mid = begin + (end - begin) / 2;
            if (arr[mid] < target) {
                return findTargetBumByRecrusion(arr, mid + 1, end, target);
            } else if (begin <= end && arr[mid] > target) {
                return findTargetBumByRecrusion(arr, begin, mid - 1, target);
            }else{
                return mid;
            }
        }else{
            return -1;
        }
    }
}
