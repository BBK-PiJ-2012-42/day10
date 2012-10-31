package day10;
/**
 *
 * @author Tom Nealon
 */
public class User {
/**    
 * User points to Library.
 * @param name the User name which must be unique within a library.
 * @param ID an integer also uniquely identifying the user within a library.
 * @param userLibrary a pointer to the Library the user is registered with.
*/            
    private String name;
    private int ID;
    private Library userLibrary;
    
    public User (String name) {
        /**
        * Sets User name only ID is not set by constructor.
        * 
        */
        this.name = name;
    }
    
    public String getName() {
        /**
        * Getter for User name.
        * @return the user name as a string.
        */
        return this.name;
    } 
    
    public int getID() {
        /**
        * Getter for User ID.
        * @return the user ID as an integer.
        */
        return ID;
    }
    
    public void setID(int ID) {
        /**
        * Setter for User ID.
        * 
        */
        this.ID = ID;
    }
    
    public void register(Library library) {
        this.userLibrary = library;
    }
    
    public Library getLibrary() {
        return userLibrary;
    }
}
