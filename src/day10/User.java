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
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    } 
    
    public int getID() {
        return ID;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void register(Library library) {
        this.userLibrary = library;
    }
    
    public Library getLibrary() {
        return userLibrary;
    }
}
