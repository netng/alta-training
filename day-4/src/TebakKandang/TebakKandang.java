package TebakKandang;

import java.util.Arrays;
import java.util.Scanner;

public class TebakKandang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan jumlah kandang: ");
        int numberOfKandang = scanner.nextInt();

        Kandang.buildKandang(numberOfKandang);
        Board.runTheGame();
        Board.showMenu();

    }


}
