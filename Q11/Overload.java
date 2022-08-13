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
