package Encapsulation.Flower;

import java.text.Normalizer;

public class Flower {
    private String name;
    private String color;
    private Integer numOfPetal;

    public Flower(String name, String color, Integer numOfPetal) {
        this.name = name;
        this.color = color;
        this.numOfPetal = numOfPetal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumOfPetal() {
        return numOfPetal;
    }

    public void setNumOfPetal(Integer numOfPetal) {
        this.numOfPetal = numOfPetal;
    }

    public void showDetail() {
        System.out.println(String.format(
                "Saya Bunga dengan detail, " +
                        "Jenis: %s, " +
                        "Warna: %s, " +
                        "Jumlah Kelopak: %s ",
                name, color, numOfPetal
        ));
    }
}
