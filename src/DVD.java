import java.util.List;

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

    DVD(List<String> actors, int length, Genre genre){
        this.actors = actors;
        this.length = length;
        this.genre = genre;
    }




}
