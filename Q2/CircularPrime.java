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
    public static void main(String args[]) 
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
