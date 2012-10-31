/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day10;

/**
 *
 * @author tom
 */
public class User {
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
