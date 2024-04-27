package org.owndevz.dsa.array;

import java.io.FilterOutputStream;
import java.util.Stack;

/**
 * Write a program to print all the LEADERS in the array. An element is a leader
 * if it is greater than all the elements to its right side. And the rightmost element is always a leader.
 *
 * Input: arr[] = {16, 17, 4, 3, 5, 2},
 * Output: 17, 5, 2
 *
 * Input: arr[] = {1, 2, 3, 4, 5, 2},
 * Output: 5, 2
 */
public class LeadersArrayProgram {
    public static void main(String[] args) {
        int arr[]={16, 17, 4, 3, 5, 2};
      //  leaderArray(arr,arr.length);
        System.out.println();
        //   leaderArrayFromLastIndex(arr,arr.length);
        leaderArrayFromStack(arr,arr.length);
    }
    public static void leaderArray(int arr[],int size)
    {
        //Time Complexity: O(N * N)
        for(int i=0;i<size;i++)
        {
            int j;
             for( j=i+1;j<size;j++)
             {
                 if(arr[i]<=arr[j])
                     break;
             }
            if(j== size)
                System.out.print(arr[i]+" ");
        }
    }
    public static void leaderArrayFromLastIndex(int arr[],int size)
    {
        int max_element_last_index=arr[size-1];
        System.out.print(arr[max_element_last_index] + " ");

        for(int i=size-2;i>=0;i--)
        {
            if(max_element_last_index<arr[i]) {
                max_element_last_index = arr[i];
                System.out.print(max_element_last_index + " ");
            }
        }
    }

    public static void leaderArrayFromStack(int arr[],int size)
    {
        Stack<Integer> stack=new Stack<>();

        stack.push(arr[size-1]);

        for (int i=size-2;i>=0;i--)
        {
            if(arr[i]>stack.peek())
            {
                stack.push(arr[i]);
            }
        }

        while (!stack.empty())
        {
            System.out.println(stack.pop() +" ");
        }
    }
}
