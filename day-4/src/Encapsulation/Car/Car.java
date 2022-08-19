package Encapsulation.Car;

public class Car {
    private String type;
    private String color;
    private Integer numOfTire;

    public Car(String type, String color, Integer numOfTire) {
        this.type = type;
        this.color = color;
        this.numOfTire = numOfTire;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumOfTire() {
        return numOfTire;
    }

    public void setNumOfTire(Integer numOfTire) {
        this.numOfTire = numOfTire;
    }

    public void showIdentity() {
        System.out.println(String.format(
                "Saya mobil dengan detail, " +
                        "Type: %s, " +
                        "Warna: %s, " +
                        "Jumlah Roda: %s ",
                type, color, numOfTire
        ));
    }
}
