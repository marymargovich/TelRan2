package TelRun.equation.model;

public class QuadraticEquation {
private double a;
private  double b;
private double c;

    public QuadraticEquation(){}

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }


    public void setA(double a) {
        this.a = a;
    }


    public double getB() {
        return b;
    }


    public void setB(double b) {
        this.b = b;
    }


    public double getC() {
        return c;
    }


    public void setC(double c) {
        this.c = c;
    }


    public void display(){
        System.out.println(this.a + "x^2 + " + this.b + "x + " + this.c + " = 0");
        System.out.print(this.a + "x^2");

        if (this.b > 0) {
            System.out.print(" + " + this.b + "x");
        } else if (this.b < 0) {
            System.out.print(" - " + (-this.b) + "x");
        }

        if (this.c > 0) {
            System.out.print(" + " + this.c);
        } else if (this.c < 0) {
            System.out.print(" - " + (-this.c));
        }

        System.out.println(" = 0");
    }



    public String delta() {
        double D = b * b - 4 * a * c;
        return  String.valueOf(D);
    }

    private double deltaDouble() {
        return b * b - 4 * a * c;
    }


    public String quantityRoots() {
        double D = deltaDouble();
        if (D > 0) {
            return "2 roots";
        } else if (D == 0) {
            return "1 root";
        } else {
            return "0 root";
        }
    }



    public double[] getRoots() {
        if (a == 0) {
            if (b != 0) {
                return new double[]{ -c / b };
            } else {
                return new double[]{};
            }
        }

        double D = deltaDouble();

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            return new double[]{ x1, x2 };
        } else if (D == 0) {
            double x = -b / (2 * a);
            return new double[]{ x };
        } else {
            return new double[]{};
        }
    }
}
