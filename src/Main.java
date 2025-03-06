//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("George", "Orwell");
        Author author2 = new Author("Aldous", "Huxley");

        Book book1 = new Book("1984", author1, 1949);
        Book book2 = new Book("Brave New World", author2, 1932);
        System.out.println(book1);
        System.out.println(book2);

        book1.setPublicationYear(1984);
        System.out.println("Updated Book 1: " + book1.getName() + " by " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + " (" + book1.getPublicationYear() + ")");
    }
}