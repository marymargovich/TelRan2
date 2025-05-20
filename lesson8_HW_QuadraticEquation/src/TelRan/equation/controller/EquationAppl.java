package TelRan.equation.controller;


import TelRun.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        System.out.println("___________Quadratic Equation 1____");


        QuadraticEquation eq = new QuadraticEquation(2, -4, -6);
        eq.display();
        System.out.println("Delta = " + eq.delta());
        System.out.println("Number of roots = " + eq.quantityRoots());


        double[] roots = eq.getRoots();
        for (int i = 0; i < roots.length; i++) {
            System.out.println("root[" + (i + 1) + "] =" + roots[i]);
        }
        System.out.println();
        System.out.println("___________Quadratic Equation 2____");


        QuadraticEquation eq1 = new QuadraticEquation(5, 0, 1);
        eq1.display();
        System.out.println("Delta = " + eq1.delta());
        System.out.println("Number of roots = " + eq1.quantityRoots());


        roots = eq1.getRoots();
        for (int i = 0; i < roots.length; i++) {
            System.out.println("root[" + (i + 1) + "] =" + roots[i]);
        }
    }
}

