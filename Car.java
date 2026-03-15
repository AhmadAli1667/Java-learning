/**
 * This program demonstrates how documentation comments work in Java.
 * It creates a Car object and displays its speed.
 * @author Student
 * @version 1.0
 */
public class Car {

    /** Variable to store the speed of the car */
    int speed;

    /**
     * Constructor used to initialize the speed of the car.
     * @param s the speed value given when creating the object
     */
    public Car(int s) {
        speed = s;
    }

    /**
     * This method displays the speed of the car.
     * @return nothing
     */
    public void display() {
        System.out.println("The speed of the car is: " + speed);
    }

    /**
     * Main method where program execution starts.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        /** Creating an object of Car class */
        Car c1 = new Car(80);

        /** Calling the display method */
        c1.display();
    }
}