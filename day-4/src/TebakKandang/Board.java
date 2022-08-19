package TebakKandang;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Board extends Kandang {

    private static Map<Integer, String> pairedKandang = new HashMap<>();
    private static Integer correctAnswer = 0;

    public static void runTheGame() {
        switch (correctAnswer) {
            case 0 -> {
                showInitialKandang();
                showMenu();
            }
            case 3 -> {
                showInitialKandang();
                System.out.println("Selamat anda menjawab semua kandang!");
                System.exit(0);
            }

            default -> {
                showExistingKandang();
                showMenu();
            }
        }
    }
    public static void showAnswer(Integer open) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- PILIHAN ---");
        System.out.println("K: Kambing");
        System.out.println("Z: Zebra");
        System.out.println("B: Bebek");
        System.out.print("Masukkan tebakan: ");
        String answer = scanner.nextLine().toUpperCase();

        if (pairedKandang.get(open).equals(answer)) {
            System.out.println("Tebakan benar!");
            correctAnswer++;
            pairedKandang.put(open, pairedKandang.get(open).toLowerCase());
            runTheGame();
        } else {
            System.out.println("Tebakan salah!");
            runTheGame();
        }


    }
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih kandang yang ingin dibuka: ");

        Integer open = scanner.nextInt();
        showAnswer(open);

    }
    public static Map<Integer, String> showInitialKandang() {
        List<Kandang> randomKandangs = randomKandang();

        int i = 1;

        for (var kandang : randomKandangs) {
            System.out.println(String.format(
                    "|||\n|%s|\n|||",
                    i++
            ));
            pairedKandang.put(i-1, kandang.getName());
            System.out.println();
        }
        System.out.println(pairedKandang);

        return pairedKandang;
    }

    public static Map<Integer, String> showExistingKandang() {
        for (Map.Entry<Integer, String> kandang : pairedKandang.entrySet()) {
            System.out.println(String.format(
                    "|||\n|%s|\n|||",
                    kandang.getValue().equals(kandang.getValue().toUpperCase()) ? kandang.getKey() : kandang.getValue().toUpperCase()
            ));
            System.out.println();
        }
        return pairedKandang;
    }

    public static List<Kandang> randomKandang() {
        List<Kandang> kandangs = Kandang.listKandang;
        List<Kandang> randomKandangs = new ArrayList<>(kandangs);
        Collections.shuffle(randomKandangs);
        return randomKandangs;

    }
}
