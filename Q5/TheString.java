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
			if(tmp_c=='.' || tmp_c==',' || tmp_c==' ' || tmp_c=='*')
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
