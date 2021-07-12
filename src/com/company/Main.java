package com.company;

public class Main {

    public static void main(String[] args) {

//    g)  В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2 объекта класса
//    3-го уровня (objectB, objectC), также распечатать все свойства объектов и вызвать перегруженные
//    методы через каждый из экземпляров ваших объектов.

//    На сообразительность
//    h)  Написать метод в классе 3-го уровня который бы копировал некоторые свойства из себеподобного
//    объекта
//    i)  Затем скопировать несколько свойств из objectB в objectC и распечатать информацию по objectC    }

        BMW bmw = new BMW(2001, 4, Color.RED, Kuzov.SEDAN);
        bmw.print();
        bmw.print(5000);
        bmw.print(Kuzov.KUPE);

        System.out.println(bmw.getKuzov());

        E39 e39 = new E39(2002, 3, Color.BLACK, "Alpina");
        e39.print(6000);
        e39.print();

        E39 e391 = new E39(2003, 2, Color.WHITE);
        e391.print(4000);
        e391.copy(e39);
        e391.copy(bmw);
        e391.print();


    }

}
