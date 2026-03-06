package Geometric;
import java.util.Date;
public class GeometricObject {
    private String color="white";   //defining data members
    private boolean filled=false;
    private Date dateCreated;

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + 
               " and filled: " + filled;
    }

    public GeometricObject() {//constructor everytime made
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled)//super function
     {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() //getter setters
    { return color; }
    public void setColor(String color)
     { this.color = color; }

    public boolean isFilled() 
    { return filled; }
    public void setFilled(boolean filled)
     { this.filled = filled; }

    public Date getDateCreated() 
    { return dateCreated; }
}

