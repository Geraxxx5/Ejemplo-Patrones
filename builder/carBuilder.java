package builder;

import java.util.ArrayList;
import java.util.List;

class CarBuilder {
    private String size;
    private String bodyType;
    private List<String> features = new ArrayList<>();

    CarBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    CarBuilder setBodyType(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    CarBuilder addFeature(String feature) {
        this.features.add(feature);
        return this;
    }

    Car build() {
        return new Car(size, bodyType, features);
    }
}
