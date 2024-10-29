
/**
 * This is the library class where there all the object state and behaviors will be initialized.
 * The library class represents each library and the functions under them.
 * @author Esther Mosaku
 * @version 24th October, 2024.
 */

public class Library{
    private String address; //These are the instance variables needed for the program.
    private String openHours;
    private String bookName;
    private Book[] libraryBooks;
    private int numBooks;
    
    public Library(){
        this.address= "";
        this.openHours = "9 AM to 5 PM daily"; //All libraries have the same hours, so this has been set.
        this.libraryBooks= new Book[4];
        this.bookName = "";
        this.numBooks = 0;
    }
    
    public Library(String address){
        this.address = address;
        this.libraryBooks= new Book[4];
    } //This constructor includes only the address so that we can add a value to the string.
    
    public Library(String address,String openHours, String bookName, int numBooks){
        this.address = address;
        this.openHours = openHours;
        this.bookName = bookName;
        this.numBooks = numBooks;
        this.libraryBooks= new Book[4];
    }
    
    public Library(Library libraryBooks){
        this.libraryBooks = new Book[4];
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setOpenHours(String openHours){
        this.openHours = openHours;
    }
    
    public String getOpenHours(){
        return this.openHours;
    }
    
    public void setBookName(String bookName){
        this.bookName= bookName;
    }
    
    public String getBookName(){
        return this.bookName;
    }
    
    public void setnumBooks(int numBooks){
        this.numBooks= numBooks;
    }
    
    public int getnumBooks(){
        return this.numBooks;
    }
    
     
    public void addBook(Book book) {
        libraryBooks[numBooks] = book;
        numBooks++;
    } // This allows the user to add books to the system and sets up the method to add books in the main class.
    
    public static String openHours() {
        return "9 AM to 5 PM";
    } //This returns 9am to 5pm as the daily open hours.
    
    public void printAddresses(){
         System.out.println("The address is: "+this.address);
    } //Allows the user to print the different addresses of the library.
    
    
    public void borrowBook(String bookName){
        for(int i = 0; i<numBooks; i++){
        if(libraryBooks[i].getBookName().equals(bookName)){
            if(libraryBooks[i].isBorrowed()){
                    System.out.println("So sorry. This book has been borrowed.");
                    return;
                }
            else{
                System.out.println("You have successfully borrowed "+bookName);
                libraryBooks[i].borrowed();
                libraryBooks[i].borrowed = true;
                return;
            }
        }//This allows the user of the ERS borrow the book.
        }
    }
    
    
    public void returnBook(String bookName){
        for(int i = 0; i<numBooks; i++){
           if (libraryBooks[i].getBookName().equals(bookName)) { 
            if(libraryBooks[i].isBorrowed()) {
           System.out.println("You successfully returned " + bookName);
           libraryBooks[i].returned();
           return;
        }
        else {
           System.out.println("This book was not borrowed.");
           return;
            }
        }//Adds the book back to the system.
        }
    }
    
    public void printAvailableBooks() {
        if(numBooks == 0){
        System.out.println("No book in the System.");
        } //This prints out the available books in the system with the instance that if there is the number of books = 0, it means there is no book in the system.
       
        for(int i=0; i<numBooks; i++){
        if(!libraryBooks[i].isBorrowed()){
            System.out.println(libraryBooks[i].getBookName());
        }            
        } //This gets all the books that are in the system including the book that has been returned.
    }
} 

        
    

