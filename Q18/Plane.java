/*
   A line on a plane can be represented by
coordinates of the two end points p1 and p2 as p1(x1, y1)
and p2(x2, y2).
A super class Plane is defined to represent a line and a
subclass Circle to find the length of the radius and the
area of circle by using the required data members of
super class.
Some of the members of both the classes are given
below:

Class name: Plane
Data members/instance variables:
x1: to store the x-coordinate of the first end point. y1:
to store the y-coordinate of the first end point.
Member functions/methods:
Plane(int x, int y): parameterized constructor to assign
the data members x1 = x and y1 = y. void show(): to
display the coordinates.
Class name: Circle
Data members/instance variables:
x2: to store the x-coordinate of the second end point. y2:
to store the y-coordinate of the second end point.
radius: double variable to store the radius of the circle.
area: double variable to store the area of the circle.
Member functions/methods:
Circle(...): parameterized constructor to assign values to
data members of both the classes.
void findRadius(): to calculate the length of radius using
the formula:
(√ ((x2 – x1)2 + (y2 – y1)2)) 
/ 2 assuming that x1, x2, y1,
y2 are the coordinates of the two ends of the diameter
of a circle. void findArea(): to find the area of circle

using formula: πr2. The value of pie (π) is 22 / 7 or
3.14.
void show(): to display both the coordinates along with
the length of the radius and area of the circle. Specify
the class Plane giving details of the constructor and
void show(). Using the concept of inheritance, specify
the class Circle giving details of the constructor, void
findRadius(), void findArea() void show(). Also write the main() function.
   */
  
  
class Plane{
    int x1,y1;
    Plane(int x, int y){
        x1=x;
        y1=y;
    }
    void show(){
        System.out.println("The coordinates(x1, y1) are: "+x1+" "+y1);
    }
}
  
  
