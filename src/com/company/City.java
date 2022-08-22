package com.company;

public class City {
    int code;
    String name;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
