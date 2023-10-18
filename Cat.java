public class Cat extends Pet{
    private String furColor;
    private String whiskerColor;
    private String furLength;
    private int toeNumber;

    public Cat(){

    }


    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getWhiskerColor() {
        return whiskerColor;
    }

    public void setWhiskerColor(String whiskerColor) {
        this.whiskerColor = whiskerColor;
    }

    public String getFurLength() {
        return furLength;
    }

    public void setFurLength(String furLength) {
        this.furLength = furLength;
    }

    public int getToeNumber() {
        return toeNumber;
    }

    public void setToeNumber(int toeNumber) {
        this.toeNumber = toeNumber;
    }

    public void purr(int soundLevel){
        for (int i = 1; i < soundLevel; i++){
            System.out.println("*** purr ***");
        }
    }
    public String meow(){
        return "*** meow ***";
    }
    public String groom(){
        return "*** groom ***";
    }
}
