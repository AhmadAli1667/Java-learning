import java.util.ArrayList;
import java.util.Scanner;

interface Food {

    void browse();
    void place_order();
    void total_cost();
    void delivery_time();
    void recieve_details();
}

class Pizza implements Food {
    double std_cost;
    int time;
    String details;
    String menu = "Pepperoni\nSteak Pizza\nFajita";
    Pizza(double std_cost, int time, String details) {
        this.std_cost = std_cost;
        this.time = time;
        this.details = details;
    }

    public void browse() {
        System.out.println("Pizza menu:\n" + menu);
    }

    public void place_order() {
        System.out.println("Pizza order placed");
    }

    public void total_cost() {
        System.out.println("Total cost: " + std_cost);
    }

    public void delivery_time() {
        System.out.println("Delivery time: " + time + " minutes");
    }

    public void recieve_details() {
        System.out.println("Details: " + details);
    }
}

class Burger implements Food {
    double std_cost;
    int time;
    String details;
    String menu = "Zinger\nBeef Burger\nChicken Cheese";

    Burger(double std_cost, int time, String details) {
        this.std_cost = std_cost;
        this.time = time;
        this.details = details;
    }

    public void browse() {
        System.out.println("Burger menu:\n" + menu);
    }

    public void place_order() {
        System.out.println("Burger order placed");
    }

    public void total_cost() {
        System.out.println("Total cost: " + std_cost);
    }

    public void delivery_time() {
        System.out.println("Delivery time: " + time + " minutes");
    }

    public void recieve_details() {
        System.out.println("Details: " + details);
    }
}

class Sushi implements Food {
    double std_cost;
    int time;
    String details;
    String menu = "Nigiri\nMaki\nSashimi";

    Sushi(double std_cost, int time, String details) {
        this.std_cost = std_cost;
        this.time = time;
        this.details = details;
    }

    public void browse() {
        System.out.println("Sushi menu:\n" + menu);
    }

    public void place_order() {
        System.out.println("Sushi order placed");
    }

    public void total_cost() {
        System.out.println("Total cost: " + std_cost);
    }

    public void delivery_time() {
        System.out.println("Delivery time: " + time + " minutes");
    }

    public void recieve_details() {
        System.out.println("Details: " + details);
    }
}

public class p1 {
    static ArrayList<Food> restaurants = new ArrayList<Food>();
    static ArrayList<String> restaurantNames = new ArrayList<String>();

    static void showRestaurants() {
        if (restaurants.size() == 0) {
            System.out.println("No restaurants available");
            return;
        }
        System.out.println("Restaurants:");
        for (int i = 0; i < restaurantNames.size(); i++) {
            System.out.println((i + 1) + " - " + restaurantNames.get(i));
        }
    }

    static void runRestaurant(Food restaurant) {
        restaurant.browse();
        restaurant.place_order();
        restaurant.total_cost();
        restaurant.delivery_time();
        restaurant.recieve_details();
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        restaurants.add(new Pizza(1200, 30, "Pepperoni pizza"));
        restaurantNames.add("Pizza");

        restaurants.add(new Burger(800, 20, "Chicken burger meal"));
        restaurantNames.add("Burger");

        restaurants.add(new Sushi(1800, 45, "Salmon sushi box"));
        restaurantNames.add("Sushi");

        showRestaurants();

        while (true) {
            System.out.println("1 View Restaurants");
            System.out.println("2 Choose Restaurant");
            System.out.println("3 Add Restaurant");
            System.out.println("4 Exit");
            int option = scan.nextInt();

            if (option == 1) {
                showRestaurants();
            } else if (option == 2) {
                System.out.println("Enter restaurant index:");
                int index = scan.nextInt();
                if (index >= 1 && index <= restaurants.size()) {
                    runRestaurant(restaurants.get(index - 1));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (option == 3) {
                System.out.println("1 Pizza");
                System.out.println("2 Burger");
                System.out.println("3 Sushi");
                System.out.println("Select type:");
                int type = scan.nextInt();
                System.out.println("Enter std_cost:");
                double std_cost = scan.nextDouble();
                System.out.println("Enter time:");
                int time = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter details:");
                String details = scan.nextLine();

                switch (type) {
                    case 1:
                        restaurants.add(new Pizza(std_cost, time, details));
                        restaurantNames.add("Pizza");
                        break;
                    case 2:
                        restaurants.add(new Burger(std_cost, time, details));
                        restaurantNames.add("Burger");
                        break;
                    case 3:
                        restaurants.add(new Sushi(std_cost, time, details));
                        restaurantNames.add("Sushi");
                        break;
                    default:
                        System.out.println("Invalid type");
                        break;
                }
                showRestaurants();
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid option");
            }
        }

        scan.close();
    }
}
