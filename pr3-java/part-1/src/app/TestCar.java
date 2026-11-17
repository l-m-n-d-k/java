package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "A123BC", "Red", 2015, "Ivan Ivanov", "INS-0001");
        ElectricCar tesla = new ElectricCar("Tesla", "E777KX", "White", 2022, "Anna Smirnova", "INS-2002", 75.0);

        Car defaultCar = new Car();
        ElectricCar defaultElectric = new ElectricCar();

        System.out.println(car);
        System.out.println(tesla);
        System.out.println(defaultCar);
        System.out.println(defaultElectric);

        car.setYear(2020);
        car.setOwnerName("Petr Petrov");
        car.setInsuranceNumber("INS-1111");

        tesla.setYear(2024);
        tesla.setOwnerName("Olga Orlova");
        tesla.setInsuranceNumber("INS-3003");

        System.out.println("\nПосле изменений:");
        System.out.println(car);
        System.out.println(tesla);
        System.out.println("Battery capacity: " + tesla.getBatteryCapacity() + " kWh");
        System.out.println("Age of car: " + car.getAge());
    }
}
