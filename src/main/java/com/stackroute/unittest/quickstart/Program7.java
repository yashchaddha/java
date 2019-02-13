package com.stackroute.unittest.quickstart;
import java.util.*;
class Program7
{
    public static void main(String args[])
    {
        int orignal=25;
        Scanner scn=new Scanner(System.in);
        while(true)
        {
        int num=scn.nextInt();
        if(num>=1&&num<=50)
        {
            if(num==orignal)
            {
                System.out.println(" Number guessed matches the original number  ");
                break;
            }
            else if(num>orignal)
            {
                System.out.println(" Number guessed is more than original number  ");
                
            }
            else if(num<orignal)
            {
                System.out.println(" Number guessed is less than original number  ");
               
            }
        }
        else
        {
            System.exit(0);
        }
        }
    }
}