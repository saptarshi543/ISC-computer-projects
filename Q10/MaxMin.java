import java.util.Scanner;
public class MaxMin{
	int arr[][];
	int M,N;
	MaxMin(int m,int n){
		M=m;N=n;
		arr=new int[m][n];
	}
	void readArray(){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter elements:");
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				arr[i][j]=nrt.nextInt();
			}
		}
	}
	void display(){
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
	}
	void findMaxMin(){
		int maxR=arr[0][0],minR=arr[0][0],maxC=arr[0][0],minC=arr[0][0];

	try{
	for(int i=0;i<M;i++){ //for rows
			  maxR=arr[i][0];minR=arr[i][0];
		for(int j=0;j<N;j++){
		
		maxR= Math.max(maxR, arr[i][j]);
		minR=Math.min(minR, arr[i][j]);
		
		
		
		//System.out.print(arr[i][j]+"\t");
	System.out.println("Max of row "+(i+1)+" is "+maxR+"\nMin of row "+(i+1)+" is "+minR);
	}
	}


	for(int j=0;j<N;j++){ //for columns
			     maxC=arr[j][0];minC=arr[j][0];
		for(int i=0;i<M;i++){
			maxC=Math.max(maxC, arr[i][j]);
			minC=Math.min(minC, arr[i][j]);
		//System.out.println(arr[i][j]);
		}
	System.out.println("Max of column "+(j+1)+" is "+maxC+"\nMin of column "+(j+1)+" is "+minC);
	}
	}
	catch(Exception e){
	System.out.println(e.getMessage());
	}

	}
	public static void main(String h[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter dimensions of the matrix: ");
		int row=nrt.nextInt();
		int col=nrt.nextInt();
		MaxMin M=new MaxMin(row,col);
		M.readArray();
		M.display();
		M.findMaxMin();
	}
}
