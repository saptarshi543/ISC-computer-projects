import java.util.*;
class Circle extends Plane{
    int x2,y2;
    double radius, area;
    Circle(int a, int b, int c, int d){
        super(a,b);
        x2=c;
        y2=d;
    }
    void findRadius(){
        //System.out.println("r init"+x1+" "+y1+" "+x2+" "+y2);
        radius=(Math.sqrt( ( Math.pow((x2-x1),2) + Math.pow( (y2-y1), 2) )  )) /2;
        //System.out.println("r"+radius);
    }
    void findArea(){
        System.out.println("r init"+radius);
        area=((3.14)*(radius*radius));
    }
    void show(){
        super.show();
        System.out.println("The coordinates(x2, y2) are: "+x2+" "+y2);
        System.out.println("Radius: "+radius+"\nArea: "+area);
    }
    
    public void main(){
        System.out.println("Enter the 4 coordinates");
        Scanner nrt=new Scanner(System.in);
        Circle O=new Circle(nrt.nextInt(), nrt.nextInt(), nrt.nextInt(), nrt.nextInt());
        
        O.findRadius();
        O.findArea();
        O.show();
        nrt.close();
    }
}
