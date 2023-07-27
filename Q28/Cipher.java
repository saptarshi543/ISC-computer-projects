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
	  

		for(int i=0;i<length;i++){
			char tmp=str.charAt(i);
	
			
			if(tmp=='!' || tmp=='.' || tmp==',' || tmp=='?' || tmp==' '){
				ans+=tmp;
			}
			if(Character.isUpperCase(tmp)){
				//alphabets
				
				ans+=((letters[((int)(tmp)-65)])+"").toUpperCase();
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