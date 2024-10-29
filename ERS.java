/**
 * This program is a new Electronic Rental System(ERS) for the libraries in Tacoma. The ERS allows users to perform series of functions including print, borrow, and return books.
 * This is the ERS Class. The ERS Class implements the main method that stimulates the usage of the ERS system.
 * @author Esther Mosaku
 * @version 24th October, 2024.
 */
public class ERS{
    public static void main(String[] args){
        welcome();

        //Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
        
        //Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        
        //Print opening hours and addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println("Library addresses:");
        firstLibrary.printAddresses();
        secondLibrary.printAddresses();
        System.out.println();
        
        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings: ");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
        
        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
        
        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();
        
        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
    
    public static void printOpeningHours(){
        System.out.println("Both libraries are opened: "+Library.openHours()+" daily.");
    } //The method for the opening hours of the library.
    
    public static void welcome(){
        System.out.println("Welcome to the new Electronic Rental System(ERS) built for the libraries in Tacoma.");
        System.out.println("The ERS performs series of functions such as print, borrow, and return available books.");
    } //This is the welcome method.
}
