public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");

        Book captainDaughter = new Book("Капитанская дочка", pushkin, 1836);
        Book warAndPeace = new Book("Война и мир", tolstoy, 1869);

        System.out.println("Книги в библиотечном справочнике:");
        printBook(captainDaughter);
        printBook(warAndPeace);

        captainDaughter.setPublicationYear(2024);

        System.out.println();
        System.out.println("После изменения года публикации:");
        printBook(captainDaughter);
    }

    private static void printBook(Book book) {
        System.out.println(
                "Название: " + book.getTitle()
                        + ", автор: " + book.getAuthor().getFirstName()
                        + " " + book.getAuthor().getLastName()
                        + ", год публикации: " + book.getPublicationYear()
        );
    }
}

class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Book {
    private final String title;
    private final Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        if (author == null) {
            throw new IllegalArgumentException("У книги должен быть автор.");
        }

        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}