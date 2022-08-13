/*
 *Design a class to overload a function stringload() as follows:

(i) void stringload (String s, char ch1, char ch2) with one string argument and two character arguments that replaces the character argument ch1 with the character argument ch2 in the given string s and prints the new string.
Example:
Input value of s =”TECHNALAGY”
ch1=’A’,
ch2=’O’
Output : “TECHNOLOGY”

(ii) void stringload (String s) with one string argument that prints the position of the first space and the last space of the given string s.
Example:
Input value of =”Cloud computing means Internet based computing”
Output : First index : 5
Last index : 36
(iii) void stringload ( String s1, String s2 ) with two string arguments that combines the two strings with a space between them and prints the resultant string.

Example:
Input value of s1 =”COMMON WEALTH “
Input value of s2=”GAMES “
Output : COMMON WEALTH GAMES
(use library functions)
 */

public class Overload{
	void stringload(String s, char ch1, char ch2){
		String ans="";
		for(int i=0;i<s.length();i++){
			char tmp=s.charAt(i);
			if(tmp==ch1)
				ans+=ch2;
			else
				ans+=tmp;
		}
		System.out.println(ans);
	}
	void stringload(String s){
		System.out.println("First space found at: "+(s.indexOf(' '))+"\nLast space found at: "+(s.lastIndexOf(' ')));
	}
	void stringload(String s1, String s2){
		String ans=s1+s2;
		System.out.println(ans);
	}
	public static void main(String k[]){
		Overload O=new Overload();
		O.stringload("Hello there humans!!",'e','$');
		O.stringload("hi! Nice to meet you");
		O.stringload("Computer"," is fun");
	}
}
