package homework8;

public class Book {
    private final String poem;
    private final String author;

    private int publicationYear;

    public Book(String author, String poem, int publicationYear) {
        this.author = author;
        this.poem = poem;
        this.publicationYear = publicationYear;
    }

    public String getPoem() {
        return this.poem;
    }

    public String getAuthor() {
        return this.author;
    }


    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) { //применен метод сеттер
        this.publicationYear = publicationYear;
    }
}