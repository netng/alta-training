package TebakKandang;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Kandang {
    private String name;
    protected static List<Kandang> listKandang = new ArrayList<>();

    public Kandang() {

    }
    public Kandang(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Object buildKandang(Integer numberOfKandang) {

        while (numberOfKandang > 0) {
            switch (numberOfKandang) {
                case 3 -> {
                    Kandang kandangKambing = new Kandang("K");
                    listKandang.add(kandangKambing);
                }

                case 2 -> {
                    Kandang kandangBebek = new Kandang("B");
                    listKandang.add(kandangBebek);
                }

                default -> {
                    Kandang kandangZebra = new Kandang("Z");
                    listKandang.add(kandangZebra);
                }

            }
            numberOfKandang--;
        }

        return listKandang;
    }

    public static void openKandang() {

    }
}
