package TelRan.shop.model;

public class FoodProduct extends Product{
    protected boolean Kosher;
    protected String expDate;


    public FoodProduct(){};

    public FoodProduct(int barcode, String name, double price,
                       boolean kosher, String expDate) {
        super(barcode, name, price);
        Kosher = kosher;
        this.expDate = expDate;
    }

    public boolean isKosher() {
        return Kosher;
    }

    public void setKosher(boolean kosher) {
        Kosher = kosher;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        String green = "\u001B[32m";
        String red = "\u001B[31m";
        String reset = "\u001B[0m";

        String result = super.toString();
        result += ", " + (Kosher ? green + "Kosher" : red + "Not Kosher") + reset;
        result += ", expDate: " + expDate;
        return result;
        }

    }
