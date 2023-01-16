import java.util.*;
public class ISBN{
    boolean isValid(String s){
        // s=s.trim();
        //System.out.println("s"+s);

        if(s.length()!=10)
        return false;
        int sum=0, count=10;
        for(int i=0; i<=9 ;i++){
            int digit=s.charAt(i)-'0';
            sum +=(count-- * digit) ;
        }
        //System.out.println("sum"+sum);
        if(sum%11==0)
        return true;
//egs... 0716703440
// 0545010225
// 1259060977


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
