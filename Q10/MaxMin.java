/*
 *Write a program to declare a matrix a[][] of order (M × N) where ‘M’ is the number of rows and ‘N’ is the number of columns such that both M and N must be greater than 2 and less than 20. Allow the user to input integers into this matrix. Perform the following tasks on the matrix: 

Display the input matrix. 

Find the maximum and minimum value in each row and each column of the matrix and display them. 
 */

import java.util.Scanner;
public class MaxMin{
	int arr[][];
	int M,N;
	MaxMin(int m,int n){
		M=m;N=n;
		arr=new int[m][n];
	}
	void readArray(){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter elements:");
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				arr[i][j]=nrt.nextInt();
			}
		}
	}
	void display(){
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
	}
	void findMaxMin(){
		for(int i=0;i<M;i++){// for rows
			int maxR=0,minR=arr[i][0];
			for(int j=0;j<N;j++){
				if(maxR<arr[i][j])
					maxR=arr[i][j];
				if(minR>arr[i][j])
					minR=arr[i][j];
			}
			System.out.println("Max of row: "+(i+1)+" is "+maxR+"\nMin is: "+minR);
			maxR=0;minR=0;
		}


		for(int j=0;j<N;j++){// for columns
			int maxC=0,minC=arr[0][j];
			for(int i=0;i<M;i++){
				if(maxC<arr[i][j])
					maxC=arr[i][j];
				if(minC>arr[i][j])
					minC=arr[i][j];
			}
			System.out.println("Max of column: "+(j+1)+" is "+maxC+"\nMin is: "+minC);
			minC=0;maxC=0;
		}
	}
	public static void main(String h[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter dimensions of the matrix: ");
		int row=nrt.nextInt();
		int col=nrt.nextInt();
		if(((row<2)||(row>20))||((col<2)||(col>20))){
			System.out.println("Number of rows and columns must be greater than 2 and less than 20");
			System.exit(0);
	}
		MaxMin M=new MaxMin(row,col);
		M.readArray();
		M.display();
		M.findMaxMin();
	}
}
