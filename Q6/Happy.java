import java.util.Scanner;
public class Happy{

int n;
Happy(){
	n=0;
}

void getnum(int nn){
nn=n;
}

int sum_sq_digits(int x){
	int copy=x,sum=0;
	while(copy>0){
		sum+=Math.pow((copy%10),2);
		copy/=10;
	}
	return sum;
}

void isHappy(){
	int copy1=n;
	boolean f=false;
	while(true){
		int tmp=sum_sq_digits(copy1);
		if(tmp==1){
			f=true;
			break;
		}
		else{
			int c=0;
			while(tmp>0){
				tmp/=10;
				c++;
			}
			if(c==1)
				break;
			else
				copy1=tmp;
		}
	}
	if(f==true)
		System.out.println(n+" is a Happy Number");
	else
		System.out.println(n+" is not a Happy Number");
}

public static void main(String args[]){
	Scanner nrt=new Scanner(System.in);
	System.out.println("enter a number");
	int user=nrt.nextInt();
	Happy H=new Happy();
	H.getnum(user);
	H.isHappy();
	nrt.close();
}

}
