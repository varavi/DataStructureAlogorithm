package org.owndevz.dsa.array;

import java.util.Arrays;

public class UnsortedArrayInsertOperation {

    public static void main(String[] args) {
        int arr[]=new int[15];
        arr[0]=12;arr[1]=3;arr[2]=5;arr[3]=9;arr[4]=2;arr[5]=13;
        int newElement=18;
        int position=3;
        int filledElement=6;

        //before inserting element in array
        for(int i=0;i<filledElement;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        //after inserting new element in array
        if(insertElement(arr,newElement,position,filledElement))
        {
            System.out.println();
           for(int i=0;i<filledElement+1;i++)
           {
               System.out.print(arr[i]+ " ");
           }
        }
    }
    public static boolean insertElement(int arr[],int newElement,int position,int filledElement)
    {
        for(int i=filledElement-1;i>=position;i--)
        {
            arr[i+1]=arr[i];
            if(position==i)
            {
                arr[position]=newElement;
                 return true;
            }

        }
        return false;
    }
}
