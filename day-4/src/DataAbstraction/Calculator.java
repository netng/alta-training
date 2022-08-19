package DataAbstraction;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Calculator {
    static final String calculator_line = "+++++ CALCULATOR +++++";
    static final String your_choose = "Masukan pilihan anda : ";
    static final String first_input = "Masukan Value 1 : ";
    static final String second_input = "Masukan Value 2 : ";

    public static void main(String[] args) {
        runCalculator();
    }

    static void runCalculator () {
        int option;
        do {
            System.out.println(calculator_line);
            System.out.println("1: Open Calculator");
            System.out.println("99: Exit Calculator");

            Scanner scanner = new Scanner(System.in);
            System.out.print(your_choose);
            option = scanner.nextInt();
        } while (option != 1 && option != 99);

        showInput();
    }

    static void showOperations (Integer num1, Integer num2) {
        int operation;
        do {
            System.out.println(calculator_line);
            System.out.println("1. Add Value");
            System.out.println("2. Sub Value");
            System.out.println("3. Multiply Value");
            System.out.println("4. Divide Value");

            Scanner scanner = new Scanner(System.in);
            System.out.print(your_choose);
            operation = scanner.nextInt();
        } while (
                operation != 1 &&
                operation != 2 &&
                operation != 3 &&
                operation != 4
        );

        calculate(num1, num2, operation);

    }

    static void showInput() {
        Integer firstInput;
        Integer secondInput;
        do {
            System.out.println(calculator_line);
            Scanner scanner = new Scanner(System.in);

            System.out.print(first_input);
            firstInput = scanner.nextInt();

            System.out.print(second_input);
            secondInput = scanner.nextInt();
        } while (firstInput == 0 && secondInput == 0);

        showOperations(firstInput, secondInput);
    }

    static void calculate(Integer num1, Integer num2, Integer operation) {
        switch (operation) {
            case 1 -> {
                System.out.println(String.format("Hasil : %s", num1 + num2));
            } // jumlah
            case 2 -> {
                System.out.println(String.format("Hasil : %s", num1 - num2));
            } // kurang
            case 3 -> {
                System.out.println(String.format("Hasil : %s", num1 * num2));
            } // kali
            default -> {
                if (num1 == 0 || num2 == 0) {
                    System.out.println("Masukan angka selain 0 untuk pembagian");
                    showInput();
                } else {
                    System.out.println(String.format("Hasil : %s", num1 / num2));
                }
            }
        }
    }
}
