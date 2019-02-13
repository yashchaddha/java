 package com.stackroute.unittest.quickstart;
import java.util.*;
class Program3
{
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String line = scn.nextLine();
        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                System.out.print("Vowel ");
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                 System.out.print("Consonant ");
            }
            else if( ch >= '0' && ch <= '9')
            {
                System.out.print("Error");
                break;
            }
            else if (ch ==' ')
            {
                System.out.print("Error");
                break;
            }
            else
            {
                System.out.print("Error");
                break;
            }
        }
    }
}
