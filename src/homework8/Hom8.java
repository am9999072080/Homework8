
package homework8;
public class Hom8 {
    public static void main(String[] args) {
        Book book = new Book("Серге́й Алекса́ндрович Есе́нин", "Письмо матери", 1924);

        Book book2 = new Book("Лев Никола́евич Толсто́й", "Кавка́зский пле́нник", 1872);

        System.out.println(book.getAuthor());
        System.out.println(book.getPoem());
        System.out.println(book.getPublicationYear() + " год");


        System.out.println();
        book.setPublicationYear(1925); //применен метод сеттер
        System.out.println(book.getPublicationYear() + " год");
        System.out.println();

        System.out.println(book2.getAuthor());
        System.out.println(book2.getPoem());
        System.out.println(book2.getPublicationYear() + " год");
    }
}