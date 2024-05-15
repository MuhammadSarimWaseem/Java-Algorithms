// You have to implement a library using Java Class "Library"
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books
class Library1 {
    private String[] availableBook = {
            "\"The Lord of the Rings\", \"Pride and Prejudice\", \"The Hobbit\", \"The Chronicles of Narnia\", \"Animal Farm\", \"Brave New World\", \"The Da Vinci Code\", \"The Hitchhiker's Guide to the Galaxy\", \"The Hunger Games\", \"A Game of Thrones\"" };
    private String[] issuedBook = {
            "\"Harry Potter\", \"To Kill a Mockingbird\", \"The Great Gatsby\", \"1984\", \"The Catcher in the Rye\"" };

    void addBook(String book) {
        boolean bookExists = false;
        // if that book is already in array
        for (String element : availableBook) {
            if (element.equals(book)) {
                bookExists = true;
                System.out.println("Book already exists");
                break;
            }
        }
        // adding new book in availableBook array
        if (!bookExists) {
            String[] newArray = new String[availableBook.length + 1];
            System.arraycopy(availableBook, 0, newArray, 0, availableBook.length);
            newArray[newArray.length - 1] = book;
            availableBook = newArray;
        }
    }

    void issueBook(String book) {
        // checking whether issued book available in the array
        boolean bookExists = false;
        for (String element : availableBook) {
            if (element.equals(book)) {
                bookExists = true;
                // removing that book from availableBook array
                for (int i = 0; i < availableBook.length; i++) {
                    if (availableBook[i] == book) {
                        for (int j = i; j < availableBook.length - 1; j++) {
                            availableBook[j] = availableBook[j + 1];
                        }
                    }
                }
                String[] newArray2 = new String[availableBook.length - 1];
                System.arraycopy(availableBook, 0, newArray2, 0, availableBook.length - 1);
                availableBook = newArray2;
                // adding book to issued book array
                String[] newArray = new String[issuedBook.length + 1];
                System.arraycopy(issuedBook, 0, newArray, 0, issuedBook.length);
                newArray[newArray.length - 1] = book;
                issuedBook = newArray;
            }
        }
        // if that book is not in array
        if (!bookExists) {
            System.out.println("this book is already issued or not available in this library");

        }
    }

    void returnBook(String book) {
        // checking whether that book is issued
        boolean bookExists = false;
        for (String element : issuedBook) {
            if (element.equals(book)) {
                bookExists = true;
                // removing that book from issuedBook array
                for (int i = 0; i < issuedBook.length; i++) {
                    if (issuedBook[i] == book) {
                        for (int j = i; j < issuedBook.length - 1; j++) {
                            issuedBook[j] = issuedBook[j + 1];
                        }
                    }
                }
                String[] newArray2 = new String[issuedBook.length - 1];
                System.arraycopy(issuedBook, 0, newArray2, 0, issuedBook.length - 1);
                issuedBook = newArray2;
                // adding that book in availableBook array
                String[] newArray = new String[availableBook.length + 1];
                System.arraycopy(availableBook, 0, newArray, 0, availableBook.length);
                newArray[newArray.length - 1] = book;
                availableBook = newArray;
            }
        }
        // // if that book is not in array
        if (!bookExists) {
            System.out.println("you have return wrong book");
        }
    }

    void showAvailableBooks() {
        for (int book = 0; book < availableBook.length; book++) {
            System.out.println(availableBook[book]);
        }
    }
}

public class Task4 {
    public static void main(String[] args) {
        // Library1 library = new Library1(); // Creating a Library object

        // // Adding some books
        // library.addBook("\"The Lord of the Rings\"");
        // library.showAvailableBooks();

        Library1 library = new Library1(); // Creating a Library object

        // Adding some books
        library.addBook("The Alchemist");
        library.addBook("The Catcher in the Rye");
        library.addBook("1984");

        // Showing available books
        System.out.println("Available books:");
        library.showAvailableBooks();

        // Issuing a book
        library.issueBook("The Alchemist");

        // Showing available books after issuing a book
        System.out.println("\nAvailable books after issuing a book:");
        library.showAvailableBooks();

        // Returning a book
        library.returnBook("The Alchemist");

        // Showing available books after returning a book
        System.out.println("\nAvailable books after returning a book:");
        library.showAvailableBooks();

    }
}