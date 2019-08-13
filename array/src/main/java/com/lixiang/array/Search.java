package com.lixiang.array;


public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};//目标数组，有序数组
        int target = 3; //查找目标元素

        int start = 0;  //存储起始索引
        int end = arr.length - 1; //存储结束索引
        int middle = (start + end) / 2; //存储中间索引
        int index = -1; //存储目标元素所造索引，初始值为 -1
        while (true) {
            if (arr[middle] == target) {
                index = middle;
                break;
            } else {
                if (arr[middle] > target) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
                middle = (start + end) / 2;
            }
        }
        System.out.println(index);
    }
}
