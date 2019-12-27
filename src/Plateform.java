public enum Plateform {

    NINTENDO("Nintendo"),
    PC("PC"),
    PLAYSTATION("Playstation"),
    XBOX("XB0X");


    private String  palteform;

    Plateform(String plateform){
        this.palteform = plateform;
    }

    public String toString(){
        return this.palteform;
    }
}
