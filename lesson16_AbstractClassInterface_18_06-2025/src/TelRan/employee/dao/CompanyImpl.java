package TelRan.employee.dao;

import TelRan.employee.model.Employee;
import TelRan.employee.model.SalesManager;

public class CompanyImpl implements Company{
    Employee[] employees;
    int size;

    public CompanyImpl( int capacity){
        employees = new Employee[capacity];
    }


    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || size == employees.length){
            return false;
        }
        for (int i = 0; i < size; i++) {
            if( employees[i].getId()== employee.getId()){
                return false;
            }
        }
       employees[size++] = employee;
        return true;
    }


    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee removed = employees[i];
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null;
                size--;
                return removed;
            }
        }
        return null;
    }


    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if( employees[i].getId() == id){
                return employees[i];
            }
        }
        return null;
    }


    @Override
    public double totalSalary() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += employees[i].calcSalary();
        }
        return total;
    }


    @Override
    public double averageSalary() {
        if( size == 0){
            return 0;
        }
        double total = totalSalary();
        return total/size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].toString());
        }
    }

    @Override
    public double totalSales() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            if( employees[i] instanceof SalesManager){
                SalesManager sm = (SalesManager) employees[i];
                total += sm.getSalesValue();
            }
        }
        return total;
    }


}
