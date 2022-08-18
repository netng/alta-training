public class BilanganPrima {
    public static void main(String[] args) {
        isPrime(7);
        isPrime(10);
        isPrime(21);
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
            }
        }
        System.out.println(String.format("Angka %s adalah bilangan prima", number));
    }

}
