package vehicles;

public abstract class Vehicle {
    private String model;
    private String licence;
    private String color;
    private int year;
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public abstract String vehicleType();

    public String To_String() {
        return vehicleType() + "{" +
                "model='" + model + '\'' +
                ", licence='" + licence + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", ownerName='" + ownerName + '\'' +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return To_String();
    }

    public Vehicle() {
        this.model = "Toyota";
        this.color = "Orange";
        this.licence = "TVMw7S";
        this.year = 2002;
        this.ownerName = "Ivan Ivanov";
        this.insuranceNumber = "INS-0001";
        this.engineType = "Petrol";
    }

    public Vehicle(String model, String color, String licence, int year,
                   String ownerName, String insuranceNumber, String engineType) {
        this.model = model;
        this.color = color;
        this.licence = licence;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    public int getAge() {
        return 2026 - this.year;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getLicence() { return licence; }
    public void setLicence(String licence) { this.licence = licence; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getInsuranceNumber() { return insuranceNumber; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }

    public String getEngineType() { return engineType; }
    public void setEngineType(String engineType) { this.engineType = engineType; }
}
