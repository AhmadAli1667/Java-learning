public class Shapetest {
    public static void main(String[] args) {
        // Create an array to hold different shapes both 2D and 3D
        Shape[] shapes = new Shape[6];
        
        shapes[0] = new Circle(5);
        shapes[1] = new Square(4);
        shapes[2] = new Triangle(6, 8);
        shapes[3] = new Sphere(3);
        shapes[4] = new Cube(5);
        shapes[5] = new Tetrahedron(4);
        
        System.out.println("Shape Analysis:\n");
        
        for (Shape shape : shapes) {
            System.out.println("Object: " + shape.getDescription());
            shape.displayDetails(); // printing shape 2d or 3d 
            System.out.println();
        }
    }
}

// Base class for all shapes both 2D and 3D
abstract class Shape {
    public abstract String getDescription();
    // implementing its own way of displaying details
    public abstract void displayDetails();
}

abstract class TwoDimensionalShape extends Shape {
    public abstract double getArea();
    
    // All 2D shapes display their area the same way
    @Override
    public void displayDetails() {
        System.out.println("Type: 2D Shape");
        System.out.println("Area: " + getArea());
    }
}

// Parent class for all 3D shapes like spheres, cubes, etc.
abstract class ThreeDimensionalShape extends Shape {
    public abstract double getArea(); // Surface area for 3D shapes
    public abstract double getVolume();
    
    // All 3D shapes display both surface area and volume
    @Override
    public void displayDetails() {
        System.out.println("Type: 3D Shape");
        System.out.println("Type: 3D Shape");
        System.out.println("Surface Area: " + getArea());
        System.out.println("Volume: " + getVolume());
    }
}




class Circle extends TwoDimensionalShape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String getDescription() {
        return "Circle with radius " + radius;
    }
class Circle extends TwoDimensionalShape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String getDescription() {
        return "Circle with radius " + radius;
    }
class Circle extends TwoDimensionalShape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String getDescription() {
        return "Circle with radius " + radius;
    }
class Circle extends TwoDimensionalShape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String getDescription() {
        return "Circle with radius " + radius;
    }
class Circle extends TwoDimensionalShape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String getDescription() {
        return "Circle with radius " + radius;
    }
class Circle extends TwoDimensionalShape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String getDescription() {
        return "Circle with radius " + radius;
    }
class Circle extends TwoDimensionalShape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String getDescription() {
        return "Circle with radius " + radius;
    }
class Circle extends TwoDimensionalShape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String getDescription() {
        return "Circle with radius " + radius;
    }
class Circle extends TwoDimensionalShape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String getDescription() {
        return "Circle with radius " + radius;
    }
}

class Square extends TwoDimensionalShape {
    private double side;
    private double side;
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double getArea() {
        return side * side;
    }
    
    @Override
    public String getDescription() {
        return "Square with side " + this.side;
    }
}

class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
    
    @Override
    public String getDescription() {
        return "Triangle with base " + this.base + " and height " + this.height;
    }
}

class Sphere extends ThreeDimensionalShape {
    private double radius;
    
    public Sphere(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }
    
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
    
    @Override
    public String getDescription() {
        return "Sphere with radius " + this.radius;
    }
}

class Cube extends ThreeDimensionalShape {
    private double side;
    
    public Cube(double side) {
        this.side = side;
    }
    
    @Override
    public double getArea() {
        return 6 * side * side;
    }
    
    @Override
    public double getVolume() {
        return side * side * side;
    }
    
    @Override
    public String getDescription() {
        return "Cube with side " + this.side;
    }
}

class Tetrahedron extends ThreeDimensionalShape {
    private double edge;
    
    public Tetrahedron(double edge) {
        this.edge = edge;
    }
    
    @Override
    public double getArea() {
        return Math.sqrt(3) * edge * edge;
    }
    
    @Override
    public double getVolume() {
        return (edge * edge * edge) / (6 * Math.sqrt(2));
    }
    
    @Override
    public String getDescription() {
        return "Tetrahedron with edge " + edge;
    }
}
}
}
}
}



