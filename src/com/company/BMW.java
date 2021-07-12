package com.company;

public class BMW extends Cars {
    private Kuzov kuzov;

    public BMW(int year, int volume, Color color) {
        super(year, volume, color);
    }

    public BMW(int year, int volume, Color color, Kuzov kuzov) {
        super(year, volume, color);
        this.kuzov = kuzov;
    }

    public BMW(int year, int volume, Kuzov kuzov) {
        super(year, volume);
        this.kuzov = kuzov;
    }

    public Kuzov getKuzov() {
        return kuzov;
    }

    public void print() {
        System.out.println("Info: " + getYear() + " Volume" + getVolume() + " Color: " + getColor());
    }

    public final void print(int price) {
        System.out.println(price);
    }

    public void print(Kuzov kuzov) {
        this.kuzov = kuzov;
        System.out.println(getKuzov());
    }
}
