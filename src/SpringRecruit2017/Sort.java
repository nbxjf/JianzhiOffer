package SpringRecruit2017;

/**
 * Created by Jeff_xu on 2017/3/21.
 * 给定一个无序的序列，返回有序序列
 * 插入排序
 * 冒泡排序
 * 选择排序
 * <p>
 * 归并排序
 * 希尔排序
 * 快速排序
 * 堆排序
 * <p>
 * 桶排序
 * * 计数排序
 * * 基数排序
 */
public class Sort {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] arr = {3, 4, 1, 2, 7, 8, 6, 9, 0};
        arr = sort.MergeSort(arr, 0, 8);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }

    /**
     * 插入排序
     *
     * @param arr
     * @return
     */
    public int[] InsertionSort(int[] arr) {
        /*
            插入排序
            原理：每一步都将待排数据按其大小插入到已经排序的数据中的适当位置
              即：将数组分为两部分
                    1 已经排序的部分 left[]
                    2 未排序的部分  right[]
                  每次从未排序的部分中取出一个数插入到已经排序的部分中的适当的位置，直到全部全部插入完
         */
        if (arr.length == 1) return arr;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) { //arr[i]<arr[i-1]说明当前数比前一个数小，而前面的数是排序好的，所以有必要换
                //将当前数用temp存起来，然后依次将大的数往前移，直到while条件不成立，然后把当前值放置带while条件退出是的位置
                int temp = arr[i];
                int j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
        return arr;
    }

    /**
     * 冒泡排序
     *
     * @param arr 排序数组
     * @return int[]
     */
    public int[] BubbleSort(int[] arr) {
        /*
            冒泡排序
            原理：重复循环，一次比较两个数，如果大小顺序不对，就进行交换，每一次循环就能找出该次循环的最小值
         */
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 快速排序
     *
     * @param arr
     * @return
     */
    public int[] QuickSort(int[] arr, int l, int r) {
        /*
            快速排序
            它是对冒泡排序的一种改进
            基本思想：
                每一次排序都将该序列分成独立的两部分，其中一部分都比这个数小，另外一部分都比这个数字大
                然后再按照该方法对这两个序列分别进行快速排序，整个过程递归实现，最终达到排序成有序序列
            原理：
                总体概括就是一个萝卜一个坑
                1 设置两个变量i=0,j=n-1
                2 将a[i]复制给temp,然后从j开始扫描
                3 若a[j]比a[i]小，则将a[j]的值占a[i]的坑
                4 然后开始从i开始向又扫描
         */
        if (l < r) {
            int i = l, j = r, x = arr[l];
            while (i < j) {
                while (i < j && arr[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if (i < j)
                    arr[i++] = arr[j];

                while (i < j && arr[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if (i < j)
                    arr[j--] = arr[i];
            }
            arr[i] = x;
            QuickSort(arr, l, i - 1); // 递归调用
            QuickSort(arr, i + 1, r);
        }
        return arr;
    }

    /**
     * 选择排序
     *
     * @param arr
     * @return
     */
    public int[] SelectionSort(int[] arr) {
        /*
            选择排序
            原理：即每次都从待排序的数组中找出最小（大）的数，并将其存放在起始位置，直至结束
            思路：
                1 假设第一个数字是最小的,min
                2 然后一次遍历找出最小的数
                3 将最小的数与第一个数字交换位置
                4 重复操作
         */
        if (arr == null || arr.length == 0) return null;  //没有元素，返回null
        if (arr.length == 1) return arr;  //只有一个元素，直接返回
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }

    /**
     * 计数排序
     *
     * @param arr    排序数组
     * @param maxNum 最大的数字
     * @return int[]
     */
    public int[] BucketSoet(int[] arr, int maxNum) {
        /*
            桶排序
            基本原理：
                桶排序的基本思想是将一个数据表分割成许多buckets，然后每个bucket各自排序，或用不同的排序算法，或者递归的使用bucket sort算法
            设计思路：
                1 建立一堆buckets；
                2 遍历原始数组，并将数据放入到各自的buckets当中；
                3 对非空的buckets进行排序；
                4 按照顺序遍历这些buckets并放回到原始数组中即可构成排序后的数组。
         */
        int[] sort = new int[maxNum + 1];
        for (int i = 0; i < arr.length; i++) {
            sort[arr[i]] = arr[i];
        }
        return sort;
    }

    /**
     * 归并排序
     *
     * @param nums 待排序数组
     * @return 排序后的数组
     */
    public int[] MergeSort(int[] nums, int low, int high) {
        /*
        * 设计思路
            * 总的来说是先分割，在合并
            * 先将待排序数组分割成两部分，再把2部分分割成4部分，依次分割下去，知道每个数独立成为一个分组
            * 然后再将这些独立的分组合并起来
            * 形成有序的序列
         */
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边
            MergeSort(nums, low, mid);
            // 右边
            MergeSort(nums, mid + 1, high);
            // 左右归并
            merge(nums, low, mid, high);
        }
        return nums;
    }

    //归并排序归并操作
    public static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;

        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            nums[k2 + low] = temp[k2];
        }
    }
}
