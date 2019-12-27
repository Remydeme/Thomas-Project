public enum GameGenre {
    arcade ("arcade"),
    aventure("aventure"),
    role("rôle"),
    multijoueurs("multi-joueurs"),
    educatifs("éducatifs"),
    strategie("stratégie");

    private String gamegenre =" " ;
    GameGenre(String gamegenre)
    {
        this.gamegenre=gamegenre;
    }
    public String toSring(){

        return gamegenre ;
    }
}