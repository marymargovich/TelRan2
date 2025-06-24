package cars.model;

import java.util.Objects;

public class Car {

    protected final String regNumber;
    protected String model;
    protected String company;
    protected double engine;
    protected  String color;

    public Car(String regNumber,
               String model,
               String company,
               double engine,
               String color) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final String CYAN = "\u001B[36m";   // цвет для названий полей
        final String RESET = "\u001B[0m";   // цвет для данных (обычный белый)

        return CYAN + "RegNumber: " + RESET + regNumber + ", " +
                CYAN + "Model: " + RESET + model + ", " +
                CYAN + "Company: " + RESET + company + ", " +
                CYAN + "Engine: " + RESET + engine + ", " +
                CYAN + "Color: " + RESET + color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car cars = (Car) o;
        return Objects.equals(regNumber, cars.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(regNumber);
    }
}
