package TalRan.computer.controller;

import TelRan.computer.model.Computer;
import TelRan.computer.model.Laptop;
import TelRan.computer.model.Smartphone;

public class ComputerAppl {
    public static void main(String[] args) {
        Computer computer = new Computer(" i5 ",
                12, 1024, " pupkin & Co ");
        Laptop laptop = new Laptop(" i7",
                16, 1024, " Asus ",
                4, 2.3);

        computer.display();
        System.out.println();

        laptop.display();
        System.out.println();


        Computer[] shop = new Computer[3];
        shop[0] = new Computer(" i5 ",
                12, 1024, " Pupkin & Co ");
        shop[1] = new Laptop(" i7",
                16, 1024, " Asus ",
                4, 2.3);
        shop[2] = new Smartphone(" Snapdragon",
                8, 256, " Poco",
                18, 0.1, 123456678900L);


        System.out.println("Show brands");
        showBrands(shop);
        if (shop[2] instanceof Smartphone smart1) {
            //Smartphone smart1 = (Smartphone) shop[2];//проверка класса
            System.out.println(smart1.getImei());
        }
        System.out.println("_____Computers____");
        showComputers(shop);
        System.out.println("_______Batterers");
        showHoursOfBattery(shop);
        System.out.println("________________");
        printArray(shop);

        Computer comp = new Computer(" i5 ",
                12, 1024, " Pupkin & Co ");
        System.out.println(shop[0].equals(comp));

    }

    private static void printArray(Computer[] shop) {
        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i]);

        }
    }

    private static void showHoursOfBattery(Computer[] shop) {
        for (int i = 0; i < shop.length; i++) {
            if (shop[i] instanceof Laptop){
                Laptop laptop = (Laptop) shop[i];
                System.out.println(" Brand  " + laptop.getBrand()+
                        " Hours "+ laptop.getHours());
            }

        }
    }


    private static void showComputers(Computer[] shop) {
        for (Computer computer : shop)
            //for ( i = 0, i < shop.length; i++){
            // shop[i].display();
            computer.display();
        System.out.println();
    }


    private static void showBrands(Computer[] shop) {
        for (Computer computer : shop) {
            System.out.print(computer.getBrand());
        }
    }
}


//product - barcode, name, price
//food extends - product : Kosher, expDate
// diary product -(food): type of milk , fat//Meat (food): type of meat
// print statistic - total price / print total kosher prise/print notfood


