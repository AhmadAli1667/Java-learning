interface ProductInterface {
    public double computeSalePrice();
    public double getRegularPrice();
    public void setRegularPrice(double regularPrice);
}

interface ElectronicsInterface {
    public String getManufacturer();
}

class Product implements ProductInterface {
    private double regularPrice;
    public Product(double regularPrice) { this.regularPrice = regularPrice; }
    public double computeSalePrice() { return regularPrice * 0.9; } // gets 10% off the regular price
    public double getRegularPrice() { return regularPrice; } // this is getting the regular price
    public void setRegularPrice(double regularPrice) { this.regularPrice = regularPrice; } // we're setting a new regular price here
}

class Electronics extends Product implements ElectronicsInterface {
    private String manufacturer;
    public Electronics(double regularPrice, String manufacturer) { super(regularPrice); this.manufacturer = manufacturer; }
    public String getManufacturer() { return manufacturer; } // this gets the manufacturer name
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; } // we're setting the manufacturer
}

class Book extends Product {
    private String publisher;
    private int yearPublished;
    public Book(double regularPrice, String publisher, int yearPublished) { super(regularPrice); this.publisher = publisher; this.yearPublished = yearPublished; }
    public double computeSalePrice() { return getRegularPrice() * 0.5; } // books get a bigger discount, 50% off
    public String getPublisher() { return publisher; } // getting the publisher
    public void setPublisher(String publisher) { this.publisher = publisher; } // we're setting the publisher name
    public int getYearPublished() { return yearPublished; } // this gets the year it was published
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; } // setting the year published
}

class MP3Player extends Electronics {
    private String color;
    public MP3Player(double regularPrice, String manufacturer, String color) { super(regularPrice, manufacturer); this.color = color; }
    public double computeSalePrice() { return getRegularPrice() * 0.7; } // mp3 players get 30% off
    public String getColor() { return color; } // this gets the color
    public void setColor(String color) { this.color = color; } // we're setting the color here
}

class TV extends Electronics {
    private int size;
    public TV(double regularPrice, String manufacturer, int size) { super(regularPrice, manufacturer); this.size = size; }
    public double computeSalePrice() { return getRegularPrice() * 0.8; } // televisions get 20% off
}

public class Mains {
    public Mains() {}
    public static void main(String[] args) {
        ProductInterface[] pa = new Product[5]; // we're creating an array to hold 5 products
        pa[0] = new TV(1000, "Samsung", 30); // here's a Samsung tv, costs 1000, size 30 inches
        pa[1] = new TV(2000, "Sony", 50); // another tv, Sony brand, 2000 dollars, 50 inches
        pa[2] = new MP3Player(250, "Apple", "blue"); // an mp3 player by Apple, blue color, 250 bucks
        pa[3] = new Book(34, "Sun press", 1992); // a book from Sun press, published 1992, costs 34
        pa[4] = new Book(15, "Korea press", 1986); // another book, Korea press, 1986, 15 dollars

        double totalRegularPrice = 0;
        double totalSalePrice = 0;

        for (int i = 0; i < pa.length; i++) { // looping through each product
            totalRegularPrice += pa[i].getRegularPrice(); // adding up all the regular prices
            totalSalePrice += pa[i].computeSalePrice(); // adding up all the sale prices
            System.out.println("Item number " + i +
                ": Type = " + pa[i].getClass().getName() +
                ", Regular price = " + pa[i].getRegularPrice() +
                ", Sale price = " + pa[i].computeSalePrice()); // printing out each item's details
        }
        System.out.println("totalRegularPrice = " + totalRegularPrice); // showing the total without discounts
        System.out.println("totalSalePrice = " + totalSalePrice); // showing the total with all discounts applied
    }
}