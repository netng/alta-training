public class LampuTombol {
    public static void main(String[] args) {
        onOf(5);
        onOf(4);
    }

    static void onOf(Integer number) {
        if (number % 2 == 0) {
            System.out.println("Lampu menyala");
        } else {
            System.out.println("Lampu mati");
        }

    }
}
