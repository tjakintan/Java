public class Fish extends Pet{
    private boolean jawless;
    private String SkeletonType;
    private boolean dorsaFin;
    private String bodyType;


    public Fish(){

    }

    public boolean isJawless() {
        return jawless;
    }

    public void setJawless(boolean jawless) {
        this.jawless = jawless;
    }

    public String getSkeletonType() {
        return SkeletonType;
    }

    public void setSkeletonType(String skeletonType) {
        SkeletonType = skeletonType;
    }

    public boolean isDorsaFin() {
        return dorsaFin;
    }

    public void setDorsaFin(boolean dorsaFin) {
        this.dorsaFin = dorsaFin;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String swim(String direction){
        return direction;
    }
    public String detetctLight(){
        return ("***detectLight***");
    }
}
