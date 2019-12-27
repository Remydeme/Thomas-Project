public enum Language {
    Anglais("Anglais"),
    Français("Français") ,
    Allemand("Allemand"),
    Espagnol("Espagnol"),
    Chinois("chinois");

    private String language = "";

    Language(String language)
    {

        this.language =language;
    }
    public String toSring(){

        return language ;
    }

}