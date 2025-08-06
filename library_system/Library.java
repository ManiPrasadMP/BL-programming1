package objectOriented.library_system;

class Library {
    private Book[] books = new Book[5];
    private int count = 0;

    public void addBook(int id, String title, String author) {
        if (count < 5) {
            books[count++] = new Book(id, title, author);
        } else {
            System.out.println("Library full. Cannot add more books.");
        }
    }

    public void listAvailableBooks() {
        System.out.println("\n--- Available Books ---");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (!books[i].isIssued()) {
                System.out.println(books[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books available.");
        }
    }

    public void issueBook(int bookId) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == bookId) {
                if (!books[i].isIssued()) {
                    books[i].issue();
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int bookId) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == bookId) {
                if (books[i].isIssued()) {
                    books[i].returnBook();
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book is not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void listAllBooks() {
        System.out.println("\n--- All Books in Library ---");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
