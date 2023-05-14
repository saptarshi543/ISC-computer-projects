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

    System.out.println("Enter a number"); 

    int n=sc.nextInt(); 

if(n>20) 

n=20; 

WordPile obj=new WordPile(n); 

 

while(true) 

{ 

System.out.println("1. PushCharacter"); 

System.out.println("2. Pop Character"); 

System.out.println("3. Display stack"); 

System.out.println("4. Exit"); 

System.out.print("Enter your choice:"); 

int choice=sc.nextInt(); 

switch(choice) 

{ 

case 1: System.out.print("Enter the character:"); 

char c=sc.next().charAt(0); 

obj.pushChar(c); 

break; 

case 2: c=obj.popChar(); 

if(c=='\\') System.out.println("Empty stack."); 

else 

System.out.println(c+" popped."); 

break; 

case 3: 

obj.display(); 

case 4: 

System.exit(0); 

break; 

default: 

break ; 

} 

} 

} 

} 
