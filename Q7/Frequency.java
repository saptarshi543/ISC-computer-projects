/*
 *Input a sentence from the user and count the number of times, the words “an” and “and” are present in the sentence. Design a class Frequency using the description given below:
Class name	:	Frequency
Data Members/ variables :
Text		:	stores the sentence
Countand	:	 to store the frequency of the word “and”
Countan	:	 to store the frequency of the word “an”
Len		:	 stores the length of the string
Member functions / methods:
Frequency( )	  :constructor to initialize the instance variables
void accept(String n):to assign n to text,where the value of the parameter n should be in lower case.
void checkandfreq( ):to count the frequency of “and”
void checkanfreq( )	  :to count the frequency of “an”
void display( )	  :to display the number of”and” and “an” with appropriate messages.
Specify the class Frequency giving details of the constructor( ), void accept(String),void checkandfreq(),void checkanfreq( ) and void display( ).Also define the main( ) function to create an object and call methods accordingly to enable the task.
 * */

import java.util.Scanner;
public class Frequency{
static String text;
static int countand,countan,len;
	Frequency(){
		text="";
		countand=0;
		countan=0;
		len=0;
	}
	static void accept(String n){
		text=(n.trim()).toLowerCase();
		len=text.length();
	}
	static void checkandfreq(){
		String d[]=text.split(" ");
		for(String tmp:d){
		if(tmp.equals("and"))
			countand++;
		}
	}
	static void checkanfreq(){
		String d[]=text.split(" ");
		for(String tmp:d){
			if(tmp.equals("an"))
				countan++;
		}
	}
	void display(){
	System.out.println("Frequency of and = "+countand+"\n an = "+countan+"\nlength of string = "+(text.length()));
	}
	public static void main(String a[]){
	Scanner nrt=new Scanner(System.in);
	System.out.println("enter a sentence");
	String user=nrt.nextLine();
	Frequency F=new Frequency();
	F.accept(user);
	F.checkandfreq();
	F.checkanfreq();
	F.display();
	nrt.close();
	}
}
