package com.stackroute.unittest.quickstart;
import java.util.*;
class Program5{
    public static void main(String args[])
    {
        char ch;
        Scanner scn=new Scanner(System.in);
        ch=scn.next().charAt(0);
        if (ch>=65 && ch<=90)
        {
            System.out.println("Capital Letter");
        }
        else if (ch>=97 && ch<=122)
        {
            System.out.println("Small Letter");
        }
        else if (ch>=48 && ch<=57)
        {
            System.out.println("Digit");
        }
        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)||
               (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
        {
            System.out.println("Special Character");
        }
    }
}