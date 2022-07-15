/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package hosbitaltest;


import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.assertArrayEquals;
import java.util.*;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Omar Zeneldin
 */
public class AppointmentclassTest {
    
    public AppointmentclassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of make_app method, of class Appointmentclass.
     */
       
    /*to check if the input data valid appintment will be accepted */ 
    
     @Test
    public void testMake_app() {
        System.out.println("make_app");
        int pid = 0;
        String did = "";
        String date = "";
        String time = "";
        Appointmentclass instance = new Appointmentclass();
        instance.make_app(pid, did, date, time);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void test1Make_app() {
        System.out.println("make_app");
        int pid = 2;
        String did = "1";
        String date = "2022-5-2";
        String time = "6";
        Appointmentclass instance = new Appointmentclass();
        instance.make_app(pid, did, date, time);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /*to check if the input data invalid(id's not found) appintment will not accepted */ 
    @Test
    public void test2Make_app() {
        System.out.println("make_app");
        int pid = 100;
        String did = "22";
        String date = "232";
        String time = "1212";
        Appointmentclass instance = new Appointmentclass();
        instance.make_app(pid, did, date, time);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of searchid_doctor method, of class Appointmentclass.
     */
    
    
    /*to check if the input data valid result will be shown */ 
    @Test
    public void test1Searchid_doctor() {
        System.out.println("searchid_doctor");
        String id = "2";
        Appointmentclass instance = new Appointmentclass();
        Vector<String[]> expResult = new Vector<>();
        expResult.add(new String[]{"2","4","23/6","2"});
        expResult.add(new String[]{"2","4","23/6","2"});
        //expResult.add(new String[]{"2","1","2022-5-1","5"});
        Vector<String[]> result = instance.searchid_doctor(id);
        //Collection.sort(expResult);
        assertEquals(result.size(), expResult.size());
        for(int i=0;i<result.size();i++)
        {
            System.out.println(result.get(i));
            assertArrayEquals(expResult.get(i), result.get(i));
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /*to check if the input data invalid result will not be shown */ 
    @Test
    public void test2Searchid_doctor() {
        System.out.println("searchid_doctor");
        String id = null;
        Appointmentclass instance = new Appointmentclass();
        Vector<String[]> expResult = new Vector<String[]>(0);
        Vector<String[]> result = instance.searchid_doctor(id);
        assertEquals(result.size(), expResult.size());
        for(int i=0;i<result.size();i++)
        {
            assertArrayEquals(expResult.get(i), result.get(i));
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    


    /**
     * Test of searchid_Patient method, of class Appointmentclass.
     */
    
    /*to check if the input data valid result will be shown */ 
    @Test
    public void test1Searchid_Patient() {
        System.out.println("searchid_Patient");
        int id = 3;
        Appointmentclass instance = new Appointmentclass();
        Vector<String[]> expResult = new Vector<String[]>();
        expResult.add(new String[]{"2","3","22/5","5"});
        //expResult.add(new String[]{"2","3","2022-5-1","5"});
        //expResult.add(new String[]{"2","3","2022-5-1","5"});
        Vector<String[]> result = instance.searchid_Patient(id);
        assertEquals(expResult.size(),result.size());
        for(int i=0;i<result.size();i++){
            assertArrayEquals(expResult.get(i), result.get(i));
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /*to check if the input data invalid(id not found) result will not be shown */ 
    @Test
    public void test2Searchid_Patient() {
        System.out.println("searchid_Patient");
        int id = 223;
        Appointmentclass instance = new Appointmentclass();
        Vector<String[]> expResult = new Vector<String[]>(0);
        Vector<String[]> result = instance.searchid_Patient(id);
        assertEquals(result.size(), expResult.size());
        for(int i=0;i<result.size();i++)
        {
            assertArrayEquals(expResult.get(i), result.get(i));
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
            /*@Test
              public void test3Searchid_Patient() {
                  System.out.println("searchid_Patient");
                  int id = 223;
                  Appointmentclass instance = new Appointmentclass();
                  Vector<String[]> expResult = new Vector<String[]>();
                  expResult.add(new String[]{"2","3","2022/5/1","5"});
                  //expResult.add(new String[]{"2","3","2022-5-1","5"});
                  Vector<String[]> result = instance.searchid_Patient(id);
                  assertEquals(result.size(), expResult.size());
                  for(int i=0;i<result.size();i++)
                  {
                      assertArrayEquals(expResult.get(i), result.get(i));
                  }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
*/
    
}
