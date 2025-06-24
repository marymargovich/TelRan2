package cars.tests;

import static org.junit.jupiter.api.Assertions.*;

import cars.dao.Garage;
import cars.dao.GarageImpl;
import cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;


class GarageITest {

    Garage garage;
    Car[]  fleet;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(15);
        fleet = new Car[]{
                new Car("AA111AA", "Model S", "Tesla", 0.0, "Red"),           // Tesla, Red, 0.0
                new Car("BB222BB", "Mustang GT", "Ford", 5.0, "Blue"),        // Ford, Blue, 5.0
                new Car("CC333CC", "Model S", "Tesla", 0.0, "White"),         // Tesla, White, 0.0
                new Car("DD444DD", "Civic", "Honda", 1.8, "Black"),           // Honda, Black, 1.8
                new Car("EE555EE", "911", "Porsche", 3.0, "Red"),             // Porsche, Red, 3.0
                new Car("FF666FF", "Mustang GT", "Ford", 5.0, "Green"),       // Ford, Green, 5.0
                new Car("GG777GG", "Civic", "Honda", 1.8, "Blue"),            // Honda, Blue, 1.8
                new Car("HH888HH", "Model X", "Tesla", 3.0, "White"),         // Tesla, White, 3.0
                new Car("II999II", "911", "Porsche", 3.0, "Black"),           // Porsche, Black, 3.0
                new Car("JJ000JJ", "Camry", "Toyota", 2.5, "Silver")
        };
        for (int i = 0; i < fleet.length; i++) {
            garage.addCar(fleet[i]);
        }
    }


    @Test
    void addCar() {
        assertFalse(garage.addCar(fleet[4]));

        Car car = new Car("ZZ999ZZ", "Golf GTI", "Volkswagen", 2.0, "Red");
        assertTrue(garage.addCar(car));
        assertEquals(11,garage.size());

        Car duplicate = new Car("ZZ999ZZ", "Golf GTI", "Volkswagen", 2.0, "Red");
        assertFalse(garage.addCar(duplicate));

        assertFalse(garage.addCar(null));

        garage.addCar(new Car("XX111XX", "A", "B", 1.0, "Gray"));
        garage.addCar(new Car("XX222XX", "A", "B", 1.0, "Gray"));
        garage.addCar(new Car("XX333XX", "A", "B", 1.0, "Gray"));
        garage.addCar(new Car("XX444XX", "A", "B", 1.0, "Gray"));
        assertEquals(15, garage.size());

        assertFalse(garage.addCar(new Car("FULL01", "Overflow", "OverflowInc", 2.0, "Black")));
    }


    @Test
    void removeCar() {
        int originalSize = garage.size();

        Car removed = garage.removeCar("EE555EE");
        assertNotNull(removed);
        assertEquals(originalSize-1, garage.size());


        Car removeAgain = garage.removeCar("EE555EE");
        assertNull(removeAgain);
    }


    @Test
    void findCarByRegNumber() {
        Car car = garage.findCarByRegNumber("AA111AA");
        assertNotNull(car);
        assertEquals("Tesla", car.getCompany());
        assertEquals("AA111AA", car.getRegNumber());

        assertNull(garage.findCarByRegNumber("Not Exist"));
    }


    @Test
    void findCarsByModel() {
        Car [] expected = {
                fleet[0],
                fleet[2]
        };

        Car [] modelSCars = garage.findCarsByModel("Model S");
        assertNotNull(modelSCars);
        assertEquals(expected.length, modelSCars.length);
        assertArrayEquals(expected, modelSCars);
        printCars(modelSCars);


        Car[] noCars = garage.findCarsByModel("NonExistentModel");
        assertNotNull(noCars);
        assertEquals(0, noCars.length);

    }


    @Test
    void findCarsByCompany() {
        Car[] expected = {
                fleet[0], // Tesla
                fleet[2], // Tesla
                fleet[7]  // Tesla
        };

        Car[] teslaCars = garage.findCarsByCompany("Tesla");
        assertNotNull(teslaCars);
        assertEquals(expected.length, teslaCars.length);
        assertArrayEquals(expected, teslaCars);

        printCars(teslaCars);

        Car[] noCars = garage.findCarsByCompany("NonExistentCompany");
        assertNotNull(noCars);
        assertEquals(0, noCars.length);
    }


    @Test
    void findCarsByEngine() {
        Car[] expected = {
                fleet[0], // 0.0
                fleet[2]  // 0.0
        };

        Car [] smallEngines = garage.findCarsByEngine(0.0, 1.0);
        assertNotNull(smallEngines);
        assertEquals(expected.length, smallEngines.length);
        assertArrayEquals(expected, smallEngines);

        printCars(smallEngines);


        Car [] noCars = garage.findCarsByEngine(10.0, 20.0);
        assertNotNull(noCars);
        assertEquals(0, noCars.length);

    }


    @Test
    void findCarsByColor() {
        Car[] expected = {
                fleet[0], // Red
                fleet[4]  // Red
        };

        Car [] redCars = garage.findCarsByColor("Red");
        assertNotNull(redCars);
        assertEquals(expected.length, redCars.length);
        assertArrayEquals(expected, redCars);

        printCars(redCars);

        Car [] noCars = garage.findCarsByColor("Invisible");
        assertNotNull(noCars);
        assertEquals(0, noCars.length);
    }

    private void printCars(Car[] cars) {
        System.out.println("=== Cars found: " + cars.length + " ===");
        for (Car car : cars) {
            System.out.println(car.toString());
            System.out.println("----------");
        }
        System.out.println("============================\n");
    }

}