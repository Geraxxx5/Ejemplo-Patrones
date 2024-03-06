package builder;

import java.util.List;

class Car {
    private String size;
    private String bodyType;
    private List<String> features;

    public Car(String size, String bodyType, List<String> features) {
        this.size = size;
        this.bodyType = bodyType;
        this.features = features;
    }
}

