package product.model;

import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private String category;
    private double price;
    private int quantity;

    public Product(String id,
                   String name,
                   String category,
                   double price,
                   int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        final String YELLOW = "\u001B[33m";
        final String RESET = "\u001B[0m";

        return YELLOW + "id: " + RESET + id + ", " +
                YELLOW + "name: " + RESET + name + ", " +
                YELLOW + "category: " + RESET + category + ", " +
                YELLOW + "price: " + RESET + price + ", " +
                YELLOW + "quantity: " + RESET + quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
