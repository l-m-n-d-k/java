public class Main {
    public static void main(String[] args) {
        Car C1 = new Car();
        System.out.println(C1);

        Car C2 = new Car("Audi", "Black", "76443", 2022);
        System.out.println(C2.To_String());
        System.out.println(C2.getModel());

        C2.setModel("Skoda");
        System.out.println(C2.getModel());
        System.out.println(C2.To_String());
        System.out.println(C2.getAge());
    }
}
