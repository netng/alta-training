public class FaktorBilangan {
    public static void main(String[] args) {
        getFactor(6);
        System.out.println("-------");
        getFactor(20);
    }

    static void getFactor(Integer number) {
        for (int i = number; i <= number; i--) {
            if (i == 0) {
                return;
            }

            int result = number / i;

            if (result * i == number) {
                System.out.println(result);
            }
        }
    }
}
