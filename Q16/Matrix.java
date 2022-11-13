/*
Write a menu driven program for performing sum, difference and product of 2 matrices 
*/

import java.util.Scanner;
public class Matrix{
    int M1[][],M2[][];
    int m1_r,m1_c,m2_r,m2_c;
    boolean sum_difference=false,product=false;
    void take_input(){
        System.out.println("Enter no. of rows & columns for the first matrix");
        Scanner nrt=new Scanner(System.in);
        m1_r=nrt.nextInt();
        m1_c=nrt.nextInt();
        M1=new int[m1_r][m1_c];
        System.out.println("Enter no. of rows & columns for the second matrix");
        m2_r=nrt.nextInt();
        m2_c=nrt.nextInt();
        M2= new int[m2_r][m2_c];
    }
    void check(){
        if((m1_r==m2_r)&&(m1_c==m2_c))
            sum_difference=true;
        if(m1_c==m2_r)
            product=true;

            if(sum_difference==false && product==false){
                System.out.println("Operation of sum, difference, product are not possible.\nExiting...");
                System.exit(0);
            }
    }
    void takeElementInput(){
        Scanner nrt=new Scanner(System.in);
        System.out.println("Enter elements for the first matrix");
        for(int i=0;i<m1_r;i++){
            for(int j=0;j<m1_c;j++){
                M1[i][j]=nrt.nextInt();
            }
        }
        System.out.println("Enter elements for the second matrix");
        for(int i=0;i<m2_r;i++){
            for(int j=0;j<m2_c;j++){
                M2[i][j]=nrt.nextInt();
            }
        }
    }
    void display(){
        System.out.println("--------------");
        for(int i=0;i<m1_r;i++){
            for(int j=0;j<m1_c;j++){
                System.out.print(M1[i][j]+"\t");
            }System.out.println();
        }
        System.out.println("--------------");
        for(int i=0;i<m2_r;i++){
            for(int j=0;j<m2_c;j++){
                System.out.print(M2[i][j]+"\t");
            }System.out.println();
        }
        System.out.println("--------------");
    }
    void sum(){
        if(sum_difference==true){int ans[][]=new int[m1_r][m1_c];
        for(int i=0;i<m1_r;i++){
            for(int j=0;j<m1_c;j++){
                ans[i][j]=(M1[i][j]+M2[i][j]);
                System.out.print(ans[i][j]+"\t");
            }System.out.println();
        }}
        else
        System.out.println("Not Possible");
    }
    void difference(){
        if(sum_difference==true){
            int ans[][]=new int[m1_r][m1_c];
            for(int i=0;i<m1_r;i++){
                for(int j=0;j<m1_c;j++){
                    ans[i][j]=(M1[i][j]-M2[i][j]);
                    System.out.print(ans[i][j]+"\t");
                }System.out.println();
        }}
        else
        System.out.println("Not Possible");
    }
    void find_product(){
        int ans[][]=new int[m1_r][m2_c];
        for(int i=0;i<m1_r;i++){
            for(int j=0;j<m2_c;j++){
                ans[i][j]=0;
                for(int k=0;k<m1_c;k++){
                    ans[i][j] += (M1[i][k]*M2[k][j]);
                }
            }
        }
        //displaying...
        for(int i=0;i<m1_r;i++){
            for(int j=0;j<m2_c;j++){
                System.out.print(ans[i][j]+"\t");
            }System.out.println();
        }
    }
    public static void main(String args[]){
        Matrix O=new Matrix();
        O.take_input();
        O.check();
        O.takeElementInput();
        O.display();
        Scanner nrt=new Scanner(System.in);
        System.out.println("1:Find Sum\n2:Find Difference\n3:Find Product");
        switch(nrt.nextInt()){
            case 1:
                O.sum();
                break;
            case 2:
                O.difference();
                break;
            case 3:
                O.find_product();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}