package day10;
/**
 *
 * @author Tom Nealon
 */
public class Book {
/**    
 * User points to Library.
 * @param title the title of the book.
 * @param ID an integer uniquely identifying the book within a library.
 * 
*/    
    public final String title;
    public final String author;
    
    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }
}
