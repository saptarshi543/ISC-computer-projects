import java.util.*;
public class Cipher{
	String str;
	int length;
	void take_input(){
		Scanner nrt=new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=(nrt.nextLine()).trim();
		length=str.length();
		if(length<=3 || length>=100){
			System.out.println("INVALID INPUT");
			System.exit(0);
		}
	}

	String encrypt(){
		String ans="";
		char letters[]={'n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m'};
	  char alphabets[]={'N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M'};
		// A B C D E
		// 1 2 3 4 5

		for(int i=0;i<length;i++){
			char tmp=str.charAt(i);
	
			
			if(tmp=='!' || tmp=='.' || tmp==',' || tmp=='?' || tmp==' '){
				ans+=tmp;
			}
			if(Character.isUpperCase(tmp)){
				//alphabets
				
				ans+=alphabets[((int)(tmp)-65)];
			}
			if(Character.isLowerCase(tmp)){
				//letters
				ans+=letters[((int)(tmp)-97)];
			}
		}
		return ans;
	}
	public static void main(String args[]){
		Cipher C=new Cipher();
		C.take_input();
		System.out.println("The cipher text is:\n"+C.encrypt());
	}
}