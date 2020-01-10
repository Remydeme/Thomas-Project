public enum Genre {

    comedie("comédie"),
    action("action"),
    drame("drame"),
    dessin("dessin"),
    anime("animé"),
    famille("famille"),
    fantasy("fantasy"),
    scifi("scifi"),
    horreur("horreur");

    public String genre = " ";

    Genre (String genre)
    {
        this.genre  = genre;
    }

    public String toSring(){
        return genre;
    }
}