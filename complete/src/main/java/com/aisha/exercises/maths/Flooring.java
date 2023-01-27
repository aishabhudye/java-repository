package com.aisha.exercises.maths;

public class Flooring {
    private float length = 0;
    private float width = 0;

    public Flooring() {
    }

    public Flooring(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }


    public float costs() {
        float cost = 0.0F;
        if (length <= 0.0 || width > 4.0) {
            System.out.println("ERROR");
        } else {
            cost = length * width * 10;
            System.out.println(cost);
        }
        return cost;
    }

}
