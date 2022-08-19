package Encapsulation.Cat;

public class PersianCat extends Cat {
    private String origin;
    private String hairType;
    private String typeOfFace;
    private String typeOfMuzzle; // muzzle = moncong

    public PersianCat(
            String furColor,
            Integer numOfLeg,
            String origin,
            String hairType,
            String typeOfFace,
            String typeOfMuzzle
    ) {
        super(furColor, numOfLeg);
        this.origin = origin;
        this.hairType = hairType;
        this.typeOfFace = typeOfFace;
        this.typeOfMuzzle = typeOfMuzzle;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    public String getTypeOfFace() {
        return typeOfFace;
    }

    public void setTypeOfFace(String typeOfFace) {
        this.typeOfFace = typeOfFace;
    }

    public String getTypeOfMuzzle() {
        return typeOfMuzzle;
    }

    public void setTypeOfMuzzle(String typeOfMuzzle) {
        this.typeOfMuzzle = typeOfMuzzle;
    }

    @Override
    public void showIdentity() {
        System.out.println(String.format(
                "Saya Kucing dengan detail:\n" +
                        "Warna Bulu: %s\n" +
                        "Jumlah Kaki: %s\n" +
                        "Asal dari: %s\n" +
                        "Tipe Rambut: %s\n" +
                        "Tipe Wajah: %s\n" +
                        "Tipe Moncong: %s",
                super.getFurColor(),
                super.numOfLeg, // <-- bisa diakses directly karena property numOfLeg adalah protected dan bisa diakss oleh sub class nya.
                origin,
                hairType,
                typeOfFace,
                typeOfMuzzle
        ));
    }
}
