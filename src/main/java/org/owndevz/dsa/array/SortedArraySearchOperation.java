package org.owndevz.dsa.array;

public class SortedArraySearchOperation {
    // Since the array is shored we can use binary search to find the element
    public static void main(String[] args) {
        int arr[]={2,11,23,32,42,52,69,70,83,96,100};

        int findElement=42;

      //  int findPosition=findElementByValue(arr,findElement);
        int findPosition=findElementByValueRecursive(arr,findElement,0,arr.length-1);
        if(findPosition==-1)
            System.out.println(findElement+" is not found in Array");
        else
        System.out.println("Position is : "+findPosition);
    }

    public static int findElementByValue(int arr[],int findElement)
    {
        int left=0; int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(arr[mid]==findElement)
                return mid;

            if(arr[mid]<findElement)
                left=mid+1;
            else
                right=mid-1;
        }

        return -1;
    }

    public static int findElementByValueRecursive(int arr[],int findElement,int left,int right)
    {
      //  int left=0; int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(arr[mid]==findElement)
                return mid;

            if(arr[mid]<findElement)
               return findElementByValueRecursive(arr,findElement,mid+1,right);
                //left=mid+1;
            else
               return findElementByValueRecursive(arr,findElement,left,mid-1);
               // right=mid-1;
        }

        return -1;
    }

}
