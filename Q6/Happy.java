/*
 *A Happy number is a number in which the eventual sum of the square of the digits of the number is equal to 1. 


e.g. 28 = (2)2 + (8)² = 4 + 64 = 68 

68 = (6)² +(8) 2 = 36+ 64 = 100 

100 = (1)2 + (0)2 + (0)2=1+0+0=1  

Hence, 28 is a happy number. 

e.g. 12 = (1)2 + (2)²=1+4 = 5 

Hence, 12 is not a happy number. 

Design a class Happy to check if a given number is a happy number. Some of the members of the class are given below: 

Class name: 

Happy 

Data members/instance variables 
n 

store the numbers 

Member functions 
Happy () 

constructor to assign 0 to n 

void getnum (int nn) 

to assign the parameter value to the number n = nn 

int sum_sq_digits (int x) 

returns the sum of the square of the digits of the number x 

void ishappy() 

checks if the given number is a happy number by calling the function sum_sq_digits (int) and displays an appropriate message. 

Specify the class Happy giving details of the constructor(), void getnum(int). int sum sq_digits (int) and void ishappy(). Also define a main() function to create an object and call the methods to check for happy number. 
 */

import java.util.Scanner;
public class Happy{

int n;
Happy(){
	n=0;
}

void getnum(int nn){
n=nn;
}

int sum_sq_digits(int x){
	int copy=x,sum=0;
	while(copy>0){
		sum += (Math.pow(copy%10,2));
		copy/=10;
	}
	return sum;
}

void isHappy(){
	int result=n;
	while(result != 1 && result != 4){
		result = sum_sq_digits(result);
	}

	//happy numbers end with 1
	if(result==1)
		System.out.println("Happy number");
	else
		System.out.println("Not a happy number");
}

public static void main(String args[]){
	Scanner nrt=new Scanner(System.in);
	System.out.println("enter a number");
	int user=nrt.nextInt();
	Happy H=new Happy();
	H.getnum(user);
	H.isHappy();
	nrt.close();
}

}
