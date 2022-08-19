package Encapsulation.Flower;

public class FlowerApp {
    public static void main(String[] args) {
        Flower bangkai = new Flower("bangkai", "merah", 12);
        Flower anggrek = new Flower("anggrek", "putih", 8);
        Flower mawar = new Flower("mawar", "merah", 3);
        Flower melati = new Flower("melati", "kuning", 5);

        bangkai.showDetail();
        anggrek.showDetail();
        mawar.showDetail();
        melati.showDetail();
    }
}
