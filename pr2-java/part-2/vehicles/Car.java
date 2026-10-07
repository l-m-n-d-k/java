package vehicles;

public class Car extends Vehicle {
    public Car() {
        super();
    }

    public Car(String model, int year) {
        super(model, "red", "fsdt32", year, "Ivan Ivanov", "INS-0001", "Petrol");
    }

    public Car(String model, String color, String licence, int year,
               String ownerName, String insuranceNumber, String engineType) {
        super(model, color, licence, year, ownerName, insuranceNumber, engineType);
    }

    @Override
    public String vehicleType() {
        return "Car";
    }
}
