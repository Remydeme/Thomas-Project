public enum Genre {
    comédie("comédie"),
    action("action"),
    drame("drame"),
    dessin("dessin"),
    animé("animé"),
    famille("famille"),
    fantasy("fantasy"),
    scifi("scifi"),
    horreur("horreur");
    private String genre = " ";

    Genre (String genre)
    {
        this.genre =genre;
    }
    public String toSring(){

        return genre;
    }
}