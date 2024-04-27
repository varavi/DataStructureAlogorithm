package org.owndevz.dsa.array;

import java.util.Stack;

public class ArrayReversalOperation {

    public static void main(String[] args) {
        int arr[]={2,4,1,9,3};

        System.out.print("Original Array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

      //  reverseArrayWithNewArray(arr);
      //  reverseArrayUsingThirdVariable1(arr);
      //  reverseArrayUsingThirdVariable2(arr,0,arr.length-1);
        stackArrayRevers(arr);
    }

    public static void reverseArrayWithNewArray(int arr[])
    {
        int newArray[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            newArray[arr.length-1-i]=arr[i];
        }

        System.out.print("\n New Array using new Array : ");
        for (int ele:newArray) {
            System.out.print(ele+" ");
        }
    }
    public static void reverseArrayUsingThirdVariable1(int arr[])
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

            if(i==arr.length-1-i)
                break;
        }

        System.out.print("\n New Array using third variable method1 : ");
        for (int ele:arr) {
            System.out.print(ele+" ");
        };
    }
    public static void reverseArrayUsingThirdVariable2(int arr[],int start,int end)
    {
        int temp;
       while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        System.out.print("\n New Array using third variable method2 : ");
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
    }

    public static void stackArrayRevers(int arr[])
    {
        Stack<Integer> stack=new Stack<>();

        for (int ele:arr) {
            stack.push(ele);
        }

        for (int i=0;i<arr.length;i++) {
            arr[i]=stack.pop();
        }

        System.out.print("\n New Array using stack: ");
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
    }
}
