/*
 *A Circular  Prime is a prime number that remains prime under cyclic shifts of its digits. When the leftmost digit is removed and replaced at the end of the remaining string of digits, the generated number is still prime. The process is repeated until the original number is reached again. 

 

A number is said to be prime if it has only two factors 1 and itself. 

Example: 

131 

311 

113 

Hence, 131 is a circular prime. 

  

Write a program to accept a positive number N and check whether it is a circular prime or not. The new numbers formed after the shifting of the digits should also be displayed. 

  

Test your program with the following data and some random data: 

Example 1 

INPUT: 

N = 197 

OUTPUT: 

197 

971 

719 

197 IS A CIRCULAR PRIME. 

Example 2 

INPUT: 

N = 1193 

OUTPUT: 

1193 

1931 

9311 

3119 

1193 IS A CIRCULAR PRIME. 

Example 3 

INPUT: 

N = 29 

OUTPUT: 

29 

92 

29 IS NOT A CIRCULAR PRIME. 
 * */

import java.util.Scanner;

class CircularPrime
{
    static boolean isPrime(int num) 
    {
        int c = 0;
        
        for (int i = 1; i <= num; i++) 
        {
            if (num % i == 0) 
            {
                c++;
            }
        }
        if(c==2)
        System.out.println(num+"is prime");
        else 
        System.out.println(num+"is not prime");
        return c == 2;
        
    }   
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();     
        int f=1;
        if (isPrime(n)) 
        {
            //System.out.println(n);
            String s=Integer.toString(n);
            int l=s.length();
            int divisor = (int)(Math.pow(10, l- 1));
            int m = n;
            for (int i = 1; i < l; i++) 
            {
                 int n1 = m / divisor;
                 int n2 = m % divisor;
                 m = n2 * 10 + n1;
                 //System.out.println(m);
                 if (!isPrime(m)) 
                 {
                     f=0;
                     break;
                 }
            }
        }
        else 
        {
            f=0;
        }
        
        if (f==1)
        {
            System.out.println(n + " is a circular prime.");
        }
        else 
        {
            System.out.println(n + " is not a circular prime.");
        }
        
    }
}
