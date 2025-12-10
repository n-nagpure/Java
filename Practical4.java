//Write a program in Java that creates an abstract class called Shape. Create subclasses that calculate and displays area of rectangle and triangle.
abstract class AShape{
    int l, b, h, ba;
    abstract int area();
}
class Rectangle extends AShape{
    Rectangle(int x, int y){
        l=x;
        b=y;
    }
    int area(){
        return l*b ;
    }
}
class Traingle extends AShape{
    Traingle(int x, int y){
        h=x;
        ba=y;
    }
    int area(){
        return ((h*ba)*1/2);
    }
}
public class Shape {
    public static void main(String args[]){
        AShape a1=new Rectangle(20, 40);
        System.out.println("Area of Rectangle="+a1.area());
        AShape a2=new Traingle(20, 40);
        System.out.println("Area of Traingle="+a2.area());
    }
}

