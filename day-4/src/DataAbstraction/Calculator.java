package DataAbstraction;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    static final String calculator_line = "+++++ CALCULATOR +++++";
    static final String your_choose = "Masukan pilihan anda : ";
    static final String first_input = "Masukan Value 1 : ";
    static final String second_input = "Masukan Value 2 : ";
    static final String invalid_option_type = "Pilihan hanya berupa angka dengan format Integer";
    static final String invalid_input_type = "Input hanya berupa angka dengan format Integer";

    public static void main(String[] args) {
        runCalculator();
    }
    static void runCalculator () {
        Integer option = 0;
        try {
            do {
                System.out.println(calculator_line);
                System.out.println("1: Open Calculator");
                System.out.println("99: Exit Calculator");

                Scanner scanner = new Scanner(System.in);
                System.out.print(your_choose);
                option = scanner.nextInt();
            } while (option != 1 && option != 99);

            if (option == 99) {
                System.out.println("Keluar dari aplikasi. Terimakasih");
                return;
            } else {
                showInput();
            }

        } catch (InputMismatchException exception) {
            System.out.println(invalid_option_type);
            runCalculator();
        }
    }
    static void showOperations (Integer num1, Integer num2) {
        Integer operation = 0;
        try {
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

        } catch (InputMismatchException exception) {
            System.out.println(invalid_option_type);
            showOperations(num1, num2);
        }

    }
    static void showInput() {
        Integer firstInput = 0;
        Integer secondInput = 0;
        try {
            do {
                System.out.println(calculator_line);
                Scanner scanner = new Scanner(System.in);

                System.out.print(first_input);
                firstInput = scanner.nextInt();

                System.out.print(second_input);
                secondInput = scanner.nextInt();
            } while (firstInput == 0 && secondInput == 0);
            showOperations(firstInput, secondInput);
        } catch (InputMismatchException exception) {
            System.out.println(invalid_input_type);
            showInput();
        }
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
