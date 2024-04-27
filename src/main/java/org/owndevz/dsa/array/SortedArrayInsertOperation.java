package org.owndevz.dsa.array;

public class SortedArrayInsertOperation {
    public static void main(String[] args) {
        int arr[]=new int[15];
        arr[0]=12;arr[1]=34;arr[2]=53;arr[3]=91;arr[4]=92;arr[5]=135;
        int newElement=18;
        int capacity=6; // used for filled element in array

        int capacityIncreased=insertInSortedArray(arr,newElement,capacity);

        if(capacityIncreased==capacity)
            System.out.println("Array is full");
        else
            for(int i=0;i<capacity+1;i++)
                System.out.print(arr[i] +" ");
    }

    public static int insertInSortedArray(int arr[],int newElement,int capacity)
    {
        int i;
        for( i=capacity-1;(i>=0 && arr[i]>newElement);i--)
            arr[i+1]=arr[i];
        arr[i+1]=newElement;

        return capacity+1;
    }


}
