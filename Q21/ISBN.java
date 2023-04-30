/*
An ISBN (International Standard Book Number) is a ten digit code which uniquely identifies a book. The first nine digits represent the Group, Publisher and the Title of the book and the last digit is used to check whether ISBN is correct or not. Each of the first nine digits of the code can take a value between 0 and 9. Sometimes it is necessary to make the last digit equal to ten; this is done by writing the last digit of the code as X. To verify an ISBN, calculate 10 times the first digit, plus 9 times the second digit, plus 8 times the third digit and so on until we add 1 time the last digit. If the final number leaves no remainder when divided by 11, the code is a valid ISBN. 

For Example: 

1. 0201103311 = 10*0 + 9*2 + 8*0 + 7*1 + 6*1 + 5*0 + 4*3 + 3*3 + 2*1 + 1*1 = 55 

Since 55 leaves no remainder when divided by 11, hence it is a valid ISBN. 

2. 007462542X = 10*0 + 9*0 + 8*7 + 7*4 + 6*6 + 5*2 + 4*5 + 3*4 + 2*2 + 1*10 = 176 

Since 176 leaves no remainder when divided by 11, hence it is a valid ISBN. 

3. 0112112425 = 10*0 + 9*1 + 8*1 + 7*2 + 6*1 + 5*1 + 4*1 + 3*4 + 2*2 + 1*5 = 71 

Since 71 leaves no remainder when divided by 11, hence it is not a valid ISBN. 

Design a program to accept a ten digit code from the user. For an invalid input, display an appropriate message. Verify the code for its validity in the format specified below: 

Test your program with the sample data and some random data: 

Example 1 

INPUT CODE: 0201530821 

OUTPUT : SUM = 99 

LEAVES NO REMAINDER – VALID ISBN CODE 

Example 2 

INPUT CODE: 035680324 

OUTPUT : INVALID INPUT 

Example 3 

INPUT CODE: 0231428031 

OUTPUT : SUM = 122 

LEAVES REMAINDER – INVALID ISBN CODE 

 
*/


import java.util.*;
public class ISBN{
    boolean isValid(String s){
        // s=s.trim();
        //System.out.println("s"+s);

        //checking if str contains "x" at the 
        //end
        if(s.length()!=10)
            return false;

        int sum=0, count=10,digit;
        boolean contains_x=false;

        if((s.charAt(s.length()-1))=='X'){
            contains_x=true;
        }

        
        for(int i=0; i<=9 ;i++){
            if(i==9&&contains_x==true){
                digit=10;
            }else{
            digit=s.charAt(i)-'0';
            }
            // System.out.println("digit > "+digit);
            sum +=(count-- * digit) ;



        }
        //System.out.println("sum"+sum);
        if(sum%11==0)
        return true;
//egs... 0716703440
// 0545010225
// 1259060977
//0198526636
//080442957X

        return false;
    }
    public static void main(String f[]){
        Scanner nrt=new Scanner(System.in);
        System.out.println("Enter the isbn no.");
        String user=nrt.nextLine();
        ISBN O=new ISBN();
        boolean ans=O.isValid(String.valueOf(user));
        System.out.println(ans?("VALID"):("INVALID"));
        nrt.close();
    }
}
