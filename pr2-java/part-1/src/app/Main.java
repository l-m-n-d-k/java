package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car C1 = new Car();
        System.out.println(C1);

        ElectricCar C2 = new ElectricCar("Tesla", "White", "E777KX", 2022, 75.0);
        System.out.println(C2);

        C1.setOwnerName("Petr Petrov");
        C1.setEngineType("Diesel");
        System.out.println(C1.getOwnerName() + ", " + C1.getEngineType());

        System.out.println(C2.getEngineType());
        C2.setBatteryCapacity(82.5);
        System.out.println(C2.getBatteryCapacity());
        System.out.println(C2.getAge());
    }
}
