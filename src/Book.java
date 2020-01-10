import java.util.UUID;

public class Book extends Product {
    private String author;
    private int pages;
    private Language language;


    Book(){
    }

    Book(String name, double price, UUID identifier, int stock, String image, String author, int pages, Language language) {
        super(name, price, identifier, stock, image);
        this.author = author;
        this.language = language;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

}
