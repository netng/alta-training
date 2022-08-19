package Encapsulation.Car;

public class CarApp {
    public static void main(String[] args) {
        Car sedan = new Car("sedan", "merah", 4);
        Car truk = new Car("truk", "hijau", 6);
        Car tronton = new Car("tronton", "coklat", 12);
        Car angkot = new Car("angkot", "kuning", 4);

        sedan.showIdentity();
        truk.showIdentity();
        tronton.showIdentity();
        angkot.showIdentity();
    }
}
