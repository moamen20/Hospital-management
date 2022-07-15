/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package hosbitaltest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LENOVO
 */
public class ReceptionistTest {
    
    public ReceptionistTest() {
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
     * Test of add_user method, of class Receptionist.
     */
    
     @Test
    public void testAdd_user() {
        System.out.println("add_user");
        String name = "hassan";
        String code = "123";
        String tele = "014444";
        Receptionist instance = new Receptionist();
        instance.add_user(name, code, tele);
    }
    
    @Test
    public void testAdd_user_invalid1() {
        System.out.println("add_user");
        //Empty Fields 
        String name = "";
        String code = "";
        String tele = "";
        Receptionist instance = new Receptionist();
        instance.add_user(name, code, tele);
    }
    @Test
    public void testAdd_user_invalid2() {
        System.out.println("add_user");
        //Values don't follow constraints 
        String name = "";
        String code = "aaa";
        String tele = "aaa";
        Receptionist instance = new Receptionist();
        instance.add_user(name, code, tele);
    }
    @Test
    public void testAdd_user_invalid3() {
        System.out.println("add_user");
        //Empty Fields and values don't follow constraints
        String name = "1111";
        String code = "";
        String tele = "";
        Receptionist instance = new Receptionist();
        instance.add_user(name, code, tele);
    }
    /**
     * Test of login_user method, of class Receptionist.
     */
    @Test
    public void testLogin_user_valid() {
        System.out.println("login_user");
        String name = "MOAMEN";
        String code = "321";
        Receptionist instance = new Receptionist();
        instance.login_user(name, code);
        
    }
    @Test
    public void testLogin_user_invalid1() {
        System.out.println("login_user");
        //Name or passcode worng
        String name = "hmady";
        String code = "k1n1";
        Receptionist instance = new Receptionist();
        instance.login_user(name, code);
    }
    
    @Test
    public void testLogin_user_invalid2() {
        System.out.println("login_user");
        //Empty fields
        String name = "";
        String code = "";
        Receptionist instance = new Receptionist();
        instance.login_user(name, code);
        
    }
    
   
    
}
