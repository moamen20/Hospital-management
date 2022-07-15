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
*/
import java.util.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author Waleed Ebrahem
 */
public class ExamineclassTest {
    
    public ExamineclassTest() {
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
     * Test of Save_examine method, of class Examineclass.
     */
    @Test
    public void testSave_examine() {
        System.out.println("Save_examine");
        int idp = 1;
        String idD = "3";
        String medc = "panadol";
        String state = "need rest";
        Examineclass instance = new Examineclass();
        instance.Save_examine(idp, idD, medc, state);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchid_Patient method, of class Examineclass.
     */
    @Test
    public void testSearchid_Patient_valid() {
        System.out.println("searchid_Patient");
        int id = 2;
        Examineclass instance = new Examineclass();
        Vector<String[]> expResult = new Vector<String[]>();
        expResult.add(new String[] {"1","2","panadol","good"});
        //expResult.add(new String[] {"2","MoeMen","32","momo@gamil","0sacpjaps"});
        //expResult.add(new String[] {"1","adasfa","4","heol@gamil","12121512"});
        Vector<String[]> result = instance.searchid_Patient(id);
        assertEquals(expResult.size(),result.size());
        for(int i =0;i<result.size();i++)
        {
            assertArrayEquals(expResult.get(i), result.get(i));
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
/**
     * Test of searchid_Patient method, of class Examineclass (invalid) case.
     */
    
     @Test
    public void testSearchid_Patient_notExist() {
        System.out.println("searchid_Patient");
        int id = 99;
        Examineclass instance = new Examineclass();
        Vector<String[]> expResult =new Vector<String[]>(0);
        Vector<String[]> result = instance.searchid_Patient(id);
        assertEquals(expResult.size(),result.size());
        for(int i =0;i<result.size();i++)
        {
            assertArrayEquals(expResult.get(i), result.get(i));
        }
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
        
    
    
    /**
     * Test of searchid_doctor method, of class Examineclass.
     */
    @Test
    public void testSearchid_doctor() {
        System.out.println("searchid_doctor");
        String id = "1";
        Examineclass instance = new Examineclass();
        Vector<String[]> expResult = new Vector<String[]>();
        expResult.add(new String[]{"1","2","panadol","good"});
        //expResult.add(new String[]{"5","afdaeas","dsgs","sadads","21561"});
       // expResult.add(new String[]{"2","dasda","all","cfxxczsa","dsafadsa"});
        Vector<String[]> result = instance.searchid_doctor(id);
        assertEquals(result.size(),expResult.size());
        for(int i =0;i< result.size();i++){
            assertArrayEquals(expResult.get(i), result.get(i));
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      /**
     * Test of searchid_doctor method, of class Examineclass (invalid) case.
     */
    @Test
    public void testSearchid_doctor_notExit() {
        System.out.println("searchid_doctor");
        String id = "5000000";
        Examineclass instance = new Examineclass();
        Vector<String[]> expResult = new Vector<String[]>(0);
        Vector<String[]> result = instance.searchid_doctor(id);
        assertEquals(expResult.size(),result.size());
        for(int i=0;i<result.size();i++){
            assertArrayEquals(expResult.get(i), result.get(i));
        }
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    
    
    
    /**
     * Test of show_state method, of class Examineclass.
     */
    @Test
    public void testShow_state() {
        System.out.println("show_state");
        int idstate = 2;
        Examineclass instance = new Examineclass();
        String expResult = "good";
        String result = instance.show_state(idstate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of show_state method, of class Examineclass (invalid) case.
     */
    @Test
    public void testShow_state_notExit() {
        System.out.println("show_state");
        int idstate = 5;
        Examineclass instance = new Examineclass();
        String expResult = null;
        String result = instance.show_state(idstate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
