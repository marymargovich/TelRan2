package TelRan.shop.controller;

import TelRan.shop.model.DairyProduct;
import TelRan.shop.model.FoodProduct;
import TelRan.shop.model.MeatProduct;
import TelRan.shop.model.Product;

public class ProductAppl {
    public static void main(String[] args) {

        Product []shop = {
                new Product(100010, "Ein Gedi Reusable Water Bottle 750ml", 18.00),
                new FoodProduct(200011, "Strawberries from Ramat HaGolan", 12.90, true, "2025-03-15"),
                new DairyProduct(300012, "Tnuva Whole Milk", 6.20, true, "2025-12-01", "Cow", 3.0),
                new MeatProduct(400004, "Merguez Sausages", 22.00, true, "2025-11-10", "Lamb"),

                new Product(100011, "Negev Desert Travel Mug", 22.50),
                new Product(100012, "Carmel Market Eco Shopping Bag", 12.00),

                new FoodProduct(200012, "Galilee Cherry Tomatoes", 8.90, true, "2025-03-10"),
                new FoodProduct(200013, "Carmel Valley Pomegranates", 14.30, true, "2025-10-01"),

                new DairyProduct(300013, "Shtarkman Sheep Yogurt", 13.40, true, "2025-06-01", "Sheep", 4.2),
                new DairyProduct(300014, "Goat Labneh with Za'atar", 15.80, true, "2025-07-15", "Goat", 9.5),

                new MeatProduct(400005, "Grilled Chicken Pargiyot", 24.90, true, "2025-08-25", "Chicken"),
                new MeatProduct(400006, "Beef Kebab Skewers", 26.50, true, "2025-09-20", "Beef"),

                new FoodProduct(200014, "Imported Bacon-Wrapped Dates", 16.90, false, "2025-04-01"),
                new DairyProduct(300015, "French Cow Brie (non-kosher)", 19.90, false, "2025-08-20", "Cow", 28.0),
                new MeatProduct(400007, "Pork Sausages (Non-Kosher)", 21.00, false, "2025-07-30", "Pork")
        };

        System.out.println("_______All goods ________");
        printProductShop(shop);
        System.out.println();

        System.out.println("______Total price ________");
        printTotalPrice(shop);
        System.out.println();


        System.out.println(" ________Total Kosher Price________");
        printKosherTotalPrice(shop);
        System.out.println();

        System.out.println("__________NOT FOOD product__________");
        printNotFoodProducts(shop);
        System.out.println();


    }

    public static void printNotFoodProducts(Product[] shop) {
        for (int i = 0; i < shop.length; i++) {
            Product product = shop[i];

            boolean isFoodProduct = product instanceof FoodProduct;

            if (!isFoodProduct) {
                System.out.println(product);

            }
        }
    }

    public static void printKosherTotalPrice(Product[] shop) {
        double totalKosherPrice = 0.0;

        for (int i = 0; i < shop.length; i++) {
            Product product = shop[i];
            String green = "\u001B[32m";
            String reset = "\u001B[0m";

            if (product instanceof FoodProduct food) {
                if (food.isKosher()) {
                    System.out.println("Name: " + food.getName() + ", Price: " + food.getPrice()+ " NIS " + " " + green + "Kosher" + reset);
                    totalKosherPrice += food.getPrice();
                }
            }
        }
        System.out.printf("Total price of kosher products:  %.2f NIS%n", totalKosherPrice);
    }


    public static void printTotalPrice(Product[] shop) {
        double total = 0.0;

        System.out.println("All products with prices:");

        for (int i = 0; i < shop.length; i++) {
            Product product = shop[i];
            System.out.printf("Name: %s, Price: %.2f NIS%n", product.getName(), product.getPrice());
            total += product.getPrice();
        }

        System.out.printf("Total price of all products: %.2f NIS%n", total);
    }

    private static void printProductShop(Product[] shop) {
        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i]);

        }
    }

}

//product - barcode, name, price
//food extends - product : Kosher, expDate
// diary product -(food): type of milk , fat//Meat (food): type of meat
// print statistic - total price / print total kosher prise/print notfood


