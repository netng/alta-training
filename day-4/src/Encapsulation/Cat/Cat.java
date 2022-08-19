package Encapsulation.Cat;

public class Cat {
    private String furColor;
    protected Integer numOfLeg;

    public Cat(String furColor, Integer numOfLeg) {
        this.furColor = furColor;
        this.numOfLeg = numOfLeg;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setNumOfLeg(Integer numOfLeg) {
        this.numOfLeg = numOfLeg;
    }

    public Integer getNumOfLeg() {
        return numOfLeg;
    }

    public void showIdentity() {
        System.out.println(String.format(
                "Saya Kucing dengan detail:\nWarna Bulu: %s\njumlah kaki: %s", furColor, numOfLeg
        ));
    }
}
