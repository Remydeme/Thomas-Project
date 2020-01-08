import java.util.UUID;

public abstract class Product  {

    private String name;
    private double price;
    private UUID identifier;
    private int stock;
    private Type type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private String image;

    Product(){

    }

    Product(String name, double price, UUID identifier, int stock, String iamge){
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.image = image;
        this.identifier = identifier;
    }


}
