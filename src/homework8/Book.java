package homework8;

public class Book {
    private String poem;
    private String author;
    private int publicationYear;

    public Book(String poem, String author, int publicationYear) {
        this.poem = poem;
        this.author = author;
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
