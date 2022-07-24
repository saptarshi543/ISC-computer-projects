/*
 * 

Class Name 

TheString 

Data members/ instance variables 

 

str 

to store a string  

len 

integer to store length of string 

wordcount 

Integer to store number of words 

cons 

integer to store number of consonants 

Member functions/methods 

 

TheString() 

Default constructor to initialize 

Data members 

TheString(String ds) 

Parameterized constructor to assign str=ds 

Void countFreq() 

to count the number of words and the number of consonants and store them in wordcount and cons respectively 

Void display()  

To display the original string, along with the number of words and the number of consonants 

Specify the class TheString giving the details of the constructors, void countFreq() and void Display(). Define the main() function to create an object and call the functions accordingly to enable the task. 
 * */

import java.util.Scanner;
public class TheString{
String str;
int len,wordcount,cons;

TheString(){
	str="";
	wordcount=0;len=0;cons=0;
}

TheString(String ds){
	str=(ds.trim()).toUpperCase();
	len=str.length();
	cons=0;wordcount=0;
}

void countFreq(){
	String d[]=str.split(" ");
	wordcount=d.length;

	for(String tmp: d){
		for(int i=0;i<tmp.length();i++){
			char tmp_c=tmp.charAt(i);
			if(tmp_c=='.' || tmp_c==',' || tmp_c==' ' || tmp_c=='*' || tmp_c=='\'' || tmp_c=='!')
				continue;
			if(tmp_c!='A' && tmp_c!='E' && tmp_c!='I' && tmp_c!='O' && tmp_c!='U')
				cons++;
		}
	}
}

void display(){
	System.out.println("Original String ="+str+"\nwordcount = "+wordcount+"\nnumber of consonants = "+cons);
}

public void main(String ags[]){
	Scanner nrt=new Scanner(System.in);
	System.out.println("Enter a sentence");
	String user=nrt.nextLine();
	TheString obj1= new TheString(user);

	obj1.countFreq();
	obj1.display();
	nrt.close();
}

}
