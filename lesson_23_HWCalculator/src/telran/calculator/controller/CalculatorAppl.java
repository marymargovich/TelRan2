package telran.calculator.controller;

import telran.calculator.model.Operation;

import java.util.Scanner;

public class CalculatorAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Please enter first number: ");
//        int a = scanner.nextInt();
//
//        System.out.print("Please enter second number: ");
//        int b = scanner.nextInt();
//
//        System.out.print("Please choose operation: AND, OR, XOR, NOT, SHIFT_LEFT, SHIFT_RIGHT," +
//                " UNSIGNED_SHIFT_RIGHT ");
//        String operation = scanner.next().toUpperCase();

        int a = readInt(scanner, "Please enter first number: ");
        int b = readInt(scanner, "Please enter second number: ");
        Operation operation1 = readOperation(scanner);

        System.out.println("a = " + a +"\nb = " + b + "\noperation " + operation1+"\n" );

        int result = operation1.apply(a, b);

        System.out.println("result: "+ result);
        System.out.println("Binary:  "+ Integer.toBinaryString(result));
    }

        private static int readInt(Scanner scanner, String prompt){
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("\u001B[31mInvalid number, please try again\u001B[0m");
                scanner.next();
                }
            }
        }


        private static Operation readOperation( Scanner scanner){
        while (true){
            System.out.println("Please choose operation: \n (AND, OR, XOR, NOT, " +
                    "SHIFT_LEFT, SHIFT_RIGHT, UNSIGNED_SHIFT_RIGHT):");
            String input = scanner.next().trim().toUpperCase();

            for (int i = 0; i < Operation.values().length; i++) {
                if(Operation.values()[i].name().equals(input)){
                    return Operation.values()[i];
                }
            }
            System.out.println("\u001B[31mInvalid operation, please try again.\u001B[0m");

        }
    }


}
