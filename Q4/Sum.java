/*
 * Write a java program to find the sum of elements of
 * i)   each row of the matrix
 * ii)  each column .........
 * iii) left diagonal of the matrix
 * iv)  right ...................
 */

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
