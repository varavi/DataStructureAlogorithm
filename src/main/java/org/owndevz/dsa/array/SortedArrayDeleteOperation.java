package org.owndevz.dsa.array;

public class SortedArrayDeleteOperation {
    public static void main(String[] args) {
        int arr[]=new int[15];
        arr[0]=12;arr[1]=34;arr[2]=53;arr[3]=91;arr[4]=92;arr[5]=135;
        int deleteElement=53;
        int capacity=6; // used for filled element in array



        for(int i=0;i<capacity;i++)
            System.out.print(arr[i] +" ");

        System.out.println();
        int capacityDecreased=deleteInSortedArray(arr,deleteElement,capacity);
        //
            for(int i=0;i<capacityDecreased;i++)
                System.out.print(arr[i] +" ");
    }

    public static int deleteInSortedArray(int arr[],int newElement,int capacity)
    {

        int position=findElement(arr,newElement,0,capacity-1);
        int i;
        for( i=position;i<capacity;i++)
            arr[i]=arr[i+1];

        return capacity-1;
    }

    public static int findElement(int arr[],int findElement,int left,int right)
    {
        if(left>right)
            return -1;

        int mid=(left+right)/2;

        if(arr[mid]==findElement)
            return mid;
        if(arr[mid]>findElement)
            return findElement(arr,findElement,left,mid-1);
        return findElement(arr,findElement,mid+1,right);
    }


}
