import java.util.*;
class Series extends Number {
    int sum;
    Series(int a){
        super(a);
        sum=0;
    }
    void calSum(){
        for(int i=1;i<=n;i++){
            sum+= factorial(i);
        }
    }
    void display(){
        super.display();
        System.out.println("Sum: "+sum);
    }
    public void main(){
        System.out.println("Enter value of n");
        Scanner nrt=new Scanner(System.in);
        Series S=new Series(nrt.nextInt());
        S.calSum();
        S.display();
    }
}