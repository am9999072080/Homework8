package homework8;

public class Hom8 {
    public static void main(String[] args) {

        Book book = new Book("Письмо матери", "С. А. Есенин", 1924);
        Author author = new Author("Серге́й", "Алекса́ндрович", "Есе́нин");

        Book book2 = new Book("Кавка́зский пле́нник", "Л. Н. Толстой", 1872);
        Author author2 = new Author("Лев", "Никола́евич", "Толсто́й");

        System.out.println(book.getPoem());
        System.out.println(book.getAuthor());
        System.out.println(book.getPublicationYear() + " год");
        System.out.println(author.getName());
        System.out.println(author.getSurname());
        System.out.println(author.getMiddleName());

        System.out.println();
        book.setPublicationYear(1925); //применен метод сеттер
        System.out.println(book.getPublicationYear() + " год");
        System.out.println();

        System.out.println(book2.getPoem());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getPublicationYear() + " год");
        System.out.println(author2.getName());
        System.out.println(author2.getSurname());
        System.out.println(author2.getMiddleName());
    }
}
