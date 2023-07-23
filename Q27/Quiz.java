/*
The result of a quiz competition is to be prepared as follows:

The quiz has five questions with four multiple choices (A, B, C, D), with each question carrying 1 mark for the correct answer. Design a program to accept the number of participants N such that N must be greater than 3 and less than 11. Create a double-dimensional array of size (Nx5) to store the answers of each participant row-wise. Calculate the marks for each participant by matching the correct answer stored in a single-dimensional array of size 5. Display the scores for each participant and also the participant(s) having the highest score.

Example: If the value of N = 4, then the array would be:




Note: Array entries are line fed (i.e. one entry per line)

Test your program for the following data and some random data.

Example 1

INPUT:
N = 5
Participant 1 D A B C C
Participant 2 A A D C B
Participant 3 B A C D B
Participant 4 D A D C B
Participant 5 B C A D D
Key: B C D A A

OUTPUT:
Scores:
Participant 1 = 0
Participant 2 = 1
Participant 3 = 1
Participant 4 = 1
Participant 5 = 2
Highest Score:
Participant 5

Example 2

INPUT:
N = 4
Participant 1 A C C B D
Participant 2 B C A A C
Participant 3 B C B A A
Participant 4 C C D D B
Key: A C D B B

OUTPUT:
Scores:
Participant 1 = 3
Participant 2 = 1
Participant 3 = 1
Participant 4 = 3
Highest Score:
Participant 1
Participant 4

Example 3

INPUT:
N = 12

OUTPUT:
INPUT SIZE OUT OF RANGE.

*/


import java.util.*;

public class Quiz{
	char arr[][];
	int marks[];
	char key[];
	int N;
	Quiz(int n){
		if(n<=3 || n>=11){
			System.out.println("INVALID INPUT");
			System.exit(0);
		}
		N=n;
		arr= new char[N][5];
		marks=new int[N];
		key=new char[5];
	}

	void take_input(){
		System.out.println("Enter the participants answers: ");
		Scanner nrt=new Scanner(System.in);
		for(int i=0;i<N;i++){
			System.out.println("Participant: "+(i+1));
			for(int j=0;j<5;j++){
				arr[i][j]=(nrt.nextLine()).charAt(0);
			}
		}

		//taking key input
		System.out.println("Enter the key: ");
		for(int i=0;i<5;i++){
			key[i]=(nrt.nextLine()).charAt(0);
		}
	}

	void display(){
		for(int i=0; i<N;i++){
			System.out.print("Participant: "+(i+1));
			for(int j=0;j<5;j++){
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}

		System.out.print("\nKEY: \t");
		for(int i=0;i<5;i++){
			System.out.print("\t"+key[i]);
		}
		System.out.println();
	}

	void check(){
		//checking scores

		int count=0;
		for(int i=0;i<N;i++){
			for(int j=0;j<5;j++){
				if(key[j]==arr[i][j])
					count++;
			}
			marks[i]=count;
			count=0;
			System.out.println("Score of Participant "+(i+1)+" is : "+marks[i]);
		}
	}


	void get_high(){
		int max=0;

		for(int i=0;i <(N-1);i++){
			if(marks[i]>marks[i+1])
				max=marks[i];
		}

		System.out.println("List of Highest scorer(s)");
		for(int i=0;i <(N-1);i++){
			if(marks[i]==max)
				System.out.println("Participant "+(i+1)+" score: "+marks[i]);
		}
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of participants: ");

		Quiz Q=new Quiz(sc.nextInt());
		Q.take_input();
		Q.display();
		Q.check();
		Q.get_high();
	}

}