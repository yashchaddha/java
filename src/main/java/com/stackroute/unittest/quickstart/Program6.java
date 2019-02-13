package com.stackroute.unittest.quickstart;
import java.util.*;
class Program6
{
    public static void main(String args[])
    {
        int num;
        int count=0;
        int rem;
        int sum=0;
        Scanner scn=new Scanner(System.in);
        num=scn.nextInt();
        int arr[]=new int[100];
        int copy=num;
        int large=0;
        int temp;
        int rev=0;
        while(copy>0)
        {
            copy=copy/10;
            count=count+1;
        }
        for(int i=0;i<count;i++)
        {
            rem=num%10;
            arr[i]=rem;
            num=num/10;
        }
        //sort the array
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) 
            {
                if (arr[i] < arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //sum of the even elements in array
        for(int i=0;i<count;i++)
        {
            if((arr[i]%2)==0)
            {
                sum=sum+arr[i];
            }
            else
                continue;
        }
        for(int i=0;i<count;i++)
        {
            rev=rev*10+arr[i];
        }
        System.out.println("Sorted number in non-increasing order :"+rev);
        System.out.println("Sum of all even numbers :"+sum);
        if(sum>15)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}