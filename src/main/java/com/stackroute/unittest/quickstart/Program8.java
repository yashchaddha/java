package com.stackroute.unittest.quickstart;

import java.util.*;
class Program8
{
    public static void main(String[] args) {
 
    Scanner scn=new Scanner(System.in);
    String str1 = scn.nextLine();
    String str2 = "";
 
    for (int i=str1.length()-1; i>=0; i--) {
      str2 += str1.charAt(i);
    }
 
    System.out.println(str2);
 
  }
}