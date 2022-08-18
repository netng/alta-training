public class Xo {
    public static void main(String[] args) {
        isXequalO("xoxoxo");
        isXequalO("oxooxo");
    }
    static void isXequalO (String xoxo) {
        char[] charOfXoXo = xoxo.toLowerCase().toCharArray();
        Integer numberOfX = 0;
        Integer numberOfO = 0;

        for (var xoChar : charOfXoXo) {
            switch (xoChar) {
                case 'x':
                    numberOfX++;
                    break;
                default:
                    numberOfO++;
                    break;
            }
        }

        System.out.println(numberOfX == numberOfO ? true : false);
    }
}
