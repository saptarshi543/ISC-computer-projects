  class Number{
      int n;
      Number(){
          n=0;
      }
      int factorial(int a){
        int f=1;
        for(int i=1;i<=a;i++)
            f*=i;
        return f;
      }
      void display(){
          System.out.println("Value of n: "+n);
      }
  }
