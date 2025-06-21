package TelRan.employee.tests;

import TelRan.employee.dao.Company;
import TelRan.employee.dao.CompanyImpl;
import TelRan.employee.model.Employee;
import TelRan.employee.model.Manager;
import TelRan.employee.model.SalesManager;
import TelRan.employee.model.WageEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    Company company;
    Employee [] firm;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        firm = new Employee[4];
        firm[0] = new Manager(1000, "John", "Smith", 180, 20_000, 20);
        firm[1] = new WageEmployee(2000, "Mary", "Smith", 180, 50);
        firm[2] = new SalesManager(3000, "Peter", "Jackson", 180, 100_000, 0.05 );
        firm[3] = new SalesManager(4000, "Tigran", "Petro", 90, 500_000, 0.01 );
        for (int i = 0; i < firm.length; i++) {
            company.addEmployee(firm[i]);

        }
    }

    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(firm[3]));
        Employee employee = new SalesManager(5000, "Andy", "Jackson", 90, 40000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5, company.size());
        employee = new SalesManager(6000, "Andy", "Jackson", 90, 40000, 0.1);
        assertFalse(company.addEmployee(employee));

    }

    @Test
    void removeEmployee() {
        int originalSize = company.size();
        Employee removed = company.removeEmployee(3000);
        assertNotNull(removed);
        assertEquals(originalSize - 1, company.size());

        Employee removeAgain = company.removeEmployee(3000);
        assertNull(removeAgain);

    }

    @Test
    void findEmployee() {
        Employee employee = company.findEmployee(1000);
        assertNotNull(employee);
        assertEquals("John", employee.getFirstName());
        assertEquals(1000, employee.getId());

        assertNull(company.findEmployee(9999));
    }

    @Test
    void totalSalary() {
        double expected  = 0;
        for (int i = 0; i < firm.length; i++) {
            expected += firm[i].calcSalary();
        }
        assertEquals(expected, company.totalSalary(), 0.1);
    }

    @Test
    void averageSalary() {
        double sum = 0;
        for (int i = 0; i < firm.length; i++) {
            sum += firm[i].calcSalary();
        }
        double expected = sum / firm.length;
        assertEquals(expected, company.averageSalary(), 0.1);

    }

    @Test
    void size() {
        int expectedSize = firm.length;
        assertEquals(expectedSize, company.size());
    }

    @Test
    void printEmployees() { // неасилил ＞人＜;) обясните,плиз, на уроке
    }

    @Test
    void totalSales() {
        double expected = 0;
        for (int i = 0; i < firm.length; i++) {
            if( firm[i] instanceof SalesManager )
            {
                SalesManager sm = (SalesManager) firm[i];
                 expected += sm.getSalesValue();
            }
        }
        assertEquals(expected, company.totalSales(), 0.1);
    }
}