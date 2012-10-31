package day10;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author tom
 */
public class UserTest {
    


    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        User instance = new User("Jim Brown");
        String expResult = "Jim Brown";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getID method, of class User.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        User instance = new User("Jim Brown");
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setID method, of class User.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        User instance = new User("Jim Brown");
        instance.setID(ID);
    }

    /**
     * Test of register method, of class User.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Library library = new Library();
        User instance = new User("Jim Brown");
        instance.register(library);
    }

    /**
     * Test of getLibrary method, of class User.
     */
    @Test
    public void testGetLibrary() {
        System.out.println("getLibrary");
        User instance = new User("Jim Brown");
        Library expResult = new Library();
        Library result = instance.getLibrary();
        assertEquals(expResult, result);
    }
}
