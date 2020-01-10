import java.util.UUID;

public class Game extends Product {

    private GameGenre genre;
    private Plateform plateform;



    Game(){}

    Game(String name, double price, UUID identifier, int stock, String image, GameGenre gameGenre, Plateform plateform){
        super(name, price, identifier, stock, image);
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
