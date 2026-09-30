public class Car {
    private String model;
    private String licence;
    private String color;
    private int year;

    public String To_String() {
        return "Car{" +
                "model='" + model + '\'' +
                ", licence='" + licence + '\'' +
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
        this.licence = "TVMw7S";
        this.year = 2002;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "red";
        this.licence = "fsdt32";
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

    public String getLecince() {
        return licence;
    }

    public void setLecince(String lecence) {
        this.licence = licence;
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
