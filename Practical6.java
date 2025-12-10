//Write a program to demonstrate multiple inheritance through interface
interface Drawable{
    
    // abstract method
    void draw(); 
}

interface Colorable{
    
    void setColor(String color);
}

class Circle implements Drawable, Colorable{
    
    private String color;

    @Override
    public void draw(){
        
        System.out.println("Drawing a circle");
    }

    @Override
    public void setColor(String color){
        
        this.color = color;
        System.out.println("Circle color set to: " + color);
    }
}

public class TestInterface{
    
    public static void main(String[] args){
        
        Circle c = new Circle();
        c.draw();
        c.setColor("Red");
    }
}
