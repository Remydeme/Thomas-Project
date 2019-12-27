import java.util.UUID;

public class Client {

    private String firstname;
    private String lastname;
    private String address;
    private UUID uniqueID;

    public Client(String firstname, String lastname, String address, UUID uniqueID) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.uniqueID = uniqueID;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UUID getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(UUID uniqueID) {
        this.uniqueID = uniqueID;
    }


}
