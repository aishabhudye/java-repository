package com.aisha.exercises.games;

import java.util.Objects;

public class Move {
    private int location;
    private String value;

    public Move(int location, String value) {
        this.location = location;
        this.value = value;
    }

    public int getLocation() {
        return location;
    }


    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Move move = (Move) o;
        return location == move.location && value.equals(move.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, value);
    }

    @Override
    public String toString() {
        return "Move{" +
                "location=" + location +
                ", value='" + value + '\'' +
                '}';
    }
}
