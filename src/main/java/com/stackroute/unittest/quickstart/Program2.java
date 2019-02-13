package com.stackroute.unittest.quickstart;
import java.util.*;
class Program2
{
    public static void main(String args[])
    {
        int num;
        Scanner scn=new Scanner(System.in);
        num=scn.nextInt();
        if(num%2==0&&(num>20&&num<30))
        {
            System.out.println("Tom");
        }
        else if(num%2!=0&&(num>20&&num<30))
        {
            System.out.println("Jerry");
        }
    }
}