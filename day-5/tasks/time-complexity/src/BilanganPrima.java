public class BilanganPrima {
    public static void main(String[] args) {
        isPrime(9);
        isPrime(4);
        isPrime(1000000007);
        isPrime(1500450271);
    }

    static boolean isPrime(int number) {
        if (number > 2 && number % 2 == 0) {
            System.out.println(String.format("%s Bukan prima", number));
            return false;
        }

        for (int i = 3; i < (int) Math.sqrt(number) + 1; i += 2) {
            if (number % i == 0) {
                System.out.println(String.format("%s Bukan prima", number));
                return false;
            }
        }

        System.out.println(String.format("%s Bilangan prima", number));
        return true;

    }
}
