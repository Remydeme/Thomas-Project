import java.sql.Timestamp;
import java.util.UUID;

public class Transaction {
    private UUID clientID;
    private UUID productID;
    private int numProducts;
    private Timestamp time;


    Transaction(){}

    Transaction(UUID clientID, UUID productID, int numProducts, Timestamp time){
        this.clientID = clientID;
        this.productID = productID;
        this.numProducts = numProducts;
        this.time = time;
    }

    public UUID getClientID() {
        return clientID;
    }

    public void setClientID(UUID clientID) {
        this.clientID = clientID;
    }

    public UUID getProductID() {
        return productID;
    }

    public void setProductID(UUID productID) {
        this.productID = productID;
    }

    public int getNumProducts() {
        return numProducts;
    }

    public void setNumProducts(int numProducts) {
        this.numProducts = numProducts;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }


}
