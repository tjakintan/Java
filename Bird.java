public class Bird extends Pet{

    private String featherColor;
    private String wingspan;
    private String beakType;

    public Bird(){
    }



    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getWingspan() {
        return wingspan;
    }

    public void setWingspan(String wingspan) {
        this.wingspan = wingspan;
    }

    public String getBeakType() {
        return beakType;
    }

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }

    public String squawk(){
        return "***squawk***";
    }
    public String fly(){
        return "***fly***";
    }

}
