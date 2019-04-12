package com.example.bmi_suman_gc;

public class WeightModel {
    private Float weight, height;

    public WeightModel(Float weight, Float height) {
        this.weight = weight;
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }
}
