import java.util.*;

class Book {
    String title;
    String author;
    double price;
    int stock;

    Book(String titleStr, String authorStr, double cost, int quantity) {
        title = titleStr;
        author = authorStr;
        price = cost;
        stock = quantity;
    }
    Book(String TitlString, String AuthorStr) {
        this(TitlString, AuthorStr, 500.0, 10);
    }

    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.print("Title: " + title);
        System.out.print(", Author: " + author);
        System.out.printf(", Price: %.2f", price);
        System.out.println(", Stock: " + stock);
    }
}

 class BookShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        scanner.nextLine();

        Book book;

        switch (choice) {
            case 1:
                String title1 = scanner.nextLine();
                String author1 = scanner.nextLine();
                double price = scanner.nextDouble();
                int stock = scanner.nextInt();

                book = new Book(title1, author1, price, stock);
                break;

            case 2:
                String title2 = scanner.nextLine();
                String author2 = scanner.nextLine();

                book = new Book(title2, author2);
                break;

            default:
                System.out.println("Invalid choice. Exiting program.");
                scanner.close();
                return;
        }

        book.displayDetails();
        scanner.close();
    }
}
