package vehicles;

public class ElectricCar extends Car {
    private double batteryCapacity;

    @Override
    public String To_String() {
        return "ElectricCar{" + super.To_String() +
                ", batteryCapacity=" + batteryCapacity + '}';
    }

    public ElectricCar() {
        super();
        this.engineType = "Electric";
        this.batteryCapacity = 60.0;
    }

    public ElectricCar(String model, String color, String licence, int year, double batteryCapacity) {
        super(model, color, licence, year);
        this.engineType = "Electric";
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() { return batteryCapacity; }
    public void setBatteryCapacity(double batteryCapacity) { this.batteryCapacity = batteryCapacity; }
}
