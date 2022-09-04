/* Write a program to check if a number is Disarium or not
 *
 */

import java.util.Scanner;
public class Disarium{
	boolean isDisarium(int u){
		int n=u;
		int len=(Integer.toString(n)).length();
		int check=0,power=len;
		for(int i=0;i<len;i++){
			check += Math.pow((n%10),power--);
			n/=10;
		}
		if(check==u)
			return true;
		else
			return false;
	}
	public static void main(String h[]){
		Scanner nrt=new Scanner(System.in);
		System.out.print("Enter number: ");
		int user=nrt.nextInt();
		Disarium D=new Disarium();
		System.out.println("\nIs "+user+" a disarium number? \n"+(D.isDisarium(user)));
		nrt.close();
	}
}
