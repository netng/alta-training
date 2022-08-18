public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(exponen(2,3));
        System.out.println(exponen(7,2));
    }

    static Integer exponen(Integer x, Integer n) {
        if (n <= 0) {
            return 1;
        }

        // System.out.println(x);

        return x * exponen(x, n - 1);
    }
}
