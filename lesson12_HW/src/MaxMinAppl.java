

public static void main(String[] args) {
    System.out.println("______minimal/maximal values of the primitive types________");

    System.out.println("byte:    " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
    System.out.println("short:   " + Short.MIN_VALUE + "  to " + Short.MAX_VALUE);
    System.out.println("int:     " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
    System.out.println("long:    " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
    System.out.println("float:   " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
    System.out.println("double:  " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
    System.out.println("char:    " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);


    System.out.println("___________HW __________");

    if (args.length == 0) {
        printTypeInfo("byte");
        printTypeInfo("short");
        printTypeInfo("int");
        printTypeInfo("long");
        printTypeInfo("char");
        printTypeInfo("float");
        printTypeInfo("double");
    } else {
        //      for (int i = 0; i < args.length; i++) {
        //    printTypeInfo(args[i]);
        //}
        for (String type : args) {
            printTypeInfo(type);
        }
    }
}


private static void printTypeInfo(String type) {
    String result;

    switch (type.toLowerCase()) {
        case "byte":
            result = "byte:    " + Byte.MIN_VALUE + " up to " + Byte.MAX_VALUE;
            break;
        case "short":
            result = "short:   " + Short.MIN_VALUE + " up to " + Short.MAX_VALUE;
            break;
        case "int":
            result = "int:     " + Integer.MIN_VALUE + " up to " + Integer.MAX_VALUE;
            break;
        case "long":
            result = "long:    " + Long.MIN_VALUE + " up  to " + Long.MAX_VALUE;
            break;
        case "float":
            result = "float:   " + Float.MIN_VALUE + " up to " + Float.MAX_VALUE;
            break;
        case "double":
            result = "double:  " + Double.MIN_VALUE + " up to " + Double.MAX_VALUE;
            break;
        case "char":
            result = "char:    " + (int) Character.MIN_VALUE + " up to " + (int) Character.MAX_VALUE;
            break;
        default:
            result = "WRONG type: " + type;
    }
    System.out.println(result);
}

// проверка