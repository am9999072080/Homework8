package homework8;

public class Book {
    private String poem;
    private int publicationYear;

    public Book(String poem, int publicationYear) {
        this.poem = poem;
        this.publicationYear = publicationYear;
    }

    public String getPoem() {
        return this.poem;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) { //применен метод сеттер
        this.publicationYear = publicationYear;
    }
}
