/*
Design a program that accepts your DOB in dd/mm/yyyy format.
Check if the date entered is valid or not. If valid display "Valid Date" 
also compute the day no. of the year for the DOB, else display "Invalid Date".
 */
import java.util.Scanner;
public class DateChecking{
    int dd,mm,yy;
    boolean leap=false,ch=false;
    void take_input(){
        System.out.println("Enter your Date of birth in dd/mm/yyyy format...");
        Scanner nrt=new Scanner(System.in);
        dd=nrt.nextInt();
        mm=nrt.nextInt();
        yy=nrt.nextInt();
    }
    boolean checkValidity(){
        if(dd>0 && dd<32){//checking date
            if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12){//checking months with 31 days
                if(dd<32)
                    ch=true;
            }
            if(mm==4 || mm==6 || mm==9 || mm==11){//checking months with 30 days
                if (dd<31)
                ch=true;
            }
        }
        if (((yy % 4 == 0) && (yy % 100!= 0)) || (yy%400 == 0)){//checks leap year
            leap=true;
        }
        if(mm==2){//checks february
                if(leap==true && dd<=29)
                    ch=true;
                    else if(dd<=28)
                    ch=true;
            }
            return ch;
    }
    int calculateDay(){
        int count=0;
        for(int i=1; i<mm;i++){
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
                count+=31;
            if(i==4 || i==6||i==9||i==11)
                count +=30;
            if(i==2){
                if(leap==true)
                    count+=29;
                else
                    count+=28;
            }
        }
        count+=dd;
        return count-1;
    }
    public static void main(String args[]){
        DateChecking D=new DateChecking();
        D.take_input();
        if(D.checkValidity())
            System.out.println("Valid Date\nDay no. of the year is: "+D.calculateDay());
        else
            System.out.println("Invalid Date");
    }
}