package Sorting_Algorithm;

import java.util.Arrays;

public class BubbleSort{

    public int[] bubbleSore(int[] sourceArray){
        //对源数组进行拷贝,不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);

//                int[] targetArr = {5,8,4,6,25,44,15,2,9};
//                5 4 6 8 25 15 2 9 44
//                4 5 6 8 15 2 9 25 44
        int j = 1;
        int count = 0;
        while (j < arr.length){
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            for(int i = 0; i < arr.length - j;i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;

                    flag = false;
                }
                count++;
            }
            if (flag) {
                break;
            }
            j++;
        }
        System.out.println("循环次数："+count);
        return arr;
    }


}
