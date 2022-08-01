/*
 *Example: Time A 6 hours 35 minutes Time B Their sum is 7 hours 45 minutes 14 hours 20 minutes (where 60 minutes = 1 hour)

 Class name: Adder
 Data member/instance variable
a[]
Member functions/methods
Adder()
void readtime()
void addtime(Adder X, Adder Y)
integer array to hold two elements (hours and minutes)
constructor to assign 0 to the array elements
to enter the elements of the array
adds the time of the two parameterized objects X and Y and stores the sum in the current calling object
void disptime()
displays the array elements with an appropriate message (i.e. hours = and minutes =
Specify the class Adder giving details of the constructor(), void readtime(), void addtime (Adder, Adder) and void disptime(). Define the main() function to create objects and call the functions accordingly to enable the task.
 */

import java.util.Scanner;
public class Adder{
 int a[]=new int[2];
 int h_ans=0,m_ans=0;
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
