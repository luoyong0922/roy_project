package Sorting_Algorithm;

public class Main {
//    https://github.com/MisterBooo/Article
    public static void main(String[] args){

        int[] targetArr = {5,8,4,6,25,44,15,2,9};
        //冒泡排序
        BubbleSort bubble = new BubbleSort();
        int[] resultArr = bubble.bubbleSore(targetArr);
        for (int i: resultArr) {
            System.out.print(i+" ");
        }


    }
}
