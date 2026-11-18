package vehicles;

public class Car extends Vehicle {
    public Car() {
        super();
    }

    public Car(String model, int year) {
        super(model, "red", "fsdt32", year, "Ivan Ivanov", "INS-0001", "Petrol");
    }

    public Car(String model, String color, String license, int year,
               String ownerName, String insuranceNumber, String engineType) {
        super(model, color, license, year, ownerName, insuranceNumber, engineType);
    }

    @Override
    public String vehicleType() {
        return "Car";
    }
}
