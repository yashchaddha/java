package com.stackroute.unittest.quickstart;

import java.util.*;
class Program9
{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        int n=scn.nextInt();
        String str2=str.substring(str.length()-n);
        for(int i=0;i<n;i++)
        {
            str=str+str2;
        }
        System.out.println(str);
    }
}