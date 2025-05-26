package TelRan.shop.model;

public class MeatProduct extends FoodProduct {
    protected String typeOfMeat;


    public MeatProduct(){};

    public MeatProduct(int barcode, String name, double price,
                       boolean kosher, String expDate,
                       String typeOfMeat) {
        super(barcode, name, price, kosher, expDate);
        this.typeOfMeat = typeOfMeat;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

    @Override
    public String toString() {
        return super.toString()+ " Type of meat: "+ typeOfMeat;

    }
}
