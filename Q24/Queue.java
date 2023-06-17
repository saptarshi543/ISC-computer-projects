/*
 *Queue is an entity which can hold a maximum of 100 integers. The queue enables the user to add integers from the rear and remove integers from the front. Define a class Queue with the following details: 
Class name : Queue
Data Members / instance variables:
Que[ ] : array to hold the integer elements
size : stores the size of the array
front : to point the index of the front
rear : to point the index of the rear
Member functions:
Queue (int mm) constructor to initialize the data
size = mm, front = 0, rear = 0
void addele(int v ) : to add integer from the rear if possible
else display the message “Overflow”
int delete( ) : returns elements from front if present, otherwise displays the message “Underflow” and return -9999
void display ( ) : displays the array elements
Specify the class Queue giving details of the functions void addele(int) and int delete( ) and write the main() method also.
 *
 * */
import java.util.*;

public class Queue
{
    //final int MAX=100; 
    int que[]; 
    int size,front,rear; 
    public Queue(int mm)
    {
        size=(mm<=100)?mm:100;
        System.out.println("size: "+size);
        que=new int[size];
        front=0;rear=0;
    }
    public void addele(int v)
    {
        if(rear<size)
        {
           que[rear]=v;
           rear++;
           System.out.println("Element added to the queue"); 
        }
            
        else
        {
           System.out.println("Queue overflow");
        }
    }
    public int delele()
    {
        if(front==rear) 
            return (-9999); 
        else
        {
            return que[front++];
            
        }
    }
    public void show()
    {
        if(front==rear)
            System.out.print("Empty");
        else
        {
            for (int i=rear-1;i>=front;i--)
                System.out.print(que[i]+"    ");
        }
        System.out.println();
    }
 
    public static void main(String args[]) 
    {
        int n=0;
        System.out.println("Enter capacity");
        
        Scanner sc=new Scanner(System.in);

        Queue obj=new Queue(sc.nextInt());
        System.out.println("\n\nEnter 1 to add an element to a queue");
        System.out.println("Enter 2 to delete an element from a queue");
        System.out.println("Enter 3 to show elements of a queue");
        System.out.println("Enter any other number to exit");
            

        while(true){
            System.out.println("Enter your choice");
            switch (sc.nextInt())
            {
                case 1:
                System.out.println("Enter an integer to be added to the queue");
                n=sc.nextInt();
                obj.addele(n);
                break;
                case 2:
                if(n==-9999)
                    System.out.println("Queue underflow");
                else
                    System.out.println("Element deleted is: "+(obj.delele()));
                break;
                case 3:
                System.out.println("Queue status");
                obj.show();
                break;
                default:
		System.exit(0);
            } 
        }
    }
}
