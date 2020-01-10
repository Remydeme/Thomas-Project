import java.util.List;
import java.util.UUID;

public class DVD extends Product {

    private List<String> actors;

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    private int length;
    private Genre genre;

    DVD() {

    }

    DVD(String name, double price, UUID identifier, int stock, String image, List<String> actors, int length, Genre genre){
        super(name, price, identifier, stock, image);
        this.actors = actors;
        this.length = length;
        this.genre = genre;
    }




}
