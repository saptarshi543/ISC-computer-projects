/*Write a menu driven program in java to convert a binary to decimal and vice versa
 */

import java.util.Scanner;
public class DecToBin{
	int binary_to_decimal(int n){
		if(n==0)
			return 0;
		return n%10+2*binary_to_decimal(n/10);
	}
	int decimal_to_binary(int n){
		if(n==0)
			return 0;
		else 
			return (n%2 +10 * decimal_to_binary(n/2));
	}
	public static void main(String arg[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("1: Binary to Decimal\n2:Decimal to Binary");
		int choice=nrt.nextInt();
		System.out.println("Enter the number:");
		int num=nrt.nextInt();
		DecToBin A=new DecToBin();
		if(choice==1){
			System.out.println("Decimal version of "+num+" is "+(A.binary_to_decimal(num)));
		}
		else if (choice == 2){
			System.out.println("Binary version of "+num+" is "+(A.decimal_to_binary(num)));	
		}
		nrt.close();
	}

}
