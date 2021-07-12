package com.company;

public final class E39 extends BMW{
    private String Alpina;
    private Color color;

    public E39(int year, int volume, Color color) {
        super(year, volume, color);
        this.color = color;
    }

    public E39(int year, int volume, Color color, String alpina) {
        super(year, volume, color);
        Alpina = alpina;
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public String getAlpina() {
        return Alpina;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getAlpina());
    }

    public void copy(E39 e39) {
        this.Alpina = e39.getAlpina();
    }
    public void copy(BMW bmw){
        this.color = bmw.getColor();
    }
}
