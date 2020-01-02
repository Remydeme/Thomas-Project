public enum Type {

    DVD("dvd"),
    BOOK("book"),
    GAME("game");

    String name;

    Type(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                '}';
    }
}
