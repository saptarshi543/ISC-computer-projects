/*
A class whrl contains a 2-D array of order MXN. Write a java program to perform a right circular shift and a left circular shift on alternate rows and columns. 

Eg: INPUT 

      m=5 

      n=4 

      MATRIX IS: 

      20  2  24  25 

      48  18  13  47 

      43  18  30  32 

      22  45  30  38 

      48  12  18  37 

      OUTPUT: 

      25  20  2  24 

      18  13  47  48 

      32  43  18  30 

      45  30  38  22 

      37  48  12  18 
*/

import java.util.*;
public class CircularShift{
	int m,n;
	int arr[][];
	void take_input(){
		Scanner nrt=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		m=nrt.nextInt();
		n=nrt.nextInt();
		arr=new int[m][n];

		System.out.println("Enter the elements");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=nrt.nextInt();
			}
		}
	}
	void Shift(){
		/*
	  20  2  24  25 

      48  18  13  47 

      43  18  30  32 

      22  45  30  38 

      48  12  18  37 

/////////////////////////

	  0   1   2   3


	  25  20  2  24 			0..

      18  13  47  48 			1

      32  43  18  30 			2..

      45  30  38  22 			3

      37  48  12  18 			4..

		*/



/*
	for nTH ROW the LAST element comes FIRST
	for (N+1)TH ROW 1ST element goes LAST
*/

		boolean bounce=true;

		for(int i=0;i<m;i++){
			int tmp=arr[i][n-1];
		System.out.println(bounce);
			for(int j=n-1;j>0;j--){
				if(bounce==true){
					arr[i][j]=arr[i][j-1];
				}else{
					//do nothing for now...
				}
			}
			arr[i][0]=tmp;
			bounce=(!bounce);
		}


	}

	void display(){
		System.out.println("-----------");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("-----------");
	}
	public static void main(String[] args) {
		CircularShift O=new CircularShift();
		O.take_input();
		O.display();
		O.Shift();
		O.display();
	}
}