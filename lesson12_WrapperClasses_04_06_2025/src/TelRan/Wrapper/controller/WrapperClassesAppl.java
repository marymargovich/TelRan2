package TelRan.Wrapper.controller;

public class WrapperClassesAppl {
    public static void main(String[] args) {
        int x  = 10;
        Integer y = 20;
        System.out.println(x);
        System.out.println(y);
        y = y + 5;
        System.out.println(y.toString());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        String str1 = Integer.toString(x);// делает строку
        System.out.println(str1);
        str1  = "100500";//парс работает только в рамках заданного примитива
        x = Integer.parseInt(str1);
        System.out.println(x);
        String str2 = "3.1415";
        double pi = Double.parseDouble(str2);
        System.out.println(pi);

        Boolean check = Boolean.parseBoolean("TRue");// true/false
        System.out.println(check);
        str1 = "TRue";
        Boolean check1 = Boolean.parseBoolean(str1);
        System.out.println(check1);

        double a = 20 /0.0;
        if (Double.isNaN(a) || Double.isInfinite(a)){
            System.out.println("WRONG result");
        } else {
            System.out.println(a);
        }








    }
}

// primitive - Class называются так же как примитивы
// char -> Character

// статичные методы класса -

// из строки к примитиву и наоборот
//интерфейсы?