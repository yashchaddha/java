/*Program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.   
b. Prlong success and failure messages for all 3 conditions*/

import java.util.*;
class Palindrome{
    public static void main(String args[])
    {
        int count=0;//count variable to find number of digits 
        long num;//Entered number
        long copy;//copy of the entered number
        long copy1;//second copy of number entered
        long reversedNumber=0;//Reversed Number
        long rem;//remainder obtained on every iteration of loop
        long even=0;//calculate sum of even numbers
        int i;//variable used for for loop
        Scanner scn=new Scanner(System.in);
        num=scn.nextLong();
        copy=num;
        copy1=num;
        //finding out the digits in the number
        while(copy>0)
        {
            copy=copy/10;
            count=count+1;
        }
        //finding out if the number entered is palindrome or not
        for(i=0;i<count;i++)
        {
            rem=copy1%10;
            if(rem%2==0)
            {
                even=even+rem;
            }
            reversedNumber=reversedNumber*10+rem;
            copy1=copy1/10;
        }
        //checking the conditions
        if(reversedNumber==num)
        {
            if(even>25)
            {
                System.out.println(num+" is a palindrome number and the sum of even numbers is greater than 25");
            }
            else
            {
                System.out.println(num+" is a palindrome number and the sum of even numbers is less than 25");
            }
        }
        else
        {
            System.out.println(num+" is not a palindrome number");
        }
    }
}