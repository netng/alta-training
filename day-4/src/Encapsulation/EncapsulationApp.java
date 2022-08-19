package Encapsulation;

import Encapsulation.Cat.Cat;
import Encapsulation.Cat.PersianCat;

public class EncapsulationApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Hitam", 4);
        cat.showIdentity();
        System.out.println("==============");
        /**
         * Cat.furColor(); <-- Error jika directly access to property
         * karena property furColor adalah private
         * agar dapat diakses, maka harus melalui setter (untuk mengeset nilai)
         * atau getter (untuk mengambil nilai)
         *
         * Dibawah ini adalah contoh setter & getter untuk manipulasi
         * data yang terenkapsulasi
         */
        cat.setFurColor("Abu");
        System.out.println(cat.getFurColor());

        cat.setNumOfLeg(4);
        System.out.println(cat.getNumOfLeg());

        cat.showIdentity();

        System.out.println();
        System.out.println("==== PersianCat Instance ====");
        /**
         * PersianCat extends Cat
         * Polymorphism
         */
        Cat persianCat = new PersianCat(
                "Abu",
                4,
                "Persia",
                "Rambut Panjang",
                "Bulat",
                "Pendek"
        );

        persianCat.showIdentity();


    }
}
