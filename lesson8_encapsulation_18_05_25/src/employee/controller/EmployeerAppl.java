package employee.controller;
import employee.model.Employee;
public class EmployeerAppl {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1000," Peter",
                10000, 2.25, " man");
        emp1.display();
        Employee emp2 = new Employee(1001, "Mart",
                12000, 3.4, "female");
        emp2.display();
        System.out.println(emp1.calcTaxIsrael());
        System.out.println(emp2.calcTaxIsrael());
        System.out.println(Employee.salaryNetto(emp1.getSalary(),
                emp1.calcTaxIsrael()));
        System.out.println(Employee.salaryNetto(emp2.getSalary(),
                emp2.calcTaxIsrael()));
        emp1.setSalary(15_000);
        System.out.println(emp1.calcTaxIsrael());
        emp1.setSalary(8000);
        System.out.println(emp1.calcTaxIsrael());
        System.out.println("Salary "+ emp1.getSalary());
        Employee emp3 = new Employee(2000, "Mary", 12000, 2.75,"female");
        double totalTax = emp1.calcTaxIsrael()+ emp3.calcTaxIsrael();
        System.out.println("Total tax = "+ totalTax);
        System.out.println( "Total Salary "+ Employee.salaryNetto
                (emp1.getSalary() + emp3.getSalary(),totalTax));



    }


}
