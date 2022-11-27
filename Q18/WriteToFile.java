/**/
import java.util.*;
import java.io.*;

public class WriteToFile{

    void take_input() throws IOException{
        try{
        WriteToFile OB=new WriteToFile();
        FileWriter F=new FileWriter("/home/sap543/Documents/school-projects/Q18/Data.txt");
        OB.take_info_input(F);
        F.close();
        }
        catch(IOException e){System.out.println(e);}
    }
    void take_info_input(FileWriter P1) throws IOException{
        Scanner sc=new Scanner(System.in);
        try{
            String name,stream;
            int roll;
            P1.write("Name:\t\t\t\t\tRoll no.:\t\t\t\tStream:\n");
            System.out.println("Enter the name(without any space in between), roll and the stream of the students in the format\n \"name<space>roll<space>stream\"");
            System.out.println("Eg: SaptarshiChattopadhyay 27 science");
            for(int i=0;i<5;i++){
                String tmp=sc.nextLine();
                String  T[]=tmp.split(" ");
                for(int j=0;j<(T.length);j++){
                    //for name let's insert a space where the second capital letter starts
                    String tmpC=T[j];
                    if(j==0){
                        String firstName="",lastName="";
                        boolean reachedCapital=false;
                        firstName+=tmpC.charAt(0);
                        for(int k=1;k<tmpC.length();k++){
                            char tmpChar=(tmpC.charAt(k));
                            if(Character.isUpperCase(tmpChar))
                                reachedCapital=true;
                            if(reachedCapital==false)
                                firstName+=tmpChar;
                            else
                                lastName+=tmpChar;
                        }
                        P1.write(firstName+" "+lastName+"\t\t\t\t\t\t");
                    }else{
                    P1.write(tmpC+"\t\t\t\t");}
                }
                P1.write("\n");
            }
        }
        catch(IOException e1){System.out.println(e1);}
    }
    public static void main(String d[]){
        WriteToFile OBJ=new WriteToFile();
        try{OBJ.take_input();}
        catch(Exception f){System.out.println(f);}
    }
}
