/*
 *Write a menu driven program to sort the elements of an integer array using bubble sort, selection sort, insertion sort
 */

import java.util.Scanner;
public class Sorting{

    int a[];
    int n;
    Sorting(int nn)
    {
        n=nn;
        a=new int[n];
    }
    void readarray()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    void print()
    {
        System.out.println("Array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    void bubblesort()
    {
         int temp = 0;  
         for(int i=0; i < n; i++)
         {  
            for(int j=1; j < (n-i); j++)
            {  
                if(a[j-1] > a[j])
                {  
                    //swap elements  
                    temp = a[j-1];  
                    a[j-1] = a[j];  
                    a[j] = temp;  
                }            
            }
         }
    }
    void selectionsort()
    {
        for (int i = 0; i < a.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < a.length; j++){  
                if (a[j] < a[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int temp= a[index];   
            a[index] = a[i];  
            a[i] = temp;  
        }  
    }
    void insertionsort()
    {
        int sortvalue=0;
        for(int i=1; i<a.length; i++)
        {
            sortvalue=a[i];
            int j;
            for(j=i-1; j>=0; j--)
            {
                if(a[j]>sortvalue)
                {
                    a[j+1]=a[j];
                }
                else
                {
                    break;
                }
            }
            a[j+1]=sortvalue;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of array");
        int n=sc.nextInt(); 
        Sorting s=new Sorting(n);
        System.out.println("Enter the elements of array");
        s.readarray();
        s.print();
        System.out.println("Select sorting technique:");
        System.out.println("1. for bubble sort");
        System.out.println("2. for selection sort");
        System.out.println("3. for insertion sort");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
                s.bubblesort();
                s.print();
                break;
            case 2:
                s.selectionsort();
                s.print();
                break;
            case 3:
                s.insertionsort();
                s.print();
                break;
        }
        
    }
}
