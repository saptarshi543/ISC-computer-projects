import java. util. Scanner; 

class WordPile { 

char ch[]; 

int capacity; 

int top; 

void display(){ 

for(int i=0;i<=top;i++){ 

System.out.println("\t"+ch[i]+"\t"); 

} 

} 

public WordPile(int cap) 

{ 

capacity=cap; 

top=-1; 

ch=new char[capacity]; 

} 

public void pushChar(char v) 

{ 

if(top+1==capacity) 

System.out.println("WordPile is full"); 

else 

ch[++top]=v; } 

public char popChar() { 

if(top==-1) return '\\'; else return ch[top--]; 

}  

public static void main(String args[]) { 

    Scanner sc=new Scanner(System.in); 

    System.out.println("Enter capacity"); 

    int n=sc.nextInt(); 

if(n>20) 

n=20; 

WordPile obj=new WordPile(n); 

System.out.println("1. PushCharacter"); 

System.out.println("2. Pop Character"); 

System.out.println("3. Display stack"); 

System.out.println("4. Exit"); 
 

while(true){ 


System.out.print("Enter your choice:"); 

int choice=sc.nextInt(); 
char c;






if(choice==1){
    System.out.print("Enter the character:");
    c=sc.next().charAt(0);
    obj.pushChar(c); 
}if(choice==2){
    c=c=obj.popChar();
    if(c=='\\') System.out.println("Empty stack."); 
    else
        System.out.println(c+" popped.");
}if(choice==3){
    obj.display();
}if(choice==4){
    System.exit(0);
}


} 

} 

} 
