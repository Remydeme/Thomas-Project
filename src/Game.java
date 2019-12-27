public class Game {

    private GameGenre genre;
    private Plateform plateform;



    Game(){}

    Game(GameGenre gameGenre, Plateform plateform){
        this.plateform = plateform;
        this.genre = gameGenre;
    }
    public GameGenre getGenre() {
        return genre;
    }

    public void setGenre(GameGenre genre) {
        this.genre = genre;
    }

    public Plateform getPlateform() {
        return plateform;
    }

    public void setPlateform(Plateform plateform) {
        this.plateform = plateform;
    }

}
