package com.stackroute.unittest.quickstart;
import java.util.*;
class Program4
{
    public static void main(String args[])
    {
        int num;
        Scanner scn=new Scanner(System.in);
        num=scn.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
        }
    }
}