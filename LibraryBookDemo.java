class LibraryBook {
    String title;
    String isbn;
    boolean catalogued;

    public LibraryBook(String title, String isbn) {
        this.title = title;
        if (isbn == null || isbn.isEmpty()) {
            this.isbn = "PENDING";
        } else {
            this.isbn = isbn;
        }
        this.catalogued = true;
    }

    public LibraryBook(String title) {
        this(title, "");
    }

    void printStatus() {
        System.out.println(title + " | " + isbn + " | Catalogued: " + catalogued);
    }
}

public class LibraryBookDemo {
    public static void main(String[] args) {
        String[] titles = {"Clean Code", "Untitled Draft", "1984", "Notes"};
        String[] isbns = {"978-0132350884", "", "9780451524935", ""};

        LibraryBook[] books = new LibraryBook[titles.length];
        for (int i = 0; i < titles.length; i++) {
            if (isbns[i] == null || isbns[i].isEmpty()) {
                books[i] = new LibraryBook(titles[i]);
            } else {
                books[i] = new LibraryBook(titles[i], isbns[i]);
            }
        }

        for (int i = 0; i < books.length; i++) {
            books[i].printStatus();
        }
    }
}