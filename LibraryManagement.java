import java.util.Scanner;

public class LibraryManagement {

    static String[] books = {
        "Java Programming",
        "Data Structures",
        "Operating Systems",
        "Computer Networks",
        "Web Technology"
    };

    static boolean[] issued = new boolean[5];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    displayBooks();
                    break;

                case 2:
                    System.out.print("Enter book number: ");
                    int issue = sc.nextInt();

                    if (issue >= 1 && issue <= 5) {
                        if (!issued[issue - 1]) {
                            issued[issue - 1] = true;
                            System.out.println("Book issued successfully.");
                        } else {
                            System.out.println("Book is already issued.");
                        }
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book number: ");
                    int returned = sc.nextInt();

                    if (returned >= 1 && returned <= 5) {
                        if (issued[returned - 1]) {
                            issued[returned - 1] = false;
                            System.out.println("Book returned successfully.");
                        } else {
                            System.out.println("Book was not issued.");
                        }
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void displayBooks() {

        System.out.println("\nAvailable Books:");

        for (int i = 0; i < books.length; i++) {

            if (issued[i]) {
                System.out.println((i + 1) + ". " + books[i] + " - Issued");
            } else {
                System.out.println((i + 1) + ". " + books[i] + " - Available");
            }
        }
    }
}