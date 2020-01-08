import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.List;
import java.util.UUID;

public class XMLEditor {





    DVD parseDVD(Element eElement){
        String name = eElement.getElementsByTagName("name").item(0).getTextContent();
        double price = Double.parseDouble(eElement.getElementsByTagName("price").item(0).getTextContent());
        UUID identifier = UUID.fromString(eElement.getElementsByTagName("identifier").item(0).getTextContent());
        int stock = Integer.parseInt(eElement.getElementsByTagName("stock").item(0).getTextContent());
        Type type = Type.valueOf(eElement.getElementsByTagName("type").item(0).getTextContent());
        NodeList actors = eElement.getElementsByTagName("actors");
        List<String> actorsList =
        for (int i = 0; i < actors.getLength(); i++){
            Node actor = actors.item(i);

        }
        DVD dvd = new DVD();
        return dvd;
    }


    Book parseBook(Element eElement){
        String name = eElement.getElementsByTagName("name").item(0).getTextContent();
        double price = Double.parseDouble(eElement.getElementsByTagName("price").item(0).getTextContent());
        UUID identifier = UUID.fromString(eElement.getElementsByTagName("identifier").item(0).getTextContent());
        int stock = Integer.parseInt(eElement.getElementsByTagName("stock").item(0).getTextContent());
        Type type = Type.valueOf(eElement.getElementsByTagName("type").item(0).getTextContent());
        String author = eElement.getElementsByTagName("author").item(0).getTextContent();
        String page = eElement.getElementsByTagName("page").item(0).getTextContent();
        String language = eElement.getElementsByTagName("language").item(0).getTextContent();
        Book book = new Book();
        return book;
    }

    Game parseGame(Element eElement){

        String name = eElement.getElementsByTagName("name").item(0).getTextContent();
        double price = Double.parseDouble(eElement.getElementsByTagName("price").item(0).getTextContent());
        UUID identifier = UUID.fromString(eElement.getElementsByTagName("identifier").item(0).getTextContent());
        int stock = Integer.parseInt(eElement.getElementsByTagName("stock").item(0).getTextContent());
        Type type = Type.valueOf(eElement.getElementsByTagName("type").item(0).getTextContent());

        Game game = new Game();
        return game;
    }





    // function use to read product from product file
    List<Product> readProductFile(String path) {
        List<Product> products;
        try {
            File inputFile = new File("files/products.xml");
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
                            break;
                        case "dvd":
                            DVD d = parseDVD(eElement);
                            break;
                        case "game":
                            Game g = parseGame(eElement);
                            break;
                        default:

                    }
                    System.out.println("First Name : "
                            + eElement
                            .getElementsByTagName("name")
                            .item(0)
                            .getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        XMLEditor xe = new XMLEditor();
        xe.readProductFile("files/products.xml");
    }
}