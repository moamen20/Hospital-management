/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package hosbitaltest;

import java.util.Vector;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.assertArrayEquals;
import java.util.*;
import java.util.Collections;


/**
 *
 * @author Helal
 */
public class MaindoctorTest {
    
    public MaindoctorTest() {
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
     * Test of Search_id method, of class Maindoctor.
     */
    @Test
    public void testSearch_id_Valid() {
        System.out.println("Search_id");
        String id = "2";
        Maindoctor instance = new Maindoctor();
        Vector<String[]> expResult = new Vector<String[]>();
        expResult.add(new String[]{"2","ahmd","all","123458"});
        Vector<String[]> result = instance.Search_id(id);
        assertEquals(result.size(), expResult.size());
        for(int i=0;i<result.size();i++)
        {
            assertArrayEquals(expResult.get(i), result.get(i));
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testSearch_id_notExist() {
        System.out.println("Search_id");
        String id = "212";
        Maindoctor instance = new Maindoctor();
        Vector<String[]> expResult = new Vector<String[]>(0);
        Vector<String[]> result = instance.Search_id(id);
        assertEquals(result.size(), expResult.size());
        for(int i=0;i<result.size();i++)
        {
            assertArrayEquals(expResult.get(i), result.get(i));
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Search_name method, of class Maindoctor.
     */
    @Test
    public void testSearch_name_valid() {
        System.out.println("Search_name");
        String name = "ahmd";
        Maindoctor instance = new Maindoctor();
        Vector<String[]> expResult = new Vector<String[]>();
        expResult.add(new String[] {"2","ahmd","all","123458"});
        Vector<String[]> result = instance.Search_name(name);
        assertEquals(expResult.size(),result.size());
        for(int i =0;i<result.size();i++)
        {
            assertArrayEquals(expResult.get(i), result.get(i));
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testSearch_name_notExist() {
        System.out.println("Search_name");
        String name = "";
        Maindoctor instance = new Maindoctor();
        Vector<String[]> expResult =  new Vector<String[]>(0);
        Vector<String[]> result = instance.Search_name(name);
        assertEquals(expResult.size(),result.size());
        for(int i =0;i<result.size();i++)
        {
            assertArrayEquals(expResult.get(i), result.get(i));
        }
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
  

    /**
     * Test of add method, of class Maindoctor.
     */
    @Test
    public void testAdd() {
        String id = "12";
        String name = "helal";
        String spec = "dentist";
        String email = "helohelo@helo.com";
        String tel = "010245256";
        Maindoctor instance = new Maindoctor();
        instance.add(id, name, spec, email, tel);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Maindoctor.
     */
    @Test
    public void testDelete() {
        String id = "22";
        Maindoctor instance = new Maindoctor();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Maindoctor.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String id = "4";
        String name = "helal";
        String spec = "dwa";
        String email = "sdawdas@saf.com";
        String tel = "01558545";
        Maindoctor instance = new Maindoctor();
        instance.update(id, name, spec, email, tel);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of login_doctor method, of class Maindoctor.
     */
    @Test
    public void testLogin_doctor() {
        System.out.println("login_doctor");
        String username = "ahmd";
        String passcode = "2";
        Maindoctor instance = new Maindoctor();
        instance.login_doctor(username, passcode);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
