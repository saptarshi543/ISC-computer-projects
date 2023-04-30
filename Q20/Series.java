import java.util.Scanner;
public class Series{
    int factorial(int a){
        int f=1;
        for(int i=1;i<=a;i++)
            f*=i;
        return f;
    }
    int Series1(int x, int n){
        Series S=new Series();
        int sum=0;
        for(int i=2;i<=n;i++){
            sum+=((Math.pow(x,i))/(S.factorial(i-1)));
        }
        return sum;
    }
    int Series2(int x, int n){
        Series O=new Series();
        int sum=0;
        for(int i=0; i<=n;i++){
            sum+=((((i-1)*x)+i)/(O.factorial(i)));
        }
        return sum;
    }
    public static void main(String r[]){
        Scanner nrt=new Scanner(System.in);
        Series Obj=new Series();
        System.out.println("Enter value of x and n");
        int user_x=nrt.nextInt();
        int user_n=nrt.nextInt();
        System.out.println("Enter 1 for the first series or any other number for series 2");
        int user_choice=nrt.nextInt();
        if(user_choice==1)
            System.out.println("result = "+Obj.Series1(user_x,user_n));
        else
            System.out.println("result = "+Obj.Series2(user_x,user_n));

        nrt.close();
    }
}