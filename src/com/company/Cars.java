package com.company;

public class Cars {
    private int year;
    private int volume;
    private Color color;

    public int getYear() {
        return year;
    }

    public int getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }

    public Cars(int year, int volume, Color color) {
        this.year = year;
        this.volume = volume;
        this.color = color;
    }

    public Cars(int year, int volume) {
        this.year = year;
        this.volume = volume;
    }


}
