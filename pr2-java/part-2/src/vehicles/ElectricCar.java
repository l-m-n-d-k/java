package vehicles;

public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar() {
        super();
        this.engineType = "Electric";
        this.batteryCapacity = 60.0;
    }

    public ElectricCar(String model, String color, String licence, int year,
                       String ownerName, String insuranceNumber, double batteryCapacity) {
        super(model, color, licence, year, ownerName, insuranceNumber, "Electric");
        this.engineType = "Electric";
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() { return batteryCapacity; }
    public void setBatteryCapacity(double batteryCapacity) { this.batteryCapacity = batteryCapacity; }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String To_String() {
        return super.To_String() + ", batteryCapacity=" + batteryCapacity;
    }
}
