package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        // Полиморфизм: ссылки родительских типов
        Vehicle C1 = new Car();
        Car C2 = new ElectricCar("Tesla", "White", "E777KX", 2022,
                "Anna Smirnova", "INS-2002", 75.0);

        System.out.println(C1);
        System.out.println(C2);

        // Изменение свойств через сеттеры
        C1.setModel("Audi");
        C1.setColor("Black");
        C1.setYear(2020);
        C1.setOwnerName("Petr Petrov");

        C2.setLicence("E888KX");
        C2.setInsuranceNumber("INS-3003");
        ((ElectricCar) C2).setBatteryCapacity(82.5);

        System.out.println("--- После изменений ---");
        Vehicle[] vehicles = {C1, C2};
        for (Vehicle v : vehicles) {
            System.out.println(v.vehicleType() + " (возраст: " + v.getAge() + ")");
            System.out.println(v);
        }
    }
}
