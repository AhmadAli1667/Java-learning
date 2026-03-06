package Labs.LABS;
abstract class Shape {
  String color;
    Shape(String c) 
    { this.color = c; }
    abstract double area();
    void describe()
     {
        System.out.println(color + " shape | Area: " + area());
    }
}

class Circle extends Shape {
    double r;
    Circle(String c, double r) { super(c); this.r = r; }//saves color as red and rad as 5
    public double area() 
    { return 3.14 * r * r; }
}

class Square extends Shape {
    double side;
    Square(String c, double s) 
    { super(c); this.side = s; }//saves color as blue and side as 4
    public double area() { return side * side; }
    void describe() {
        System.out.println("Square: " + side + "x" + side);
        super.describe();
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(String c, double b, double h)
     { super(c); base=b; height=h; }//saves color "Green", b=6,h= 3
    public double area() { return 0.5 * base * height; }
}

class Pentagon extends Shape//creating pentagon classes 
 {
    double side;
    Pentagon(String c, double s)//making constriuctor
     { 
        super(c); side=s; 
    }//saves color "Green", b=6,h= 3
    public double area() 
    { 
        return ((Math.pow(side, 2) * Math.sqrt(5*(5 + 2* Math.sqrt(5)))) / 4);
     }
}

public class DrawBoard_ass {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Red", 5),
            new Square("Blue", 4),
            new Triangle("Green", 6, 3),
            new Pentagon("Orange",5)
        };
        for (Shape s : shapes) {
            s.describe();
        }
        System.out.println("Total shapes: " + shapes.length);
    }
}
class ShapeCalculator
{
    void printArea(Shape s)
    {
        System.out.println("Area of shape: "+s.area());
    }
    void printArea(Shape s, String unit)
    {  
        System.out.println( "Area of shape: "+s.area()+ unit);
    }
    void printArea(Shape[] arr)
    {
        for(Shape s: arr)//calling for loop
            {
                System.out.println("Area of shape: "+s.area());
            }
    }
    public static void main(String[] args) {
             ShapeCalculator calc = new ShapeCalculator();

        Shape c = new Circle("Red", 5);
        Shape p = new Pentagon("Yellow", 3);

        Shape[] shapes = {//creating object array
            c,
            new Square("Blue", 4),
            new Triangle("Green", 6, 3),
            p
        };

        calc.printArea(c);                 //calling functions
        calc.printArea(p, "sq.units");   
        calc.printArea(shapes);  
    }
}
