
/**
 * This is the book class. The book class defines necessary methods such as to get the title of the book.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book{
    private String bookName;
    boolean borrowed;
    
    public Book(){
        this.bookName = "";
        this.borrowed = false;
    } // This is the constructor for the bookName
    
    public Book(String bookName){
        this.bookName = bookName;
    } //This is the overload constructor.
    
    public Book(boolean borrowed){
        this.borrowed = borrowed;
    } //This is the overload constructor.
    
    public void setBookName(String bookName){
        this.bookName = bookName;
    } //This is the mutator of the bookName.
    
    public String getBookName(){
        return this.bookName;
    } //This is the accessor for the bookName.
    
    public void setBorrowed(boolean borrowed){
        this.borrowed = borrowed;
    } //This is the mutator for borrowed.
    
    public boolean getBorrowed(){
        return this.borrowed;
    } //This is the accessor for borrowed.
    
    public void borrowed() {
		borrowed = true;
    }//Marks the book as borrowed.
    
    public void returned() {
		borrowed = false;
    }//Marks the book as not borrowed (returned)
    
    public boolean isBorrowed() {
		return borrowed;
    }//Returns true if the book is borrowed, false otherwise
}

    

