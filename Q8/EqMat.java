/*
 *Two matrices are said to be equal if they have the same dimension and their corresponding elements are equal.

For example , the two matrices A and B given below are equal:

Matrix A                 Matrix B
1  2    3                     1   2     3
2   4   5                     2   4     5
3    5   6                    3     5    6
Design a class EqMat to check if tow matrices are equal or not. Assume that the two matrices have the same dimension.
Class name            :  EqMat
Data members:
a[][]                                        : to store integer elements
m, n                                        : to store the number of rows and columns
Member functions:
EqMat(int mm, int nn)             :  initialize the data members m=mm and n=nn
void readarray()                        :  to enter the elements in the array
int check(EqMat P, EqMat Q)  : checks if the parameterized objects P and Q are equal and returns 1 if true,otherwise returns 0.
void print()                                 : displays the array elements
Define the class and define main() to create objects and call the functions accordingly to enable the task.
 */
import java.util.Scanner;
public class EqMat{
 int a[][];
 int m,n;
EqMat(int mm,int nn){
	m=mm;
	n=nn;
	a=new int[m][n];
}
void readArray(){
	Scanner nrt=new Scanner(System.in);
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			System.out.println("enter element at position: "+i+" "+j);
			a[i][j]=nrt.nextInt();
		}
	}
}
int check(EqMat P, EqMat Q){

				
	for(int i=0;i<m;i++){	
		for(int j=0;j<n;j++){
			if(P.a[i][j] != Q.a[i][j])
				return 0;
		}
	}
	return 1;

}
void print(){
	for(int i=0;i<m;i++){	
		for(int j=0;j<n;j++){
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
}

}
public static void main(String args[]){
	Scanner nrt=new Scanner(System.in);
	System.out.println("enter number of rows and columns");
	int row=nrt.nextInt();
	int col=nrt.nextInt();
	EqMat A=new EqMat(row,col);
	EqMat B=new EqMat(row,col);
	A.readArray();
	A.print();
	B.readArray();
	B.print();

	if(A.check(A,B)==1)
		System.out.println("Equal Matrix");
	else
		System.out.println("Not Equal Matrix");

nrt.close();
}
}
