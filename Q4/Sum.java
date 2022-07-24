/*
 *Write a program to declare a square matrix a[][] of order M× M, where M is a positive integer and represents rows and columns for the matrix. M should be greater than 2 and less than 10. Accept the value of M from the user. Display an appropriate message for an invalid input. 

Perform the following tasks: 

a)	Display the original matrix. 

b)	Find the sum of the elements in  each row of the matrix and display them. 

c)	Find the sum of the elements in each column of the matrix and display them. 

d)	Find the sum of the elements of left and right diagonals of the matrix and display them. 

Example 1: 

INPUT: 

M = 3 

1    2    3 

2    4    5 

3    5    6 

OUTPUT: 

1    2    3 

2    4    5 

3    5    6 

Sum of row1 = 6 

Sum of row2 = 11 

Sum of row3 = 14 

Sum of column1 = 6 

Sum of column2 = 11 

Sum of column3 = 14 

Sum of the left diagonal = 11 

Sum of the right diagonal = 10 

Example 2: 

INPUT: 

M = 4 

7    8    9    2 

4    5    6    3 

8    5    3    1 

7    6    4    2 

OUTPUT: 

7    8    9    2 

4    5    6    3 

8    5    3    1 

7    6    4    2 

Sum of row1 = 26 

Sum of row2 = 18 

Sum of row3 = 17 

Sum of row4 = 19 

Sum of column1 = 26 

Sum of column2 = 24 

Sum of column3 = 22 

Sum of the left diagonal = 17 

Sum of the right diagonal = 20 
 * */

import java.util.Scanner;
public class Sum{
  public static void main(String args[]){
    Scanner nrt=new Scanner(System.in);
    int n,r_sum=0,c_sum=0,l_d_sum=0,r_d_sum=0;
    System.out.println("Enter the order of Matrix");
    n=nrt.nextInt();
    int M[][]=new int[n][n];    
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.println("Enter value at row "+i+" and column "+j);
        M[i][j]=nrt.nextInt();
      }
    }
  

// printing the array
 for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print("\t"+M[i][j]);
      }
      System.out.println();
    }   

//condition checking and finding out the sums
int i,j=0;
 for(i=0;i<n;i++){
      for(j=0;j<n;j++){
      r_sum+= M[i][j];
      c_sum+= M[j][i];
      if(i==j)
        l_d_sum+= M[i][j];
      if((i+j)==(n-1))
        r_d_sum+= M[i][j];
      }
      System.out.println("Sum of row "+i+" is "+r_sum+"\nSum of column "+j+" is "+c_sum);
      r_sum=0;
      c_sum=0;
    }
    System.out.println("Sum of left diagonal elements of the matrix = "+l_d_sum+"\nSum of right diagonal elements of the matrix = "+r_d_sum);
nrt.close();
  }
}
