package TelRan.shop.model;

public class DairyProduct extends FoodProduct {
    protected String typeOfMilk;
    private double fat;


    public DairyProduct(){};


    public DairyProduct(int barcode, String name,
                        double price, boolean kosher,
                        String expDate, String typeOfMilk,
                        double fat) {
        super(barcode, name, price, kosher, expDate);
        this.typeOfMilk = typeOfMilk;
        this.fat = fat;
    }


    public String getTypeOfMilk() {
        return typeOfMilk;
    }

    public void setTypeOfMilk(String typeOfMilk) {
        this.typeOfMilk = typeOfMilk;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }


    @Override
    public String toString() {
        return super.toString()+ " Type of Milk: "+ typeOfMilk
                + " Fat: " + fat;
    }
}
