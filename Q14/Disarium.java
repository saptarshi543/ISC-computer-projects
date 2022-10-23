/*
 *A disarium number is a number in which the sum of the digits to the power of their respective position is equal to the number itself. 

Example: 135 = 1^1 + 3^2 + 5^3 

Hence, 135 is a disarium number. 

Design a class Disarium to check if a given number is a disarium number or not. Some of the members of the class are given below: 

Class name: Disarium 

Data members/instance variables: 

int num: stores the number 

int size: stores the size of the number 

Methods/Member functions: 

Disarium(int n): parameterized constructor to initialize the data members num = n and size = 0 

void countDigits(): counts the total number of digits and assigns it to size 

int sumOfDigits(int n, int p): returns the sum of the digits of the number (n) to the power of their respective positions (p) using recursive technique 

void check(): checks whether the number is a disarium number and displays the result with an appropriate message 

Specify the class Disarium giving details of the constructor, void countDigits(), int sumOfDigits(int, int) and void check(). Define the main() function to create an object and call the functions accordingly to enable the task.  
 */

import java.util.Scanner;
public class Disarium{
int num,size;

	Disarium(int n){
	num=n;
	size=0;
	}
	void countDigits(){
		int copy=num,count=0;
		while(copy>0){
			copy/= 10;
			count++;
		}
		size=count;
	}
	int SumOfDigits(int n, int p){
		if(n==0)
			return 0;
		else{
			return (int)(Math.pow(n%10,p))+SumOfDigits(n/10,p-1);
		}
	}
	void check(){
		int sum=SumOfDigits(num,size);

		
		if(sum==num)
			System.out.println(num+" is a Disarium number");
		else
			System.out.println(num+" is not a Disarium number");
	}
	public static void main(String h[]){
		Scanner nrt=new Scanner(System.in);
		System.out.print("Enter number: ");
		int user=nrt.nextInt();
		Disarium D=new Disarium(user);
		D.countDigits();
		D.check();
		
		//System.out.println("\nIs "+user+" a disarium number? \n"+(D.isDisarium(user)));
		nrt.close();
	}
}
