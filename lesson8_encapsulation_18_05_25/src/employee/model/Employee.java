package employee.model;



public class Employee {
    private double salary;
    private double taxLowrance;
    private String gender;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTaxLowrance() {
        return taxLowrance;
    }

    public void setTaxLowrance(double taxLowrance) {
        this.taxLowrance = taxLowrance;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if ( this.salary < salary){
        this.salary = salary;
        }
    }


    public Employee( int id, String name,
                     double salary, double taxLowrance,
                     String gender){
        this.id = id;
        this.name = name;
        this.taxLowrance = taxLowrance;
        this.salary = salary;
        this.gender = gender;
    }


    public void display(){
        System.out.println(" Id " + id + " Name "+ name
                + " Salary "+ salary+ " Gender "+ gender
                + " Tax "+ taxLowrance );
    }


    public double calcTaxIsrael(){
        double[] levels = {0, 7010,10060, 16150, 22440, 46690, 60130};
        double[] rates = {0.1, 0.14, 0.2, 0.31, 0.35, 0.47, 0.5};
        double res = -(taxLowrance * 223);
        for (int i = 0; i < levels.length - 1; i++) {
            if (salary > levels[i] && salary <= levels[i + 1]){
                res = res +(salary - levels[i])* rates[i];
                return res < 0? 0: res;
            }else{
                res = res + ( levels[i+1] - levels[i])* rates[i];
            }
        }
        res = res +( salary - levels[levels.length -1])* rates[rates.length - 1];
        return res < 0? 0:res;
    }


    public static double salaryNetto( double salary, double tax){
        return salary - tax;
    }

}

// Static - class не относятся к объекту - не доступен this.
// может работать с другими статичными методами
// Non-static - object - нужно передать параметры для объекта
// private - в пределах класса
//public - доступ везде
// private - доступен только внутри класса
//protected - private-package + подклассы
// default (private-package) - внутри класса и
 // пакета