package org.owndevz.dsa.array;

public class UnsortedArraySearchOperations {
    public static void main(String[] args) {
       // int arr[]=new int[5];
        int arr[]={32,3,4,56,23,45,2};
        System.out.println(arr);

        System.out.println(searchElementByPosition(arr,2));

        System.out.println(getItemPositionByValue(arr,23));
    }

    public static int searchElementByPosition(int arr[],int index)
    {
        if(index-1 <=arr.length)
            return arr[index-1];

        return -1;
    }

    public static int getItemPositionByValue(int arr[],int value)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==value)
                return i+1;
        }

        return -1;
    }


}
