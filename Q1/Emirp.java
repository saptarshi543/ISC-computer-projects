/*
An emirp number is a number which is prime backwards and forwards. Example : 13 and 31 are both prime numbers. Thus 13 is a emirp number. Write a java program to check whether a number is emirp number or not. 
*/

import java.util.Scanner;
public class Emirp{
	public static boolean isPrime(int num){
	if(num<=1)
		return false;
		for(int i=2;i<(num/2);i++){
	if(num%i==0)
		return false;
	}
	return true;
	}
public static void main(){
Scanner nrt=new Scanner(System.in);
System.out.println("enter a number");
int user=nrt.nextInt();
if(isPrime(user)){
//reversing the number
int copy=user,reverse=0;
while(copy!=0){
reverse = (reverse*10) +(copy%10);
copy/=10;
}
if(isPrime(reverse))
	System.out.println(user+" is an Emirp Number");
else
System.out.println(user+" is NOT an Emirp Number");
}
else
	System.out.println("Invalid Input");
}
}
