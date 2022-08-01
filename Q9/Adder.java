import java.util.Scanner;
public class Adder{
static int a[]=new int[2];
static int h_ans=0,m_ans=0;
Adder(){
a[0]=0;
a[1]=0;
}
void readtime(){
Scanner nrt=new Scanner(System.in);
System.out.println("enter hours and minutes");
a[0]=nrt.nextInt();
a[1]=nrt.nextInt();
}
void addtime(Adder X, Adder Y){
int m_sum=X.a[1] + Y.a[1];
if(m_sum >= 60){
	int tmp= m_sum/60;
	int tmp2=m_sum%60;
	m_ans=tmp2;
	h_ans=(tmp+ X.a[0] + Y.a[0]);
}
else{
	h_ans= X.a[0] + Y.a[0];
	m_ans= X.a[1] + Y.a[1];
}
}

void disptime(){
System.out.println("hours: "+h_ans+"\t minutes: "+m_ans);
}

public static void main(String args[]){
Scanner nrt=new Scanner(System.in);

Adder A=new Adder();
Adder B=new Adder();
A.readtime();
B.readtime();
A.addtime(A,B);
A.disptime();
nrt.close();
}

}
