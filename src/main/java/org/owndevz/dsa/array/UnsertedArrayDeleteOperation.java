package org.owndevz.dsa.array;

public class UnsertedArrayDeleteOperation {

    public static void main(String[] args) {
        int arr[]=new int[15];
        arr[0]=12;arr[1]=3;arr[2]=5;arr[3]=9;arr[4]=2;arr[5]=13;
        int deleteKey=5;
        int filledElement=6;

        //before inserting element in array
        for(int i=0;i<filledElement;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        //after inserting new element in array
        filledElement=deleteElementFromArray(arr,deleteKey,filledElement);
        if(filledElement!=-1)
        {
            System.out.println();
            for(int i=0;i<filledElement;i++)
            {
                System.out.print(arr[i]+ " ");
            }
        }
    }

    public static int deleteElementFromArray(int arr[],int deleteKey,int filledElement)
    {
        int position=findPosition(arr,deleteKey,filledElement);
             if(position!=-1) {
                 for (int i = position; i < filledElement; i++)
                     arr[i] = arr[i + 1];
                return filledElement-1;
             }

        return -1;
    }
    public static int findPosition(int arr[],int findKey,int filledElement)
    {
        for (int i=0;i<filledElement;i++)
            if(arr[i]==findKey)
                return i;

        return -1;
    }
}
