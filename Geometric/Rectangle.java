package Geometric;
public class Rectangle extends GeometricObject{
double width,height;//default double values
    public Rectangle(){
        //Creating rectangle
        this.width=1.0;
        this.height=1.0;
    }
    public Rectangle(double height, double width){
        //Creating rectangle with passed data
        this.width=width;
        this.height=height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled); // Calls the parent constructor
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return (this.height*this.width);      //Returning area of rectangle   
    }
    public double getPerimeter(){
        return 2*(this.height+this.width);      //Returning paremeter of rectangle   
    }
    @Override
    public String toString(){//override
        return "Rectangle: width = " + this.width + " height = " + this.height;//Returning description of rectangle   
    }
    
}
