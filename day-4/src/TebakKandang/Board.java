package TebakKandang;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Board extends Kandang {

    private static Map<Integer, String> pairedKandang = new HashMap<>();
    private static Integer correctAnswer = 0;

    public static final String ansi_reset = "\u001B[0m";
    private static final String ansi_red = "\u001B[31m";
    private static final String ansi_green = "\u001B[32m";
    private static final String ansi_yellow = "\u001B[33m";
    private static final String ansi_blue = "\u001B[34m";



    public static void runTheGame() {
        switch (correctAnswer) {
            case 0 -> {
                showInitialKandang();
                showMenu();
            }
            case 3 -> {
                showExistingKandang();
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
        System.out.println(ansi_blue + "K" + ansi_reset + ": Kambing" );
        System.out.println(ansi_red + "Z" + ansi_reset + ": Zebra");
        System.out.println(ansi_yellow + "B" + ansi_reset + ": Bebek");
        System.out.print("Masukkan tebakan: ");
        String answer = scanner.nextLine().toUpperCase();

        if (pairedKandang.get(open).equals(answer)) {
            System.out.println(ansi_green + "Tebakan benar!" + ansi_reset);
            correctAnswer++;
            pairedKandang.put(open, pairedKandang.get(open).toLowerCase());
            runTheGame();
        } else {
            System.out.println(ansi_yellow + "Tebakan salah!" + ansi_reset);
            runTheGame();
        }


    }
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih kandang yang ingin dibuka: ");

        Integer open = scanner.nextInt();

        if (pairedKandang.get(open).equals(pairedKandang.get(open).toUpperCase())) {
            showAnswer(open);
        } else {
            System.out.println("Kandang sudah ditebak. Pilih kandang lain ya!");
            showExistingKandang();
            showMenu();
        }

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
                    kandang.getValue().equals(kandang.getValue().toUpperCase()) ? kandang.getKey() : ansi_yellow + kandang.getValue().toUpperCase() + ansi_reset
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
