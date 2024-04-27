package org.owndevz.dsa.alogrithm.binarysearch;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int arr[]={2,11,23,32,42,52,69,70,83,96,100};

        System.out.println(binarySearch(arr,0, arr.length -1, 23));
    }



    static int binarySearch(int arr[], int low, int high,
                            int key)
    {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }
}
