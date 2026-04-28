interface ProductInterface {
    double computeSalePrice();
    double getRegularPrice();
    void setRegularPrice(double regularPrice);
}

interface ElectronicsInterface {
    String getManufacturer();
}


class Product implements ProductInterface {
    private double regularPrice;

    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double computeSalePrice() {
        return regularPrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
}



class Electronics extends Product implements ElectronicsInterface {
    private String manufacturer;

    public Electronics(double regularPrice, String manufacturer) {
        super(regularPrice);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}


class MP3Player extends Electronics {
    private String color;

    public MP3Player(double regularPrice, String manufacturer, String color) {
        super(regularPrice, manufacturer);
        this.color = color;
    }

    @Override
    public double computeSalePrice() {
        return super.getRegularPrice() * 0.9;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class TV extends Electronics {
    private int size;

    public TV(double regularPrice, String manufacturer, int size) {
        super(regularPrice, manufacturer);
        this.size = size;
    }

    @Override
    public double computeSalePrice() {
        return super.getRegularPrice() * 0.8;
    }
}

class Book extends Product {
    private String publisher;
    private int yearPublished;

    public Book(double regularPrice, String publisher, int yearPublished) {
        super(regularPrice);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }

    @Override
    public double computeSalePrice() {
        return super.getRegularPrice() * 0.5;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}