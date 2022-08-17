import javax.sound.midi.Soundbank;

public class BilanganPrima {
    public static void main(String[] args) {
        isPrime(1);
        isPrime(2);
        isPrime(3);
        isPrime(9);
        isPrime(4);
        isPrime(17);
    }

    static void isPrime(Integer number) {
        Integer j = number / 2;

        if (number == 1 || number == 0) {
            System.out.println(String.format("Angka %s bukan bilangan prima", number));
            return;
        }

        if (number / 2 == 1) {
            System.out.println(String.format("Angka %s adalah bilangan prima", number));
            return;
        }

        for (byte i = 2; i <= j; i++) {
            if (number % i == 0) {
                System.out.println(String.format("Angka %s bukan bilangan prima", number));
                return;
            } else {
                System.out.println(String.format("Angka %s adalah bilangan prima", number));
                return;
            }
        }
    }
}
