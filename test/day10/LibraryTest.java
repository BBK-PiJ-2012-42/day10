package day10;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author tom
 */
public class LibraryTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of getID method, of class Library.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Library instance = new Library();
        int expResult = 13;
        int result = instance.getID();
        assertEquals(expResult, result);
    }
}
