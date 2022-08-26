public class FastExponentiation {
    public static void main(String[] args) {
        System.out.println(pow(2,3));
        System.out.println(pow(5,3));
        System.out.println(pow(10,2));
    }

    static Integer pow(Integer x, Integer n) {
        if (n <= 0) {
            return 1;
        }

        return x * pow(x, n - 1);
    }
}
