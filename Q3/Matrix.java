/*
 *Write a program to declare a square matrix M [ ] [ ] of order ‘N’ where ‘N’ must be greater than 3 and less than 10. Allow the user to accept three different characters from the keyboard and fill the array according to the instruction given below: 

  

(i) Fill the four corners of the square matrix by character 1. 

(ii) Fill the boundary elements of the matrix (except the four corners) by character 2. 

(iii) Fill the non-boundary elements of the matrix by character 3. 

  

Test your program with the following data and some random data: 

INPUT: N = 5 

FIRST CHARACTER: A 

SECOND CHARACTER: C 

THIRD CHARACTER: X 

  

OUTPUT: 

A C C C A 

C X X X C 

C X X X C 

C X X X C 

A C C C A 

  

INPUT: N = 4 

FIRST CHARACTER: @ 

SECOND CHARACTER: ? 

THIRD CHARACTER: # 

  

OUTPUT: 

@ ? ? @ 

?  #  # ? 

?  #  # ? 

@ ? ? @ 
 * */

import java.util.Scanner;

public class Matrix{
  public static void main(){
    Scanner nrt=new Scanner(System.in);
    System.out.println("Enter three characters");
    char ch1,ch2,ch3;
    ch1=(nrt.nextLine()).charAt(0);
    ch2=(nrt.nextLine()).charAt(0);
    ch3=(nrt.nextLine()).charAt(0);
    System.out.println("Enter order of Matrix");
    int n=nrt.nextInt();
    char M[][]= new char[n][n];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          if( (i==0 && j==0) || (i==0 && j==n-1) || (i==n-1 && j==0) || (i==n-1 && j==n-1))
              M[i][j]=ch1;
          else if ( (i>=1 && i<=(n-2)) && (j>=1 && j<=(n-2)))
              M[i][j]=ch2;
          else
              M[i][j]=ch3;
      }
    }


    //printing the matrix
    for(int i=0 ;i<n;i++){
      for(int j=0; j<n;j++){
        System.out.print("\t"+M[i][j]);
      }
      System.out.println();
    }
nrt.close();
  }
}
