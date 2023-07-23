import java.util.*;
class Cartons{
	int N;
	void take_input(){
		Scanner nrt=new Scanner(System.in);
		System.out.print("Enter the number of boxes: ");
		N=nrt.nextInt();
		if(N>1000){
			System.out.println("INVALID INPUT");
			System.exit(0);
		}
	}
	int break_up(){
		int count=0,copy=N;
		for(int i=48;i>=6;i=i/2){
			count += (copy/i);
			System.out.println(i+" x "+(copy/i)+" = "+(i*(copy/i)));
			copy=(copy%i);



		}
			System.out.println("\nRemaining boxes = "+copy);
		
		return (copy>0)?(count+1):(count);
	}

	public static void main(String args[]){
		Cartons C=new Cartons();
		C.take_input();
		System.out.println("\nTotal number of boxes: "+C.N+"\nTotal cartons needed: "+C.break_up());
	}
}