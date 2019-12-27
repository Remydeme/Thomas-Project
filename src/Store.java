import java.util.HashMap;
import java.util.List;

public class Store {

    private List<Product> productList;
    private List<Client> clientList;
    private List<Transaction> transactionList;
    private HashMap<String, List<Product>> categories;


    public Store(List<Product> productList, List<Client> clientList, List<Transaction> transactionList, HashMap<String, List<Product>> categories) {
        this.productList = productList;
        this.clientList = clientList;
        this.transactionList = transactionList;
        this.categories = categories;
    }


    void addProduct(Product p){
        this.productList.add(p);
    }

    void addClient(Client c){
        this.clientList.add(c);
    }

    void addTransaction(Transaction t){
        this.transactionList.add(t);
    }

    void addCategory(List<Product> p, String cat){
        this.categories.put(cat, p);
    }


    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public HashMap<String, List<Product>> getCategories() {
        return categories;
    }

    public void setCategories(HashMap<String, List<Product>> categories) {
        this.categories = categories;
    }


}
