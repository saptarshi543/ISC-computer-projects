import java.util.Scanner;
public class RecurBinSearch{
	int a[];
	void take_input(int len){
		Scanner nrt=new Scanner(System.in);
		a=new int[len];
		System.out.println("enter elements...");
		for(int i=0;i<len;i++){
			a[i]=nrt.nextInt();
		}
	}
	void display(){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	void insertionsort(){
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
    int binary_search(int a[],int target,int start,int end){
    	if(start <= end){
		int mid=(start+end)/2;
		if(target==a[mid])
			return mid+1;
		else if(target > a[mid])
			return binary_search(a,target, mid+1 ,end);
		else
			return binary_search(a,target, start, mid-1);
	}
	return -1;
    }
	public static void main(String s[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter length of array: ");
		int user_len=nrt.nextInt();
		RecurBinSearch A=new RecurBinSearch();
		A.take_input(user_len);
		System.out.println("Original array");
		A.display();
		System.out.println("enter target element");
		int t=nrt.nextInt();
		A.insertionsort();
		System.out.println("after sorting");
		A.display();
		System.out.println("Element found at : "+(A.binary_search(A.a,t,0,((A.a).length))));
	}
}
