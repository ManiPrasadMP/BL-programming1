package objectOriented.library_system;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        // Adding 5 books
        lib.addBook(1, "DBMS", "Raghu");
        lib.addBook(2, "Java", "Muthu");
        lib.addBook(3, "Karvalo", "Tejaswi");
        lib.addBook(4, "Python", "Puneeth");
        lib.addBook(5, "Nakutanthi", "Bendre");
 
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. View All Books");
            System.out.println("2. View Available Books");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lib.listAllBooks();
                    break;
                case 2:
                    lib.listAvailableBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    lib.issueBook(issueId);
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    lib.returnBook(returnId);
                    break;
                case 5:
                    System.out.println("Thank you for using the Library System!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1 to 5.");
            }

        } while (true);
    }
}