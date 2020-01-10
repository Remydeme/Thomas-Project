import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class XMLEditor {





    DVD parseDVD(Element eElement){
        String name = eElement.getElementsByTagName("name").item(0).getTextContent();
        double price = Double.parseDouble(eElement.getElementsByTagName("price").item(0).getTextContent());
        UUID identifier = UUID.fromString(eElement.getElementsByTagName("identifier").item(0).getTextContent());
        int stock = Integer.parseInt(eElement.getElementsByTagName("stock").item(0).getTextContent());
        int length = Integer.parseInt(eElement.getElementsByTagName("length").item(0).getTextContent());
        String g = eElement.getElementsByTagName("genre").item(0).getTextContent();
        //Genre genre = new Genre(g);
        String image = eElement.getElementsByTagName("image").item(0).getTextContent();

        NodeList actors = eElement.getElementsByTagName("actors");
        List<String> actorsList = new ArrayList<String>();
        for (int i = 0; i < actors.getLength(); i++){
            Node actor = actors.item(i);
            Element eActor = (Element) actor;
            String actorName = eActor.getElementsByTagName("name").item(0).getTextContent();
            actorsList.add(actorName);
        }
        DVD dvd = new DVD(name, price, identifier, stock, image, actorsList, length, Genre.anime);
        return dvd;
    }


    Book parseBook(Element eElement){
        String name = eElement.getElementsByTagName("name").item(0).getTextContent();
        double price = Double.parseDouble(eElement.getElementsByTagName("price").item(0).getTextContent());
        UUID identifier = UUID.fromString(eElement.getElementsByTagName("identifier").item(0).getTextContent());
        int stock = Integer.parseInt(eElement.getElementsByTagName("stock").item(0).getTextContent());
        String image = eElement.getElementsByTagName("image").item(0).getTextContent();
        String author = eElement.getElementsByTagName("author").item(0).getTextContent();
        int page = Integer.parseInt(eElement.getElementsByTagName("page").item(0).getTextContent());
        String l = eElement.getElementsByTagName("language").item(0).getTextContent();
        //Language language = new Language(l);
        Book book = new Book(name, price, identifier, stock, image,  author, page, Language.Anglais);
        return book;
    }

    Game parseGame(Element eElement){

        String name = eElement.getElementsByTagName("name").item(0).getTextContent();
        double price = Double.parseDouble(eElement.getElementsByTagName("price").item(0).getTextContent());
        UUID identifier = UUID.fromString(eElement.getElementsByTagName("identifier").item(0).getTextContent());
        int stock = Integer.parseInt(eElement.getElementsByTagName("stock").item(0).getTextContent());
        String gg = eElement.getElementsByTagName("gameGenre").item(0).getTextContent();
        String image = eElement.getElementsByTagName("name").item(0).getTextContent();
        //GameGenre gameGenre = new GameGenre(gg);
        //Plateform plateform = new Plateform(eElement.getElementsByTagName("name").item(0).getTextContent());
        Game game = new Game(name, price, identifier, stock, image, GameGenre.arcade, Plateform.PLAYSTATION);//gameGenre, plateform);
        return game;
    }





    // function use to read product from product file
    List<Product> readProductFile(String path) {
        List<Product> productList = new ArrayList<Product>();
        try {
            File inputFile = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("product");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    switch (eElement.getElementsByTagName("type").item(0).getTextContent()) {

                        case "book":
                            Book b = parseBook(eElement);
                            productList.add(b);
                            break;
                        case "dvd":
                            DVD d = parseDVD(eElement);
                            productList.add(d);
                            break;
                        case "game":
                            Game g = parseGame(eElement);
                            productList.add(g);
                            break;
                        default:

                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }



   List<Client> readClient(String path){
        List<Client> clients = new ArrayList<Client>();
        try {
            File inputFile = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("client");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    UUID identifier = UUID.fromString(eElement.getElementsByTagName("identifier").item(0).getTextContent());
                    String lastname = eElement.getElementsByTagName("lastname").item(0).getTextContent();
                    String firstname = eElement.getElementsByTagName("firstname").item(0).getTextContent();
                    String address = eElement.getElementsByTagName("address").item(0).getTextContent();
                    Client client = new Client(firstname, lastname, address, identifier);
                    clients.add(client);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clients;
    }

    public static void main(String[] args) {
        XMLEditor xe = new XMLEditor();
        List<Client> products = xe.readClient("files/clients.xml");

        for (Client p : products){
            System.out.print(p);
        }
    }
}