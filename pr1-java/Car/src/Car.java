public class Car {
    private String model;
    private String licence;
    private String color;
    private int year;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", licence='" + licence + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public Car() {
        this.model = "Toyota";
        this.color = "Orange";
        this.licence = "TVMw7S";
        this.year = 2002;
    }

    public Car(String model, String color, String licence, int year) {
        this.model = model;
        this.color = color;
        this.licence = licence;
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
}
