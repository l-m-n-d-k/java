public class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    public String To_String() {
        return "Car{" +
                "model='" + model + '\'' +
                ", license='" + license + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
        }

    @Override
    public String toString() {
        return To_String();
    }

    public Car() {
        this.model = "Toyota";
        this.color = "Orange";
        this.license = "TVMw7S";
        this.year = 2002;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "red";
        this.license = "fsdt32";
    }

    public Car(String model, String color, String license, int year) {
        this.model = model;
        this.color = color;
        this.license = license;
        this.year = year;
    }

    public int getAge() {
        return 2026 - this.year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
