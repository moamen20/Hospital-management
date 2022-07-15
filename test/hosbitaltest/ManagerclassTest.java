/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package hosbitaltest;
/*
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
*/
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.assertArrayEquals;
import java.util.*;
import java.util.Collections;

/**
 *
 * @author Waleed Ebrahem
 */
public class ManagerclassTest {
    
    public ManagerclassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
         connect c=new connect();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    

    /**
     * Test of add_user method, of class Managerclass.
     */
    @Test
    public void testAdd_user() {
        System.out.println("add_user");
        String name = "MO";
        String code = "498489";
        String tele = "48465";
        Managerclass instance = new Managerclass();
        instance.add_user(name, code, tele);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of login_user method, of class Managerclass.
     */
    @Test
    public void testLogin_user__valid() {
        System.out.println("login_user");
        String name = "MOAMEN";
        String code = "1234";
        Managerclass instance = new Managerclass();
        instance.login_user(name, code);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     /**
     * Test of login_user method, of class Managerclass (invalid) case.
     */
    @Test
    public void testLogin_user__notExit() {
        System.out.println("login_user");
        String name = "hhhhh";
        String code = "4124846162321";
        Managerclass instance = new Managerclass();
        instance.login_user(name, code);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
