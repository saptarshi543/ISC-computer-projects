

import java.util.*;
public class Diary{
	String Q[];
	int size,start,end;
	Diary(int max){
		size=max;
		Q=new String[size];
		start=end=0;
	}

	void pushadd(String n){
		if(end<size-1){
			Q[end]=n;
			end++;
		}else{
			System.out.println("NO SPACE");
		}
	}

	String popadd(){
		if(start==end)
			return "????";
		else {
			String removed=Q[start];
            for (int i = 0; i < end - 1; i++) {
                Q[i] = Q[i + 1];
            }
            end--;
            return removed;
        }
	}


	void show(){
		if(start==end)
			System.out.println("Empty");
		else{
			System.out.println("Queue status: ");
			for(int i=start;i<=(end-1);i++){
				System.out.print(Q[i]+"\t");
			}
			System.out.println();
		}
	}


	public static void main(String args[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("Enter capacity:");	
		Diary D=new Diary(nrt.nextInt()+1);
		System.out.println("\nEnter 1 to add an element to a queue");
        System.out.println("Enter 2 to delete an element from a queue");
        System.out.println("Enter 3 to show elements of a queue");
        System.out.println("Enter any other number to exit");
        System.out.println("Enter your choice: ");

		while(true){
			switch(nrt.nextInt()){
				case 1:
					D.pushadd(nrt.nextLine());
					break;
				case 2:
					System.out.println("Address removed is: "+D.popadd());
					break;
				case 3:
					D.show();
					break;
				default:
					System.exit(0);
			}
		}
	}
}