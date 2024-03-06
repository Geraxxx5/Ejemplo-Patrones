package builder;

public class main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
            .setSize("Medium")
            .setBodyType("Sedan")
            .addFeature("Air conditioning")
            .addFeature("Bluetooth")
            .build();
    }
}

