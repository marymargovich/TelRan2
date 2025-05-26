package TelRan.shop.model;

public class Product {
    protected int barcode;
    protected String name;
    protected double price;

    public Product() {};

    public Product(int barcode, String name, double price) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " Barcode: " + barcode+
                " Name: " + name +
                " Price: " + price+ " NIS";

    }
}
