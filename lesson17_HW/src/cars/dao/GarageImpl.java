package cars.dao;

import cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl  implements Garage{
    Car [] cars ;
    int size;

    public GarageImpl ( int capacity){
        cars = new Car[capacity];
    }


    @Override
    public boolean addCar(Car car) {
        if( car == null || size == cars.length){
            return false;
        }
        for (int i = 0; i < size; i++) {
            if( cars [i].getRegNumber().equals(car.getRegNumber())){
                return false;
            }
        }
        cars[size++] = car;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if( cars[i].getRegNumber().equals(regNumber)){
                Car removed = cars[i];
                cars[i] =cars[size-1];
                cars[size- 1] = null;
                size--;
                return removed;
            }
        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if( cars[i].getRegNumber().equals( regNumber)){
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if( cars[i].getModel().equalsIgnoreCase(model)){
                count++;
            }
        }
        if(count == 0) return new Car[0];

        Car [] result = new Car[count];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if( cars[i].getModel().equalsIgnoreCase(model)) {
                result[j++] = cars[i];
            }
        }
        return result;
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(cars[i].getCompany().equalsIgnoreCase(company)){
                count++;
            }
        }
        if(count == 0) return new Car[0];

        Car [] result = new Car[count];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if(cars[i].getCompany().equalsIgnoreCase(company)){
                result[j++] = cars[i];
            }
        }
        return result;
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            double engine = cars[i].getEngine();
            if( engine >= min && engine <= max){
                count++;
            }
        }

        if ( count== 0) return new Car[0];

        Car[] result = new Car[count];
        int j = 0;
        for (int i = 0; i < size; i++) {
            double engine = cars[i].getEngine();
            if( engine >= min && engine <= max) {
                result[j++] = cars[i];
            }
        }
        return result;
    }

    @Override
    public Car[] findCarsByColor(String color) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if( cars[i].getColor().equalsIgnoreCase(color)){
                count++;
            }
        }
        if(count ==0) return new Car[0];

        Car [] result = new Car[count];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if(cars[i].getColor().equalsIgnoreCase(color)){
                result[j++] = cars[i];
            }
        }
        return result;
    }
    private Car[] findCarsByPredicate(Predicate<Car> predicate) {
        // а вот как дальше внятно вставить предикат
        // вместо повтора в методах - нужно еще объяснение))
        //(｡>﹏<｡)
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])){
                count++;
            }
        }
        if(count == 0) return new Car[0];

        Car[] result = new Car[count];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(cars[i])){
                result[j++] = cars[i];
            }

        }
        return result;
    }




}
