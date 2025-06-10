package TelRan.Wrapper.controller;

public class CalculatorAppl {

    public static void main(String[] args) {
        if( args.length != 3){
            System.out.println("Wrong number arguments");
            return;
        }

        double a = Double.parseDouble(args[0]);
        char oper = args[1].charAt(0);//возвращает символ по укказаному индексу
        double b = Double.parseDouble(args[2]);
        double res = calculator(a, oper, b);
        System.out.println("result = "+ res);



    }
    public static double calculator (double a, char oper, double b){
        switch (oper){
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0.;
        }
    }

}
//строка - это набор чаров - массив чар - у строки
//можно взять каждый чар по отдельности