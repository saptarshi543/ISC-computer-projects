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
